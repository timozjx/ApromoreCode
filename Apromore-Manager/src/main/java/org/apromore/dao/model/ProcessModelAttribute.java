package org.apromore.dao.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheCoordinationType;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * ProcessModelAttribute generated by hbm2java
 */
@Entity
@Table(name = "process_model_attribute")
@Configurable("processModelAttribute")
@Cache(expiry = 180000, size = 1000, coordinationType = CacheCoordinationType.INVALIDATE_CHANGED_OBJECTS)
public class ProcessModelAttribute implements java.io.Serializable {

    private Integer id;
    private String name;
    private String value;
    private String any;

    private ProcessModelVersion processModelVersion;

    /**
     * Public Constructor.
     */
    public ProcessModelAttribute() {
    }



    /**
     * returns the Id of this Object.
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    /**
     * Sets the Id of this Object
     * @param id the new Id.
     */
    public void setId(final Integer id) {
        this.id = id;
    }



    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "any")
    public String getAny() {
        return this.any;
    }

    public void setAny(String any) {
        this.any = any;
    }


    @ManyToOne
    @JoinColumn(name = "processModelVersionId")
    public ProcessModelVersion getProcessModelVersion() {
        return this.processModelVersion;
    }

    public void setProcessModelVersion(ProcessModelVersion processModelVersion) {
        this.processModelVersion = processModelVersion;
    }

}


