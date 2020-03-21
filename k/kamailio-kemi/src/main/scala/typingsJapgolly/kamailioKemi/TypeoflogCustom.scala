package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflogCustom extends js.Object {
  def log_udp(txt: String): Double
}

object TypeoflogCustom {
  @scala.inline
  def apply(log_udp: String => CallbackTo[Double]): TypeoflogCustom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log_udp")(js.Any.fromFunction1((t0: java.lang.String) => log_udp(t0).runNow()))
    __obj.asInstanceOf[TypeoflogCustom]
  }
}

