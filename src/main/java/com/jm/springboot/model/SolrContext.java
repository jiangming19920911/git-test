package com.jm.springboot.model;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * @author jm
 */
@Configuration
@EnableSolrRepositories(basePackages = { "com.jm.springboot" })
public class SolrContext {

	static final String SOLR_HOST = "localhost:8983/solr/jm";

	@Resource
	private Environment environment;

	@Bean
	public SolrClient solrServer() {
		String solrHost = environment.getRequiredProperty(SOLR_HOST);
		return new HttpSolrClient.Builder(solrHost).build();
	}
}
