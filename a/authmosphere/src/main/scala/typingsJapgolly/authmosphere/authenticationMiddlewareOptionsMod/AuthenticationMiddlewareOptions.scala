package typingsJapgolly.authmosphere.authenticationMiddlewareOptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.authmosphere.getTokenInfoMod.GetTokenInfo
import typingsJapgolly.authmosphere.loggerMod.Logger
import typingsJapgolly.authmosphere.tokenMod.Token
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationMiddlewareOptions extends js.Object {
  var getTokenInfo: js.UndefOr[GetTokenInfo[js.Object]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var onNotAuthenticatedHandler: js.UndefOr[
    typingsJapgolly.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
  ] = js.undefined
  var publicEndpoints: js.UndefOr[js.Array[String]] = js.undefined
  var tokenInfoEndpoint: String
}

object AuthenticationMiddlewareOptions {
  @scala.inline
  def apply(
    tokenInfoEndpoint: String,
    getTokenInfo: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => CallbackTo[js.Promise[Token[js.Object]]] = null,
    logger: Logger = null,
    onNotAuthenticatedHandler: (/* request */ Request_[ParamsDictionary], /* resonse */ Response_, /* next */ NextFunction, /* logger */ Logger) => Callback = null,
    publicEndpoints: js.Array[String] = null
  ): AuthenticationMiddlewareOptions = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    if (getTokenInfo != null) __obj.updateDynamic("getTokenInfo")(js.Any.fromFunction3((t0: /* tokenInfoUrl */ java.lang.String, t1: /* accessToken */ java.lang.String, t2: /* logger */ js.UndefOr[typingsJapgolly.authmosphere.loggerMod.Logger]) => getTokenInfo(t0, t1, t2).runNow()))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onNotAuthenticatedHandler != null) __obj.updateDynamic("onNotAuthenticatedHandler")(js.Any.fromFunction4((t0: /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* resonse */ typingsJapgolly.express.mod.Response_, t2: /* next */ typingsJapgolly.express.mod.NextFunction, t3: /* logger */ typingsJapgolly.authmosphere.loggerMod.Logger) => onNotAuthenticatedHandler(t0, t1, t2, t3).runNow()))
    if (publicEndpoints != null) __obj.updateDynamic("publicEndpoints")(publicEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMiddlewareOptions]
  }
}

