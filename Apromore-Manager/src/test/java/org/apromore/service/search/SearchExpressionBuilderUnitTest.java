/*
 * Copyright © 2009-2017 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.service.search;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test the Search Expression builder.
 *
 * @author <a href="mailto:cam.james@gmail.com">Cameron James</a>
 */
public class SearchExpressionBuilderUnitTest {

    private static final String SEARCH_EXPRESSION_SINGLE = " p.id in (select k.processId FROM Keywords k WHERE k.value like '%invoicing%' )";
    private static final String SEARCH_EXPRESSION_OR = " (  p.id in (select k.processId FROM Keywords k WHERE k.value like '%yawl%' ) or  p.id in (select k.processId FROM Keywords k WHERE k.value like '%protos%' ) ) ";
    private static final String SEARCH_EXPRESSION_AND = " p.id in (select k.processId FROM Keywords k WHERE k.value like '%yawl%' ) and  p.id in (select k.processId FROM Keywords k WHERE k.value like '%protos%' )";
    private static final String SEARCH_EXPRESSION_AND_OR = " (  p.id in (select k.processId FROM Keywords k WHERE k.value like '%yawl%' ) or  p.id in (select k.processId FROM Keywords k WHERE k.value like '%protos%' ) )  and  p.id in (select k.processId FROM Keywords k WHERE k.value like '%invoicing%' )";
    private static final String SEARCH_EXPRESSION_APOSTROPHE = " p.id in (select k.processId FROM Keywords k WHERE k.value like '%''apostrophe''%' )";
    private static final String SEARCH_EXPRESSION_2APOSTROPHE = " p.id in (select k.processId FROM Keywords k WHERE k.value like '%double''''apostrophe%' )";
    private static final String SEARCH_EXPRESSION_BACKSLASH = " p.id in (select k.processId FROM Keywords k WHERE k.value like '%\\backslash\\%' )";
    
    private String expression;
    private SearchExpressionBuilder seb;
   
    
    @Before
    public void setup() {
        seb = new SearchExpressionBuilder();
    }

    @Test
    public void buildExpressionWithEmptyNullString() throws Exception {
        expression = seb.buildSearchConditions("");
        assertThat(expression, equalTo(""));

        expression = seb.buildSearchConditions(null);
        assertThat(expression, equalTo(""));

        expression = seb.buildSearchConditions(" ");
        assertThat(expression, equalTo(""));
    }


    @Test
    public void buildExpressionWithRealData() throws Exception {
        expression = seb.buildSearchConditions("invoicing");
        assertThat(expression, containsString("k.value like '%invoicing%'"));
        assertThat(expression, equalTo(SEARCH_EXPRESSION_SINGLE));

        expression = seb.buildSearchConditions("(yawl;protos)");
        System.err.println(expression);
        assertThat(expression, containsString("'%yawl%'"));
        assertThat(expression, containsString("'%protos%'"));
        assertThat(expression, equalTo(SEARCH_EXPRESSION_OR));

        expression = seb.buildSearchConditions("yawl,protos");
        assertThat(expression, equalTo(SEARCH_EXPRESSION_AND));

        expression = seb.buildSearchConditions("(yawl;protos),invoicing");
        assertThat(expression, equalTo(SEARCH_EXPRESSION_AND_OR));

        expression = seb.buildSearchConditions("'apostrophe'");
        assertThat(expression, equalTo(SEARCH_EXPRESSION_APOSTROPHE));

        expression = seb.buildSearchConditions("double''apostrophe");
        assertThat(expression, equalTo(SEARCH_EXPRESSION_2APOSTROPHE));

        expression = seb.buildSearchConditions("\\backslash\\");
        assertThat(expression, equalTo(SEARCH_EXPRESSION_BACKSLASH));
    }
}
