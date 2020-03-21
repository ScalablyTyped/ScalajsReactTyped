package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdialplan extends js.Object {
  def dp_match(dpid: Double, src: String): Double
  def dp_replace(dpid: Double, src: String, dst: String): Double
}

object Typeofdialplan {
  @scala.inline
  def apply(
    dp_match: (Double, String) => CallbackTo[Double],
    dp_replace: (Double, String, String) => CallbackTo[Double]
  ): Typeofdialplan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dp_match")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => dp_match(t0, t1).runNow()))
    __obj.updateDynamic("dp_replace")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => dp_replace(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofdialplan]
  }
}

