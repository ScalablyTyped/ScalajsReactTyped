package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxhttp extends js.Object {
  def xhttp_reply(code: Double, reason: String, ctype: String, body: String): Double
}

object Typeofxhttp {
  @scala.inline
  def apply(xhttp_reply: (Double, String, String, String) => CallbackTo[Double]): Typeofxhttp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xhttp_reply")(js.Any.fromFunction4((t0: scala.Double, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => xhttp_reply(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Typeofxhttp]
  }
}

