package jp.ne.lulichn.vertx;

import io.vertx.core.AbstractVerticle;

public class App extends AbstractVerticle {
	public void start() {
		vertx.deployVerticle("jp.ne.lulichn.vertx.HelloWorld");
	}
}
