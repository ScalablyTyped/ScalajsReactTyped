package typingsJapgolly.apolloServerExpress.apolloServerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.cors.mod.CorsOptions
import typingsJapgolly.cors.mod.CorsOptionsDelegate
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.undefined
  var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate | Boolean] = js.undefined
  var disableHealthCheck: js.UndefOr[Boolean] = js.undefined
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], js.Promise[_]]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(
    bodyParserConfig: OptionsJson | Boolean = null,
    cors: CorsOptions | CorsOptionsDelegate | Boolean = null,
    disableHealthCheck: js.UndefOr[Boolean] = js.undefined,
    onHealthCheck: /* req */ Request_[ParamsDictionary] => CallbackTo[js.Promise[js.Any]] = null,
    path: String = null
  ): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (bodyParserConfig != null) __obj.updateDynamic("bodyParserConfig")(bodyParserConfig.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHealthCheck)) __obj.updateDynamic("disableHealthCheck")(disableHealthCheck.asInstanceOf[js.Any])
    if (onHealthCheck != null) __obj.updateDynamic("onHealthCheck")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => onHealthCheck(t0).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
}

