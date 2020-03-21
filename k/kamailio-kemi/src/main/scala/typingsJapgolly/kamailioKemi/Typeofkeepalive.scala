package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeepalive extends js.Object {
  def is_alive(dest: String): Double
}

object Typeofkeepalive {
  @scala.inline
  def apply(is_alive: String => CallbackTo[Double]): Typeofkeepalive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_alive")(js.Any.fromFunction1((t0: java.lang.String) => is_alive(t0).runNow()))
    __obj.asInstanceOf[Typeofkeepalive]
  }
}

