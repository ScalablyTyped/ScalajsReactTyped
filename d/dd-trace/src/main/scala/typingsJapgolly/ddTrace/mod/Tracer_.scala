package typingsJapgolly.ddTrace.mod

import typingsJapgolly.ddTrace.ddTraceStrings.`aws-sdk`
import typingsJapgolly.ddTrace.ddTraceStrings.`cassandra-driver`
import typingsJapgolly.ddTrace.ddTraceStrings.`generic-pool`
import typingsJapgolly.ddTrace.ddTraceStrings.`google-cloud-pubsub`
import typingsJapgolly.ddTrace.ddTraceStrings.`microgateway-core`
import typingsJapgolly.ddTrace.ddTraceStrings.`mongodb-core`
import typingsJapgolly.ddTrace.ddTraceStrings.amqp10
import typingsJapgolly.ddTrace.ddTraceStrings.amqplib
import typingsJapgolly.ddTrace.ddTraceStrings.bunyan
import typingsJapgolly.ddTrace.ddTraceStrings.connect
import typingsJapgolly.ddTrace.ddTraceStrings.couchbase
import typingsJapgolly.ddTrace.ddTraceStrings.cucumber
import typingsJapgolly.ddTrace.ddTraceStrings.cypress
import typingsJapgolly.ddTrace.ddTraceStrings.dns
import typingsJapgolly.ddTrace.ddTraceStrings.elasticsearch
import typingsJapgolly.ddTrace.ddTraceStrings.express
import typingsJapgolly.ddTrace.ddTraceStrings.fastify
import typingsJapgolly.ddTrace.ddTraceStrings.graphql
import typingsJapgolly.ddTrace.ddTraceStrings.grpc
import typingsJapgolly.ddTrace.ddTraceStrings.hapi
import typingsJapgolly.ddTrace.ddTraceStrings.http
import typingsJapgolly.ddTrace.ddTraceStrings.http2
import typingsJapgolly.ddTrace.ddTraceStrings.ioredis
import typingsJapgolly.ddTrace.ddTraceStrings.jest
import typingsJapgolly.ddTrace.ddTraceStrings.kafkajs
import typingsJapgolly.ddTrace.ddTraceStrings.knex
import typingsJapgolly.ddTrace.ddTraceStrings.koa
import typingsJapgolly.ddTrace.ddTraceStrings.mariadb
import typingsJapgolly.ddTrace.ddTraceStrings.memcached
import typingsJapgolly.ddTrace.ddTraceStrings.mocha
import typingsJapgolly.ddTrace.ddTraceStrings.moleculer
import typingsJapgolly.ddTrace.ddTraceStrings.mongoose
import typingsJapgolly.ddTrace.ddTraceStrings.mysql
import typingsJapgolly.ddTrace.ddTraceStrings.mysql2
import typingsJapgolly.ddTrace.ddTraceStrings.net
import typingsJapgolly.ddTrace.ddTraceStrings.next
import typingsJapgolly.ddTrace.ddTraceStrings.oracledb
import typingsJapgolly.ddTrace.ddTraceStrings.paperplane
import typingsJapgolly.ddTrace.ddTraceStrings.pg
import typingsJapgolly.ddTrace.ddTraceStrings.pino
import typingsJapgolly.ddTrace.ddTraceStrings.redis
import typingsJapgolly.ddTrace.ddTraceStrings.restify
import typingsJapgolly.ddTrace.ddTraceStrings.rhea
import typingsJapgolly.ddTrace.ddTraceStrings.router
import typingsJapgolly.ddTrace.ddTraceStrings.sharedb
import typingsJapgolly.ddTrace.ddTraceStrings.tedious
import typingsJapgolly.ddTrace.ddTraceStrings.winston
import typingsJapgolly.ddTrace.mod.plugins.awsSdk
import typingsJapgolly.ddTrace.mod.plugins.cassandraDriver
import typingsJapgolly.ddTrace.mod.plugins.genericPool
import typingsJapgolly.ddTrace.mod.plugins.googleCloudPubsub
import typingsJapgolly.ddTrace.mod.plugins.microgatewayCore
import typingsJapgolly.ddTrace.mod.plugins.mongodbCore
import typingsJapgolly.opentracing.libTracerMod.SpanOptions
import typingsJapgolly.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracer_ extends Tracer {
  
  /**
    * Create and return a string that can be included in the <head> of a
    * document to enable RUM tracing to include it. The resulting string
    * should not be cached.
    */
  def getRumData(): String = js.native
  
  /**
    * Initializes the tracer. This should be called before importing other libraries.
    */
  def init(): this.type = js.native
  def init(options: TracerOptions): this.type = js.native
  
  /**
    * Injects the given SpanContext instance for cross-process propagation
    * within `carrier`
    * @param  {SpanContext} spanContext The SpanContext to inject into the
    *         carrier object. As a convenience, a Span instance may be passed
    *         in instead (in which case its .context() is used for the
    *         inject()).
    * @param  {string} format The format of the carrier.
    * @param  {any} carrier The carrier object.
    */
  def inject(spanContext: SpanContext, format: String, carrier: Any): Unit = js.native
  def inject(spanContext: Span, format: String, carrier: Any): Unit = js.native
  
  /**
    * Returns a reference to the current scope.
    */
  def scope(): Scope = js.native
  
  /**
    * Sets the URL for the trace agent. This should only be called _after_
    * init() is called, only in cases where the URL needs to be set after
    * initialization.
    */
  def setUrl(url: String): this.type = js.native
  
  /**
    * Links an authenticated user to the current trace.
    * @param {User} user Properties of the authenticated user. Accepts custom fields.
    * @returns {Tracer} The Tracer instance for chaining.
    */
  def setUser(user: User): Tracer_ = js.native
  
  /**
    * Instruments a function by automatically creating a span activated on its
    * scope.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its second parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    *
    * If the `orphanable` option is set to false, the function will not be traced
    * unless there is already an active span or `childOf` option.
    */
  def trace[T](
    name: String,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* fn */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Any]], 
      T
    ]
  ): T = js.native
  def trace[T](
    name: String,
    options: TraceOptions & SpanOptions,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* done */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], String]], 
      T
    ]
  ): T = js.native
  
  /**
    * Enable and optionally configure a plugin.
    * @param plugin The name of a built-in plugin.
    * @param config Configuration options. Can also be `false` to disable the plugin.
    */
  @JSName("use")
  def use_amqp10(plugin: amqp10): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: typingsJapgolly.ddTrace.mod.plugins.amqp10): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: typingsJapgolly.ddTrace.mod.plugins.amqplib): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: awsSdk): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: typingsJapgolly.ddTrace.mod.plugins.bunyan): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: cassandraDriver): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: Boolean): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: typingsJapgolly.ddTrace.mod.plugins.connect): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: Boolean): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: typingsJapgolly.ddTrace.mod.plugins.couchbase): this.type = js.native
  @JSName("use")
  def use_cucumber(plugin: cucumber): this.type = js.native
  @JSName("use")
  def use_cucumber(plugin: cucumber, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cucumber(plugin: cucumber, config: typingsJapgolly.ddTrace.mod.plugins.cucumber): this.type = js.native
  @JSName("use")
  def use_cypress(plugin: cypress): this.type = js.native
  @JSName("use")
  def use_cypress(plugin: cypress, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cypress(plugin: cypress, config: typingsJapgolly.ddTrace.mod.plugins.cypress): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: Boolean): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: typingsJapgolly.ddTrace.mod.plugins.dns): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: Boolean): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: typingsJapgolly.ddTrace.mod.plugins.elasticsearch): this.type = js.native
  @JSName("use")
  def use_express(plugin: express): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: Boolean): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: typingsJapgolly.ddTrace.mod.plugins.express): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: typingsJapgolly.ddTrace.mod.plugins.fastify): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: genericPool): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: googleCloudPubsub): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: typingsJapgolly.ddTrace.mod.plugins.graphql): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: Boolean): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: typingsJapgolly.ddTrace.mod.plugins.grpc): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: Boolean): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: typingsJapgolly.ddTrace.mod.plugins.hapi): this.type = js.native
  @JSName("use")
  def use_http(plugin: http): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: typingsJapgolly.ddTrace.mod.plugins.http): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: typingsJapgolly.ddTrace.mod.plugins.http2): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: typingsJapgolly.ddTrace.mod.plugins.ioredis): this.type = js.native
  @JSName("use")
  def use_jest(plugin: jest): this.type = js.native
  @JSName("use")
  def use_jest(plugin: jest, config: Boolean): this.type = js.native
  @JSName("use")
  def use_jest(plugin: jest, config: typingsJapgolly.ddTrace.mod.plugins.jest): this.type = js.native
  @JSName("use")
  def use_kafkajs(plugin: kafkajs): this.type = js.native
  @JSName("use")
  def use_kafkajs(plugin: kafkajs, config: Boolean): this.type = js.native
  @JSName("use")
  def use_kafkajs(plugin: kafkajs, config: typingsJapgolly.ddTrace.mod.plugins.kafkajs): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: Boolean): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: typingsJapgolly.ddTrace.mod.plugins.knex): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: Boolean): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: typingsJapgolly.ddTrace.mod.plugins.koa): this.type = js.native
  @JSName("use")
  def use_mariadb(plugin: mariadb): this.type = js.native
  @JSName("use")
  def use_mariadb(plugin: mariadb, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mariadb(plugin: mariadb, config: typingsJapgolly.ddTrace.mod.plugins.mariadb): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: Boolean): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: typingsJapgolly.ddTrace.mod.plugins.memcached): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: microgatewayCore): this.type = js.native
  @JSName("use")
  def use_mocha(plugin: mocha): this.type = js.native
  @JSName("use")
  def use_mocha(plugin: mocha, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mocha(plugin: mocha, config: typingsJapgolly.ddTrace.mod.plugins.mocha): this.type = js.native
  @JSName("use")
  def use_moleculer(plugin: moleculer): this.type = js.native
  @JSName("use")
  def use_moleculer(plugin: moleculer, config: Boolean): this.type = js.native
  @JSName("use")
  def use_moleculer(plugin: moleculer, config: typingsJapgolly.ddTrace.mod.plugins.moleculer): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: mongodbCore): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose, config: typingsJapgolly.ddTrace.mod.plugins.mongoose): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: typingsJapgolly.ddTrace.mod.plugins.mysql): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: typingsJapgolly.ddTrace.mod.plugins.mysql2): this.type = js.native
  @JSName("use")
  def use_net(plugin: net): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: Boolean): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: typingsJapgolly.ddTrace.mod.plugins.net): this.type = js.native
  @JSName("use")
  def use_next(plugin: next): this.type = js.native
  @JSName("use")
  def use_next(plugin: next, config: Boolean): this.type = js.native
  @JSName("use")
  def use_next(plugin: next, config: typingsJapgolly.ddTrace.mod.plugins.next): this.type = js.native
  @JSName("use")
  def use_oracledb(plugin: oracledb): this.type = js.native
  @JSName("use")
  def use_oracledb(plugin: oracledb, config: Boolean): this.type = js.native
  @JSName("use")
  def use_oracledb(plugin: oracledb, config: typingsJapgolly.ddTrace.mod.plugins.oracledb): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: Boolean): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: typingsJapgolly.ddTrace.mod.plugins.paperplane): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: typingsJapgolly.ddTrace.mod.plugins.pg): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: typingsJapgolly.ddTrace.mod.plugins.pino): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: typingsJapgolly.ddTrace.mod.plugins.redis): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: typingsJapgolly.ddTrace.mod.plugins.restify): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: Boolean): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: typingsJapgolly.ddTrace.mod.plugins.rhea): this.type = js.native
  @JSName("use")
  def use_router(plugin: router): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: Boolean): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: typingsJapgolly.ddTrace.mod.plugins.router): this.type = js.native
  @JSName("use")
  def use_sharedb(plugin: sharedb): this.type = js.native
  @JSName("use")
  def use_sharedb(plugin: sharedb, config: Boolean): this.type = js.native
  @JSName("use")
  def use_sharedb(plugin: sharedb, config: typingsJapgolly.ddTrace.mod.plugins.sharedb): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: Boolean): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: typingsJapgolly.ddTrace.mod.plugins.tedious): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: Boolean): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: typingsJapgolly.ddTrace.mod.plugins.winston): this.type = js.native
  
  /**
    * Wrap a function to automatically create a span activated on its
    * scope when it's called.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its last parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    */
  def wrap[T](name: String, fn: T): T = js.native
  def wrap[T](name: String, fn: T, requiresParent: Boolean): T = js.native
  def wrap[T](name: String, options: TraceOptions & SpanOptions, fn: T): T = js.native
  def wrap[T](name: String, options: js.Function1[/* repeated */ Any, TraceOptions & SpanOptions], fn: T): T = js.native
}
