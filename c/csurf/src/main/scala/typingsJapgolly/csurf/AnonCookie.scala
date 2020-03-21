package typingsJapgolly.csurf

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.csurf.mod.CookieOptions
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookie extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _], String]] = js.undefined
}

object AnonCookie {
  @scala.inline
  def apply(
    cookie: CookieOptions | Boolean = null,
    ignoreMethods: js.Array[String] = null,
    sessionKey: String = null,
    value: /* req */ Request[ParamsDictionary, js.Any, js.Any] => CallbackTo[String] = null
  ): AnonCookie = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any]) => value(t0).runNow()))
    __obj.asInstanceOf[AnonCookie]
  }
}

