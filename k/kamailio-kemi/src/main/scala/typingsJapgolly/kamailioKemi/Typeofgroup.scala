package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgroup extends js.Object {
  def is_user_in(uri: String, grp: String): Double
}

object Typeofgroup {
  @scala.inline
  def apply(is_user_in: (String, String) => CallbackTo[Double]): Typeofgroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_user_in")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_user_in(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofgroup]
  }
}

