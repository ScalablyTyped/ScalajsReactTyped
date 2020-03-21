package typingsJapgolly.lessMiddleware

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
  /**
    * Function that modifies the compiled css output before being stored.
    */
  var css: js.UndefOr[js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary], String]] = js.undefined
}

object AnonCss {
  @scala.inline
  def apply(css: (/* css */ String, /* req */ Request_[ParamsDictionary]) => CallbackTo[String] = null): AnonCss = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(js.Any.fromFunction2((t0: /* css */ java.lang.String, t1: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => css(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCss]
  }
}

