package com.compare.maven.artifiact.versioncomparison;

import java.util.Comparator;

public class VersionComparator implements Comparator<Software>{

    @Override
    public int compare(Software software1, Software software2) {
        System.out.println(software1.getVersion().compareTo(software2.getVersion()));
        return software1.getVersion().compareTo(software2.getVersion());
    }
    
    
}
