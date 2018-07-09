package ac.cr.ucenfotec.workflowengine.modelstest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import ac.cr.ucenfotec.workflowengine.models.form.Form;
import ac.cr.ucenfotec.workflowengine.models.form.FormData;
import ac.cr.ucenfotec.workflowengine.models.form.FormElementListValue;
import ac.cr.ucenfotec.workflowengine.models.form.FormElementType;
import ac.cr.ucenfotec.workflowengine.models.workflow.User;

@RunWith(Parameterized.class)

public class ModelsEqualsTest {
	
	@Parameter
	public Object model;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {new Form()},
                 {new FormData()},
                 {new User()},
                 {new FormElementListValue()},
                 {new FormElementType()}
           });
    }
	
    
    @Test
    public void sameInstanceTest() {
    	assertTrue(model.equals(model));
    }
    
    @Test
    public void nullTest() {
    	assertFalse(model.equals(null));
    }
    
    @Test
    public void differentClassTest() {
    	assertFalse(model.equals(new Object()));
    }
}
