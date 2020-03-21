package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpdt extends js.Object {
  def pd_translate(sd: String, md: Double): Double
  def pprefix2domain(m: Double, s: Double): Double
}

object Typeofpdt {
  @scala.inline
  def apply(
    pd_translate: (String, Double) => CallbackTo[Double],
    pprefix2domain: (Double, Double) => CallbackTo[Double]
  ): Typeofpdt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pd_translate")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => pd_translate(t0, t1).runNow()))
    __obj.updateDynamic("pprefix2domain")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => pprefix2domain(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofpdt]
  }
}

