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

package org.apromore.plugin.deployment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.apromore.plugin.deployment.provider.impl.DeploymentPluginProviderImpl;
import org.apromore.plugin.exception.PluginNotFoundException;
import org.junit.Before;
import org.junit.Test;

public class DeploymentPluginProviderUnitTest {

    private DeploymentPluginProviderImpl provider;
    private MockDeploymentPlugin mockPlugin;

    @Before
    public void setUp() {
        final DeploymentPluginProviderImpl dp = new DeploymentPluginProviderImpl();
        final Set<DeploymentPlugin> deploymentPluginSet = new HashSet<DeploymentPlugin>();
        mockPlugin = new MockDeploymentPlugin();
        deploymentPluginSet.add(mockPlugin);
        dp.setDeploymentPluginSet(deploymentPluginSet);
        this.provider = dp;
    }

    @Test
    public void testListAll() {
        assertNotNull(provider.listAll());
        assertFalse(provider.listAll().isEmpty());
    }

    @Test
    public void testFindByNativeTypeAndNameAndVersion() throws PluginNotFoundException {
        assertNotNull(provider.findByNativeTypeAndNameAndVersion("YAWL 2.2","test","1.0"));
        try {
            provider.findByNativeTypeAndNameAndVersion("YAWL 2.2","invalid","1.0");
            fail();
          } catch (PluginNotFoundException e) {
          }
    }

    @Test
    public void testFindByNativeType() throws PluginNotFoundException {
        assertNotNull(provider.findByNativeType("YAWL 2.2"));
        try {
          provider.findByNativeType("invalid");
          fail();
        } catch (PluginNotFoundException e) {
        }
    }

    @Test
    public void testListByNativeType() {
        assertNotNull(provider.listByNativeType("YAWL 2.2"));
        assertNotNull(provider.listAll());
        assertTrue(provider.listByNativeType("YAWL 2.2").size() == 1);
        assertTrue(provider.listAll().size() == 1);
    }



}
