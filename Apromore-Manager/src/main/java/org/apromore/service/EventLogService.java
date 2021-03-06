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

package org.apromore.service;

import org.apromore.dao.model.*;
import org.apromore.exception.*;
import org.apromore.model.ExportLogResultType;
import org.apromore.model.SummariesType;
import org.deckfour.xes.model.XLog;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Interface for the Process Service. Defines all the methods that will do the majority of the work for
 * the Apromore application.
 *
 * @author <a href="mailto:cam.james@gmail.com">Cameron James</a>
 */
public interface EventLogService {

    /**
     * Loads all the process Summaries. It will either get all or use the keywords parameter
     * to load a subset of the processes.
     * @param folderId the folder we are currently in.
     * @param searchExpression the search expression to limit the search.
     * @return The ProcessSummariesType used for Webservices.
     */
    SummariesType readLogSummaries(final Integer folderId, final String searchExpression);

    /**
     * Import a Process.
     *
     * @param username      The user doing the importing.
     * @param folderId      The folder we are saving the process in.
     * @param logName       the name of the process being imported.
     * @param domain        the domain of the model
     * @param created       the time created
     * @param publicModel   is this a public model?
     * @return the processSummaryType
     * @throws ImportException if the import process failed for any reason.
     *
     */
    Log importLog(String username, Integer folderId, String logName, InputStream log, String extension,
                  String domain, String created, boolean publicModel)
            throws Exception;

    ExportLogResultType exportLog(Integer logId)
            throws Exception;

    XLog getXLog(Integer logId);

    void deleteLogs(List<Log> logs) throws Exception;

    void exportToStream(OutputStream outputStream, XLog log) throws Exception;


}
