package neo4j.driver.reactive.impl;

import org.neo4j.driver.v1.Driver;

import neo4j.driver.reactive.ReactiveDriver;
import neo4j.driver.reactive.ReactiveSession;

/**
 * Extends Neo4j driver features with incremental features: clients can register queries
 * and get the change set caused by the latest update operation.
 */
public class Neo4jReactiveDriver implements ReactiveDriver {

	protected final Driver driver;

    public Neo4jReactiveDriver(Driver driver) {
    	this.driver = driver;
    }

    public ReactiveSession session() {
    	return new Neo4jReactiveSession(driver.session());
    }


}
