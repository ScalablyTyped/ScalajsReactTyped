package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofutils extends js.Object {
  def xcap_auth_status(watcher_uri: String, presentity_uri: String): Double
}

object Typeofutils {
  @scala.inline
  def apply(xcap_auth_status: (String, String) => CallbackTo[Double]): Typeofutils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xcap_auth_status")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => xcap_auth_status(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofutils]
  }
}

