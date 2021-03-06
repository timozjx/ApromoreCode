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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.03 at 05:04:23 PM CET 
//

package org.yawlfoundation.yawlschema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for YAWLSpecificationFactsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="YAWLSpecificationFactsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.yawlfoundation.org/yawlschema}SpecificationType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}NameType" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.yawlfoundation.org/yawlschema}DocumentationType" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://www.yawlfoundation.org/yawlschema}MetaDataType"/>
 *         &lt;any/>
 *         &lt;element name="decomposition" type="{http://www.yawlfoundation.org/yawlschema}DecompositionType" maxOccurs="unbounded"/>
 *         &lt;element name="importedNet" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YAWLSpecificationFactsType", propOrder = { "name",
		"documentation", "metaData", "any", "decomposition", "importedNet" })
public class YAWLSpecificationFactsType extends SpecificationType {

	protected String name;
	protected String documentation;
	@XmlElement(required = true)
	protected MetaDataType metaData;
	@XmlAnyElement(lax = true)
	protected Object any;
	@XmlElement(required = true)
	protected List<DecompositionType> decomposition;
	@XmlSchemaType(name = "anyURI")
	protected List<String> importedNet;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the documentation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * Sets the value of the documentation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocumentation(String value) {
		this.documentation = value;
	}

	/**
	 * Gets the value of the metaData property.
	 * 
	 * @return possible object is {@link MetaDataType }
	 * 
	 */
	public MetaDataType getMetaData() {
		return metaData;
	}

	/**
	 * Sets the value of the metaData property.
	 * 
	 * @param value
	 *            allowed object is {@link MetaDataType }
	 * 
	 */
	public void setMetaData(MetaDataType value) {
		this.metaData = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * @return possible object is {@link Element } {@link Object }
	 * 
	 */
	public Object getAny() {
		return any;
	}

	/**
	 * Sets the value of the any property.
	 * 
	 * @param value
	 *            allowed object is {@link Element } {@link Object }
	 * 
	 */
	public void setAny(Object value) {
		this.any = value;
	}

	/**
	 * Gets the value of the decomposition property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the decomposition property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDecomposition().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DecompositionType }
	 * 
	 * 
	 */
	public List<DecompositionType> getDecomposition() {
		if (decomposition == null) {
			decomposition = new ArrayList<DecompositionType>();
		}
		return this.decomposition;
	}

	/**
	 * Gets the value of the importedNet property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the importedNet property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getImportedNet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getImportedNet() {
		if (importedNet == null) {
			importedNet = new ArrayList<String>();
		}
		return this.importedNet;
	}

}
