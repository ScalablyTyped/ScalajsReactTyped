package typingsJapgolly.tweenJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  var Utils: AnonBernstein
  def Bezier(v: js.Array[Double], k: Double): Double
  def CatmullRom(v: js.Array[Double], k: Double): Double
  def Linear(v: js.Array[Double], k: Double): Double
}

object Interpolation {
  @scala.inline
  def apply(
    Bezier: (js.Array[Double], Double) => CallbackTo[Double],
    CatmullRom: (js.Array[Double], Double) => CallbackTo[Double],
    Linear: (js.Array[Double], Double) => CallbackTo[Double],
    Utils: AnonBernstein
  ): Interpolation = {
    val __obj = js.Dynamic.literal(Utils = Utils.asInstanceOf[js.Any])
    __obj.updateDynamic("Bezier")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => Bezier(t0, t1).runNow()))
    __obj.updateDynamic("CatmullRom")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => CatmullRom(t0, t1).runNow()))
    __obj.updateDynamic("Linear")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => Linear(t0, t1).runNow()))
    __obj.asInstanceOf[Interpolation]
  }
}

