/**
 * Copyright 2013 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.elasticcar;

import java.util.List;

import com.google.inject.ImplementedBy;
import com.netflix.elasticcar.defaultimpl.ElasticCarConfiguration;


@ImplementedBy(ElasticCarConfiguration.class)
public interface IConfiguration
{
	
    public void intialize();

    /**
     * @return Path to the home dir of Elasticsearch
     */
    public String getElasticsearchHome();

    public String getYamlLocation();

    /**
     * @return Path to Elasticsearch startup script
     */
    public String getElasticsearchStartupScript();

    /**
     * @return Path to Elasticsearch stop sript
     */
    public String getElasticsearchStopScript();
   
    public int getElasticsearchListenerPort();
        
    public int getTransportTcpPort();
    
    public int getHttpPort();

    public int getNumOfShards();
    
    public int getNumOfReplicas();
    
    public String getRefreshInterval();
    
    public boolean isMasterQuorumEnabled();
    
    public int getMinimumMasterNodes();
    
    public String getPingTimeout();
    
    public boolean isPingMulticastEnabled();
    
    public String getFdPingInterval();
    
    public String getFdPingTimeout();   

    /**
     * @return Location of the local data dir
     */
	public String getDataFileLocation();

    /**
     * @return Location of the local log dir
     */
	public String getLogFileLocation();

	public boolean doesElasticsearchStartManually();

    /**
     * @return Cluster name
     */
    public String getAppName();

    /**
     * @return RAC (or zone for AWS)
     */
    public String getRac();

    /**
     * @return List of all RAC used for the cluster
     */
    public List<String> getRacs();

    /**
     * @return Local hostmame
     */
    public String getHostname();

    /**
     * @return Get instance name (for AWS)
     */
    public String getInstanceName();

    /**
     * @return Get instance id (for AWS)
     */
    public String getInstanceId();


    /**
     * @return Get the Data Center name (or region for AWS)
     */
    public String getDC();

    /**
     * @param dc
     *            Set the current data center
     */
    public void setDC(String dc);

 
    /**
     * Amazon specific setting to query ASG Membership
     */
    public String getASGName();
    
    /**
     * Get the security group associated with nodes in this cluster
     */
    public String getACLGroupName();

   
    /**
     * @return Get host IP
     */
    public String getHostIP();

   
    /**
     * @return Bootstrap cluster name (depends on another cass cluster)
     */
    public String getBootClusterName();
    
    /** 
     * @return Get the name of seed provider
     */
    public String getSeedProviderName();

    /**
     * @return Elasticsearch Process Name
     */
    public String getElasticsearchProcessName();

    /**
     * @return Elasticsearch Discovery Type
     */
    public String getElasticsearchDiscoveryType();


	public boolean isMultiDC();

    /**
     * @return Elasticsearch Index Refresh Interval
     */
	public String getIndexRefreshInterval();

    
}
