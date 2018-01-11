package com.cassandra.poc.CassandraSpring.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class AppConfig {
//
//    /*
//     * Use the standard Cassandra driver API to create a com.datastax.driver.core.Session instance.
//     */
//    public @Bean
//    Session session() {
//        Cluster cluster = Cluster.builder().addContactPoints("localhost").build();
//        return cluster.connect("mykeyspace");
//    }
//}
