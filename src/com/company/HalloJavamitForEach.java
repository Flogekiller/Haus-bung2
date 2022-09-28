package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach
{

    public HalloJavamitForEach()
    {
        List<String> list = new ArrayList<>();

        list.forEach(System.out::print);
    }
}
