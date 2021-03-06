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

package org.apromore.service.impl;

import org.apromore.dao.ProcessRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.expect;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.powermock.api.easymock.PowerMock.createMock;
import static org.powermock.api.easymock.PowerMock.replay;
import static org.powermock.api.easymock.PowerMock.verify;

/**
 * Unit test the UserService Implementation.
 *
 * @author <a href="mailto:cam.james@gmail.com">Cameron James</a>
 */
public class DomainServiceImplUnitTest {

    private DomainServiceImpl domainServiceImpl;
    private ProcessRepository procDAOJpa;


    @Before
    public final void setUp() throws Exception {
        procDAOJpa = createMock(ProcessRepository.class);
        domainServiceImpl = new DomainServiceImpl(procDAOJpa);
    }

    @Test
    public void getAllDomains() {
        List<String> processes = new ArrayList<String>();
        processes.add("test1");
        processes.add("test2");

        expect(procDAOJpa.getAllDomains()).andReturn(processes);
        replay(procDAOJpa);

        List<String> serviceProcesses = domainServiceImpl.findAllDomains();
        verify(procDAOJpa);
        assertThat(serviceProcesses.size(), equalTo(processes.size()));
        assertThat(serviceProcesses.get(0), equalTo(processes.get(0)));
    }
}
