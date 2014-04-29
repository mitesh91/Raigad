package com.netflix.elasticcar.utils;

import java.io.IOException;

import com.google.inject.ImplementedBy;
import com.netflix.elasticcar.defaultimpl.StandardTuner;

@ImplementedBy(StandardTuner.class)
public interface ElasticsearchTuner
{
    void writeAllProperties(String yamlLocation, String hostname, String seedProvider) throws IOException;

    void updateAutoBootstrap(String yamlLocation, boolean autobootstrap) throws IOException;
}