package org.test;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Welcome extends Base implements Serializable {

    @Persistent
    private String name;

    public Welcome() {
    }

    public Welcome(String name) {
        this.name = name;
    }
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
