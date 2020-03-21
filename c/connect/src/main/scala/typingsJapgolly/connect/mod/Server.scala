package typingsJapgolly.connect.mod

import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends EventEmitter {
  var route: String = js.native
  var stack: js.Array[ServerStackItem] = js.native
  def apply(req: typingsJapgolly.node.httpMod.IncomingMessage, res: ServerResponse): Unit = js.native
  def apply(req: typingsJapgolly.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
  /**
    * Handle server requests, punting them down
    * the middleware stack.
    *
    * @private
    */
  def handle(req: typingsJapgolly.node.httpMod.IncomingMessage, res: ServerResponse, next: js.Function): Unit = js.native
  def listen(handle: js.Any): typingsJapgolly.node.httpMod.Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): typingsJapgolly.node.httpMod.Server = js.native
  def listen(path: String): typingsJapgolly.node.httpMod.Server = js.native
  def listen(path: String, callback: js.Function): typingsJapgolly.node.httpMod.Server = js.native
  /**
    * Listen for connections.
    *
    * This method takes the same arguments
    * as node's `http.Server#listen()`.
    *
    * HTTP and HTTPS:
    *
    * If you run your application both as HTTP
    * and HTTPS you may wrap them individually,
    * since your Connect "server" is really just
    * a JavaScript `Function`.
    *
    *      var connect = require('connect')
    *        , http = require('http')
    *        , https = require('https');
    *
    *      var app = connect();
    *
    *      http.createServer(app).listen(80);
    *      https.createServer(options, app).listen(443);
    *
    * @api public
    */
  def listen(port: Double): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double, hostname: String): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double, hostname: String, backlog: Double): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): typingsJapgolly.node.httpMod.Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function): typingsJapgolly.node.httpMod.Server = js.native
  /**
    * Utilize the given middleware `handle` to the given `route`,
    * defaulting to _/_. This "route" is the mount-point for the
    * middleware, when given a value other than _/_ the middleware
    * is only effective when that segment is present in the request's
    * pathname.
    *
    * For example if we were to mount a function at _/admin_, it would
    * be invoked on _/admin_, and _/admin/settings_, however it would
    * not be invoked for _/_, or _/posts_.
    *
    * @public
    */
  def use(fn: HandleFunction): Server = js.native
  def use(route: String, fn: HandleFunction): Server = js.native
}

