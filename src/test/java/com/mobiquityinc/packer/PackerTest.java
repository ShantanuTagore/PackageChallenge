package com.mobiquityinc.packer;


import com.mobiquityinc.packer.util.APIException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

public class PackerTest {

    @InjectMocks
    Packer packer;

    @Test
    public void whenInputFileIsProvided_thenOutputStringIsReturned() throws APIException {

        String filePath = "/Users/shantanutagore/IdeaProjects/PackageInput.txt";
        Assert.assertEquals("6\n-\n2,7",packer.pack(filePath));
    }

    @Test(expected = APIException.class)
    public void whenIncorrectFilePath_thenThrowAPIException() throws APIException{
        String filePath = "incorrectPath";
        packer.pack(filePath);
    }


}
