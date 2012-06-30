package com.smorg.backend;

import com.google.appengine.api.datastore.Key;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "smUser") //Name of the entity
public class smUser {

	    @Id public Key userid; //smorg user primary key

	    private String goal;

	    private String task;

	    private String event;

	    
//@Column By default column name is same as attribute name
	    
	    public Key getKey() {
	        return userid;
	    }

	    //Set-Get User's Goals
	    public String getgoal() {
	        return goal;
	    } 
	    public void setgoal(String goal) {
	        this.goal = goal;
	    } 

	    //Set-Get User's Tasks
	    public String gettask() {
	        return task;
	    } 
	    public void settaske(String task) {
	        this.task = task;
	    } 

	    //Set-Get User's Events
	    public String getevent() {
	        return event;
	    } 
	    public void setHireDate(String event) {
	        this.event = event;
	    } 
	
	
}
