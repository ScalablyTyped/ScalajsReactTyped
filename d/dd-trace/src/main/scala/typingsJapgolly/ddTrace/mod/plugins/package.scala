package typingsJapgolly.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  /**
    * This plugin patches the [bluebird](https://github.com/petkaantonov/bluebird)
    * module to bind the promise callback the the caller context.
    */
  type bluebird = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [bunyan](https://github.com/trentm/node-bunyan)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type bunyan = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin automatically instruments the
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin automatically instruments the
    * [express](http://expressjs.com/) module.
    */
  type express = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin automatically instruments the
    * [fastify](https://www.fastify.io/) module.
    */
  type fastify = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin patches the [generic-pool](https://github.com/coopernurse/node-pool)
    * module to bind the callbacks the the caller context.
    */
  type genericPool = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin automatically instruments the
    * [hapi](https://hapijs.com/) module.
    */
  type hapi = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin patches the [knex](https://knexjs.org/)
    * module to bind the promise callback the the caller context.
    */
  type knex = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin automatically instruments the
    * [koa](https://koajs.com/) module.
    */
  type koa = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin automatically instruments the
    * [limitd-client](https://github.com/limitd/node-client) module.
    */
  type limitdClient = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin automatically instruments the
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin patches the [pino](http://getpino.io)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type pino = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [promise](https://github.com/then/promise)
    * module to bind the promise callback the the caller context.
    */
  type promise = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [promise-js](https://github.com/kevincennis/promise)
    * module to bind the promise callback the the caller context.
    */
  type promiseJs = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [q](https://github.com/kriskowal/q)
    * module to bind the promise callback the the caller context.
    */
  type q = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin automatically instruments the
    * [restify](http://restify.com/) module.
    */
  type restify = typingsJapgolly.ddTrace.mod.plugins.HttpServer
  /**
    * This plugin automatically instruments the
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [when](https://github.com/cujojs/when)
    * module to bind the promise callback the the caller context.
    */
  type when = typingsJapgolly.ddTrace.mod.plugins.Integration
  /**
    * This plugin patches the [winston](https://github.com/winstonjs/winston)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type winston = typingsJapgolly.ddTrace.mod.plugins.Integration
}
