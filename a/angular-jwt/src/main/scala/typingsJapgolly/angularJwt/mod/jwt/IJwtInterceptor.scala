package typingsJapgolly.angularJwt.mod.jwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJwtInterceptor extends js.Object {
  def tokenGetter(params: js.Any*): String
}

object IJwtInterceptor {
  @scala.inline
  def apply(tokenGetter: /* repeated */ js.Any => CallbackTo[String]): IJwtInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenGetter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => tokenGetter(t0).runNow()))
    __obj.asInstanceOf[IJwtInterceptor]
  }
}

