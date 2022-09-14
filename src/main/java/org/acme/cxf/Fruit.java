package org.acme.cxf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

@XmlType(name = "Fruit")
@XmlRootElement
public class Fruit {

    private String name;

    private String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fruit other)) {
            return false;
        }

        return Objects.equals(other.getName(), this.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
}
