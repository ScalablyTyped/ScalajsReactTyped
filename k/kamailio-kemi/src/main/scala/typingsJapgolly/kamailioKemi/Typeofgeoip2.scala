package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgeoip2 extends js.Object {
  def `match`(tomatch: String, pvclass: String): Double
}

object Typeofgeoip2 {
  @scala.inline
  def apply(`match`: (String, String) => CallbackTo[Double]): Typeofgeoip2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => `match`(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofgeoip2]
  }
}

