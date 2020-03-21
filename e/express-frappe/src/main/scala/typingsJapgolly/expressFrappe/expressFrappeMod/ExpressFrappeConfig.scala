package typingsJapgolly.expressFrappe.expressFrappeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cors.mod.CorsOptions
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressFrappe.AnonJson
import typingsJapgolly.expressFrappe.AnonOptions
import typingsJapgolly.expressRouters.expressRoutersMod.RouteConfig
import typingsJapgolly.expressRouters.expressRoutersMod.RouteConfigAlternative
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[Boolean | AnonJson] = js.undefined
  var cors: js.UndefOr[Boolean | CorsOptions] = js.undefined
  var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary]] = js.undefined
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
  var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary]]] = js.undefined
  var morgan: js.UndefOr[Boolean] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.undefined
  var static: js.UndefOr[String | AnonOptions] = js.undefined
}

object ExpressFrappeConfig {
  @scala.inline
  def apply(
    bodyParser: Boolean | AnonJson = null,
    cors: Boolean | CorsOptions = null,
    errorHandler: (/* err */ js.Any, /* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    io: ExpressFrappeSocketIOConfig = null,
    middleware: js.Array[RequestHandler[ParamsDictionary]] = null,
    morgan: js.UndefOr[Boolean] = js.undefined,
    routes: js.Array[RouteConfig] | RouteConfigAlternative = null,
    static: String | AnonOptions = null
  ): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction4((t0: /* err */ js.Any, t1: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t2: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t3: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => errorHandler(t0, t1, t2, t3).runNow()))
    if (io != null) __obj.updateDynamic("io")(io.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (!js.isUndefined(morgan)) __obj.updateDynamic("morgan")(morgan.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
}

