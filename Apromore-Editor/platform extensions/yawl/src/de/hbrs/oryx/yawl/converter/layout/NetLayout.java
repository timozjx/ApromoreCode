/**
 * Copyright (c) 2011-2012 Felix Mannhardt, felix.mannhardt@smail.wir.h-brs.de
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * See: http://www.gnu.org/licenses/lgpl-3.0
 * 
 */
package de.hbrs.oryx.yawl.converter.layout;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.oryxeditor.server.diagram.Bounds;
import org.yawlfoundation.yawl.elements.YFlow;

/**
 * Layout information of a YAWL Net/Subnet and its elements
 * 
 * @author Felix Mannhardt (Bonn-Rhein-Sieg University of Applied Sciences)
 * 
 */
public class NetLayout {

	/**
	 * Map of VertexID <-> LayoutInformation for Vertex (e.g. Task or Condition)
	 */
	private Map<String, NetElementLayout> vertexLayoutMap;

	/**
	 * Map of "Prior Vertex ID"|"Next Vertex ID" <-> LayoutInformation for Flow
	 */
	private Map<String, FlowLayout> flowLayoutMap;

	/**
	 * Bounds of the Net itself
	 */
	private Bounds bounds;

	/**
	 * Set of all flows (edges) between the YAWL elements of this net. TODO:
	 * This is not a layout information, so maybe store it elsewhere!
	 */
	private final Set<YFlow> flowSet;

	public NetLayout(Bounds bounds) {
		super();
		this.bounds = bounds;
		this.vertexLayoutMap = new HashMap<String, NetElementLayout>();
		this.flowLayoutMap = new HashMap<String, FlowLayout>();
		this.flowSet = new HashSet<YFlow>();
	}

	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}

	public Bounds getBounds() {
		return bounds;
	}

	public void putVertexLayout(String vertexID, NetElementLayout value) {
		vertexLayoutMap.put(vertexID, value);
	}

	public NetElementLayout getVertexLayout(String vertexID) {
		return vertexLayoutMap.get(vertexID);
	}

	public void putFlowLayout(String flowID, FlowLayout value) {
		flowLayoutMap.put(flowID, value);
	}

	public FlowLayout getFlowLayout(String flowID) {
		return flowLayoutMap.get(flowID);
	}

	public Set<YFlow> getFlowSet() {
		return flowSet;
	}

	public void addFlows(Set<YFlow> flows) {
		flowSet.addAll(flows);

	}

}