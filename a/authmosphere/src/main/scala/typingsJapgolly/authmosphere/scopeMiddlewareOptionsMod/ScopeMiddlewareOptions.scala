package typingsJapgolly.authmosphere.scopeMiddlewareOptionsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.authmosphere.loggerMod.Logger
import typingsJapgolly.authmosphere.precedenceMod.PrecedenceOptions
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeMiddlewareOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var onAuthorizationFailedHandler: js.UndefOr[
    typingsJapgolly.authmosphere.scopeMiddlewareOptionsMod.onAuthorizationFailedHandler
  ] = js.undefined
  var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
}

object ScopeMiddlewareOptions {
  @scala.inline
  def apply(
    logger: Logger = null,
    onAuthorizationFailedHandler: (/* request */ Request_[ParamsDictionary], /* resonse */ Response_, /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Callback = null,
    precedenceOptions: PrecedenceOptions = null
  ): ScopeMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (onAuthorizationFailedHandler != null) __obj.updateDynamic("onAuthorizationFailedHandler")(js.Any.fromFunction5((t0: /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* resonse */ typingsJapgolly.express.mod.Response_, t2: /* next */ typingsJapgolly.express.mod.NextFunction, t3: /* scopes */ js.Array[java.lang.String], t4: /* logger */ typingsJapgolly.authmosphere.loggerMod.Logger) => onAuthorizationFailedHandler(t0, t1, t2, t3, t4).runNow()))
    if (precedenceOptions != null) __obj.updateDynamic("precedenceOptions")(precedenceOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeMiddlewareOptions]
  }
}

