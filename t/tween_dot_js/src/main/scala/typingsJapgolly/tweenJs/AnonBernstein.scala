package typingsJapgolly.tweenJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBernstein extends js.Object {
  def Bernstein(n: Double, i: Double): Double
  def CatmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double
  def Factorial(n: Double): Double
  def Linear(p0: Double, p1: Double, t: Double): Double
}

object AnonBernstein {
  @scala.inline
  def apply(
    Bernstein: (Double, Double) => CallbackTo[Double],
    CatmullRom: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    Factorial: Double => CallbackTo[Double],
    Linear: (Double, Double, Double) => CallbackTo[Double]
  ): AnonBernstein = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bernstein")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => Bernstein(t0, t1).runNow()))
    __obj.updateDynamic("CatmullRom")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => CatmullRom(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("Factorial")(js.Any.fromFunction1((t0: scala.Double) => Factorial(t0).runNow()))
    __obj.updateDynamic("Linear")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => Linear(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonBernstein]
  }
}

