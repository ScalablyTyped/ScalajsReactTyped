package typingsJapgolly.expressNtlm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Handler
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var badrequest: js.UndefOr[Handler] = js.undefined
  var debug: js.UndefOr[js.Function2[/* prefix */ String, /* message */ String, Unit]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var domaincontroller: js.UndefOr[String] = js.undefined
  var forbidden: js.UndefOr[Handler] = js.undefined
  var internalservererror: js.UndefOr[Handler] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var tlsOptions: js.UndefOr[ConnectionOptions] = js.undefined
  var unauthorized: js.UndefOr[Handler] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    badrequest: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    debug: (/* prefix */ String, /* message */ String) => Callback = null,
    domain: String = null,
    domaincontroller: String = null,
    forbidden: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    internalservererror: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null,
    prefix: String = null,
    tlsOptions: ConnectionOptions = null,
    unauthorized: (/* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => CallbackTo[js.Any] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (badrequest != null) __obj.updateDynamic("badrequest")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => badrequest(t0, t1, t2).runNow()))
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: /* prefix */ java.lang.String, t1: /* message */ java.lang.String) => debug(t0, t1).runNow()))
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domaincontroller != null) __obj.updateDynamic("domaincontroller")(domaincontroller.asInstanceOf[js.Any])
    if (forbidden != null) __obj.updateDynamic("forbidden")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => forbidden(t0, t1, t2).runNow()))
    if (internalservererror != null) __obj.updateDynamic("internalservererror")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => internalservererror(t0, t1, t2).runNow()))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (unauthorized != null) __obj.updateDynamic("unauthorized")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], t1: /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], t2: /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction) => unauthorized(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

