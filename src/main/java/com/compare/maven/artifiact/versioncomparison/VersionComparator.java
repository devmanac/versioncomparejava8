package com.compare.maven.artifiact.versioncomparison;

import java.util.Comparator;

import org.apache.maven.artifact.versioning.ComparableVersion;

public class VersionComparator implements Comparator<Software>{

    @Override
    public int compare(Software software1, Software software2) {
        return new ComparableVersion(software1.getVersion()).compareTo(new ComparableVersion(software2.getVersion()));
    }
    
    
}
