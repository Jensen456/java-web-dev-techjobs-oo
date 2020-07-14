package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

//import java.util.Asserts.*;

public class JobTest {

    Employer myEmployer = new Employer("LaunchCode");
    Location myLocation = new Location();
    PositionType myPositionType = new PositionType();
    CoreCompetency myCoreCompetency = new CoreCompetency();
    Job myJob = new Job("my first job", myEmployer, myLocation, myPositionType, myCoreCompetency);


    @Test
    public void isIdCorrect() {
        Assert.assertEquals(1, myJob.getId(), .001);
    }

    @Test
    public void isToStringGood() {
        Assert.assertEquals ("my first job", myJob.toString());
    }
}
/*
this.name = name;
this.employer = employer;
this.location = location;
this.positionType = positionType;
this.coreCompetency = coreCompetency;
 */