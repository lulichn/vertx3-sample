package jp.ne.lulichn.vertx;

import io.vertx.core.AbstractVerticle;


public class HelloWorld extends AbstractVerticle {
	public void start() {
		vertx.createHttpServer().requestHandler(req ->
			req.response().end("Hello World!")
		).listen(8080);
	}
}
