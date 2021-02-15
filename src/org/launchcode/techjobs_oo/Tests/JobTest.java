package org.launchcode.techjobs_oo.Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne = new Job();
    Job jobTwo = new Job();
    Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Test
    public void testSettingJobId() {
        assertEquals(jobTwo.getId(), jobOne.getId() + 1, .001);
    }



    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(jobThree.getName(), "Product tester");
        assertTrue(jobThree.getName() instanceof String);

        assertEquals(jobThree.getEmployer().getValue(), "ACME");
        assertTrue(jobThree.getEmployer() instanceof Employer);

        assertEquals(jobThree.getLocation().getValue(), "Desert");
        assertTrue(jobThree.getLocation() instanceof Location);

        assertEquals(jobThree.getPositionType().getValue(), "Quality control");
        assertTrue(jobThree.getPositionType() instanceof PositionType);

        assertEquals(jobThree.getCoreCompetency().getValue(), "Persistence");
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(jobThree.getId(), jobTwo.getId() + 1);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(jobThree.equals(jobFour));

    }

    @Test
    public void testToStringStartsAndEndsWithBlankLine() {
        assertTrue(jobFour.toString().startsWith("\n"));
        assertTrue(jobFour.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsLabelAndDataForNameField() {
        assertTrue(jobFour.toString().contains("Name: Product tester"));
    }

    @Test
    public void testToStringContainsLabelAndDataForEmployerField() {
        assertTrue(jobFour.toString().contains("Employer: ACME"));
    }

    @Test
    public void testToStringContainsLabelAndDataForLocationField() {
        assertTrue(jobFour.toString().contains("Location: Desert"));
    }

    @Test
    public void testToStringContainsLabelAndDataForPositionTypeField() {
        assertTrue(jobFour.toString().contains("Position Type: Quality control"));
    }

    @Test
    public void testToStringContainsLabelAndDataForCoreCompetencyField() {
        assertTrue(jobFour.toString().contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringAddsDataNotAvailableToEmptyNameField() {
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString().contains("Name: Data not available"));
    }

    @Test
    public void testToStringAddsDataNotAvailableToEmptyEmployerField() {
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString().contains("Employer: Data not available"));
    }

    @Test
    public void testToStringAddsDataNotAvailableToEmptyLocationField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString().contains("Location: Data not available"));
    }

    @Test
    public void testToStringAddsDataNotAvailableToEmptyPositionTypeField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertTrue(job.toString().contains("Position Type: Data not available"));
    }

    @Test
    public void testToStringAddsDataNotAvailableToEmptyCoreCompetencyField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertTrue(job.toString().contains("Core Competency: Data not available"));
    }

    @Test
    public void testToStringReturnsJobDoesNotExistForEmptyJob() {
        assertTrue(jobOne.toString().contains("OOPS! This job does not seem to exist."));
    }

}
