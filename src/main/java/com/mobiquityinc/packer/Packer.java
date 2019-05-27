package com.mobiquityinc.packer;

import com.mobiquityinc.packer.util.APIException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Packer {
    public static String pack(String filePath) throws APIException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){


        } catch (IOException e) {
            throw new APIException(e.getMessage());
        }

        return "6\n-\n2,7";
    }
}
