/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tycs;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@XmlRootElement
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empname;
    private String empdept;
    private int yoe;

    /**
     * Get the value of yoe
     *
     * @return the value of yoe
     */
    public int getYoe() {
        return yoe;
    }

    /**
     * Set the value of yoe
     *
     * @param yoe new value of yoe
     */
    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    /**
     * Get the value of empdept
     *
     * @return the value of empdept
     */
    public String getEmpdept() {
        return empdept;
    }

    /**
     * Set the value of empdept
     *
     * @param empdept new value of empdept
     */
    public void setEmpdept(String empdept) {
        this.empdept = empdept;
    }


    /**
     * Get the value of empname
     *
     * @return the value of empname
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * Set the value of empname
     *
     * @param empname new value of empname
     */
    public void setEmpname(String empname) {
        this.empname = empname;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tycs.Employee[ id=" + id + " ]";
    }
    
}
