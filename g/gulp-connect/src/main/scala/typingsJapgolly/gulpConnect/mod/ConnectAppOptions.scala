package typingsJapgolly.gulpConnect.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.connect.mod.HandleFunction
import typingsJapgolly.gulpConnect.TypeofconnectModule
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectAppOptions extends js.Object {
  /** Whether or not to log debug messages. Defaults to false. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** File to serve if url results in a 404. Defaults to undefined */
  var fallback: js.UndefOr[String] = js.undefined
  /** Host to bind server to. Defaults to localhost. */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Options to pass to http.createServer (or false to disable https).
    * Defaults to false. When https is just set to true, then internally
    * some defaults will be used.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
  /** Value to pass into the serve-static's index option. See serve-static documentation for details. Defaults to true. */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  /** Enable/disable livereload or set live reload options. Defaults to false. */
  var livereload: js.UndefOr[Boolean | LiveReloadOptions] = js.undefined
  /** Middleware factory function which should return a list of connect handler functions . Defaults to () => []; */
  var middleware: js.UndefOr[MiddlewareFactory] = js.undefined
  /** The name of this server. Used in logs. Defaults to "Server". */
  var name: js.UndefOr[String] = js.undefined
  /** The connect webserver port. Defaults to 8080 */
  var port: js.UndefOr[Double] = js.undefined
  /** The root path. Defaults to directory with gulpfile */
  var root: js.UndefOr[String | js.Array[String]] = js.undefined
  /** A function to run custom initialization on the underlying http or https server */
  var serverInit: js.UndefOr[js.Function1[/* server */ Server | typingsJapgolly.node.httpsMod.Server, Unit]] = js.undefined
  /** Don't log any messages. Defaults to false. */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object ConnectAppOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    fallback: String = null,
    host: String = null,
    https: Boolean | ServerOptions = null,
    index: Boolean | String | js.Array[String] = null,
    livereload: Boolean | LiveReloadOptions = null,
    middleware: (/* connect */ js.Function0[typingsJapgolly.connect.mod.Server] with TypeofconnectModule, /* options */ ConnectAppOptions) => CallbackTo[js.Array[HandleFunction | ConnectRouteHandler]] = null,
    name: String = null,
    port: Int | Double = null,
    root: String | js.Array[String] = null,
    serverInit: /* server */ Server | typingsJapgolly.node.httpsMod.Server => Callback = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): ConnectAppOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (livereload != null) __obj.updateDynamic("livereload")(livereload.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(js.Any.fromFunction2((t0: /* connect */ js.Function0[typingsJapgolly.connect.mod.Server] with typingsJapgolly.gulpConnect.TypeofconnectModule, t1: /* options */ typingsJapgolly.gulpConnect.mod.ConnectAppOptions) => middleware(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (serverInit != null) __obj.updateDynamic("serverInit")(js.Any.fromFunction1((t0: /* server */ typingsJapgolly.node.httpMod.Server | typingsJapgolly.node.httpsMod.Server) => serverInit(t0).runNow()))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectAppOptions]
  }
}

