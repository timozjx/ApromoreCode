//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.22 at 03:58:11 PM EST 
//


package org.wfmc._2008.xpdl2;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskService"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskReceive"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskManual"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskReference"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskScript"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskSend"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskUser"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}TaskApplication"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taskService",
    "taskReceive",
    "taskManual",
    "taskReference",
    "taskScript",
    "taskSend",
    "taskUser",
    "taskApplication"
})
@XmlRootElement(name = "Task")
public class Task {

    @XmlElement(name = "TaskService")
    protected TaskService taskService;
    @XmlElement(name = "TaskReceive")
    protected TaskReceive taskReceive;
    @XmlElement(name = "TaskManual")
    protected TaskManual taskManual;
    @XmlElement(name = "TaskReference")
    protected TaskReference taskReference;
    @XmlElement(name = "TaskScript")
    protected TaskScript taskScript;
    @XmlElement(name = "TaskSend")
    protected TaskSend taskSend;
    @XmlElement(name = "TaskUser")
    protected TaskUser taskUser;
    @XmlElement(name = "TaskApplication")
    protected TaskApplication taskApplication;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * BPMN: TaskType = Service.  In BPMN generally signifies any automated activity.
     * 
     * @return
     *     possible object is
     *     {@link TaskService }
     *     
     */
    public TaskService getTaskService() {
        return taskService;
    }

    /**
     * Sets the value of the taskService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskService }
     *     
     */
    public void setTaskService(TaskService value) {
        this.taskService = value;
    }

    /**
     * BPMN: TaskType = Receive.  Waits for a message, then continues. Equivalent to a "catching" message event.  In BPMN, "message" generally signifies any signal from outside the process (pool).
     * 
     * @return
     *     possible object is
     *     {@link TaskReceive }
     *     
     */
    public TaskReceive getTaskReceive() {
        return taskReceive;
    }

    /**
     * Sets the value of the taskReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReceive }
     *     
     */
    public void setTaskReceive(TaskReceive value) {
        this.taskReceive = value;
    }

    /**
     * BPMN: TaskType = Manual.  Used for human tasks other than those accessed via workflow.
     * 
     * @return
     *     possible object is
     *     {@link TaskManual }
     *     
     */
    public TaskManual getTaskManual() {
        return taskManual;
    }

    /**
     * Sets the value of the taskManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskManual }
     *     
     */
    public void setTaskManual(TaskManual value) {
        this.taskManual = value;
    }

    /**
     * BPMN: TaskType = Reference.  Task properties defined in referenced activity.
     * 
     * @return
     *     possible object is
     *     {@link TaskReference }
     *     
     */
    public TaskReference getTaskReference() {
        return taskReference;
    }

    /**
     * Sets the value of the taskReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReference }
     *     
     */
    public void setTaskReference(TaskReference value) {
        this.taskReference = value;
    }

    /**
     * BPMN: TaskType = Script.  Used for automated tasks executed by scripts on process engine, to distinguish from automated tasks performed externally (Service).
     * 
     * @return
     *     possible object is
     *     {@link TaskScript }
     *     
     */
    public TaskScript getTaskScript() {
        return taskScript;
    }

    /**
     * Sets the value of the taskScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskScript }
     *     
     */
    public void setTaskScript(TaskScript value) {
        this.taskScript = value;
    }

    /**
     * BPMN: Task Type = Send.  Equivalent to a "throwing" message event.  Sends a message immediately and continues.  In BPMN, "message" signifies any signal sent outside the process (pool).
     * 
     * @return
     *     possible object is
     *     {@link TaskSend }
     *     
     */
    public TaskSend getTaskSend() {
        return taskSend;
    }

    /**
     * Sets the value of the taskSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSend }
     *     
     */
    public void setTaskSend(TaskSend value) {
        this.taskSend = value;
    }

    /**
     * BPMN: Task Type = User.  Generally used for human tasks.  
     * 
     * @return
     *     possible object is
     *     {@link TaskUser }
     *     
     */
    public TaskUser getTaskUser() {
        return taskUser;
    }

    /**
     * Sets the value of the taskUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskUser }
     *     
     */
    public void setTaskUser(TaskUser value) {
        this.taskUser = value;
    }

    /**
     * Gets the value of the taskApplication property.
     * 
     * @return
     *     possible object is
     *     {@link TaskApplication }
     *     
     */
    public TaskApplication getTaskApplication() {
        return taskApplication;
    }

    /**
     * Sets the value of the taskApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskApplication }
     *     
     */
    public void setTaskApplication(TaskApplication value) {
        this.taskApplication = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
