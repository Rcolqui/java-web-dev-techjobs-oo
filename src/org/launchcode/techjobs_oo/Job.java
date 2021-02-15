package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        if (this.name == ""
                && this.employer.getValue() == ""
                && this.location.getValue() == ""
                && this.positionType.getValue() == ""
                && this.coreCompetency.getValue() == ""
                || this.name == null
                && this.employer == null
                && this.location == null
                && this.positionType == null
                && this.coreCompetency == null) {

            return "OOPS! This job does not seem to exist.";
        }
        if (this.name == "") {
            return "\n" + "ID: " + id +
                    "\n" + "Name: Data not available" +
                    "\n" + "Employer: " + employer +
                    "\n" + "Location: " + location +
                    "\n" + "Position Type: " + positionType +
                    "\n" + "Core Competency: " + coreCompetency +
                    "\n";
        }
        if (this.employer.getValue() == "") {
            return "\n" + "ID: " + id +
                    "\n" + "Name: " + name +
                    "\n" + "Employer: Data not available" +
                    "\n" + "Location: " + location +
                    "\n" + "Position Type: " + positionType +
                    "\n" + "Core Competency: " + coreCompetency +
                    "\n";
        }
        if (this.location.getValue() == "") {
            return "\n" + "ID: " + id +
                    "\n" + "Name: " + name +
                    "\n" + "Employer: " + employer +
                    "\n" + "Location: Data not available" +
                    "\n" + "Position Type: " + positionType +
                    "\n" + "Core Competency: " + coreCompetency +
                    "\n";
        }
        if (this.positionType.getValue() == "") {
            return "\n" + "ID: " + id +
                    "\n" + "Name: " + name +
                    "\n" + "Employer: " + employer +
                    "\n" + "Location: " + location +
                    "\n" + "Position Type: Data not available" +
                    "\n" + "Core Competency: " + coreCompetency +
                    "\n";
        }
        if (this.coreCompetency.getValue() == "") {
            return "\n" + "ID: " + id +
                    "\n" + "Name: " + name +
                    "\n" + "Employer: " + employer +
                    "\n" + "Location: " + location +
                    "\n" + "Position Type: " + positionType +
                    "\n" + "Core Competency: Data not available" +
                    "\n";
        }

        return "\n" + "ID: " + id +
                "\n" + "Name: " + name +
                "\n" + "Employer: " + employer +
                "\n" + "Location: " + location +
                "\n" + "Position Type: " + positionType +
                "\n" + "Core Competency: " + coreCompetency +
                "\n";

    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public Employer getEmployer () {
        return employer;
    }

    public void setEmployer (Employer employer){
        this.employer = employer;
    }

    public Location getLocation () {
        return location;
    }

    public void setLocation (Location location){
        this.location = location;
    }

    public PositionType getPositionType () {
        return positionType;
    }

    public void setPositionType (PositionType positionType){
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency () {
        return coreCompetency;
    }

    public void setCoreCompetency (CoreCompetency coreCompetency){
        this.coreCompetency = coreCompetency;
    }

    public static void main (String[]args){
        Job jobOne = new Job();
        Job jobFour = new Job("Product tester",new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(jobFour.toString());
        System.out.println(jobOne.toString());
    }


}



