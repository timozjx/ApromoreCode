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

package org.apromore.plugin.portal.predictivemonitor;

// Java 2 Standard Edition
import java.io.File;
import java.util.Locale;

// Java 2 Enterprise Edition
import javax.inject.Inject;
import javax.inject.Named;

// Third party packages
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.zkoss.zul.Messagebox;

// Local packages
import org.apromore.plugin.portal.DefaultPortalPlugin;
import org.apromore.plugin.portal.PortalContext;
import org.apromore.service.EventLogService;

@Component("plugin")
public class PredictiveMonitorPlugin extends DefaultPortalPlugin {

    private static Logger LOGGER = LoggerFactory.getLogger(PredictiveMonitorPlugin.class.getCanonicalName());

    private String label = "Predictively Monitor Log";
    private String groupLabel = "Monitor";

    @Inject private EventLogService eventLogService;
    @Inject @Named("kafkaHost") private String kafkaHost;
    @Inject @Named("nirdizatiPath") private File nirdizatiPath;
    @Inject @Named("pythonPath") private String pythonPath;

    @Override
    public String getLabel(Locale locale) {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String getGroupLabel(Locale locale) {
        return groupLabel;
    }

    public void setGroupLabel(String groupLabel) {
        this.groupLabel = groupLabel;
    }

    @Override
    public void execute(PortalContext portalContext) {
        try {
            new DataflowsController(portalContext, eventLogService, kafkaHost, nirdizatiPath, pythonPath);

        } catch (Throwable e) {
            LOGGER.error("portalContext: " + portalContext + "  eventLogService: " + eventLogService + "  kafkaHost: " + kafkaHost + "  pythonPath: " + pythonPath, e);
            Messagebox.show("Unable to display setup window", "Attention", Messagebox.OK, Messagebox.ERROR);
        }
    }
}
