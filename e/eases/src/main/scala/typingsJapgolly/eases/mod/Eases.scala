package typingsJapgolly.eases.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eases extends js.Object {
  def backIn(t: Double): Double
  def backInOut(t: Double): Double
  def backOut(t: Double): Double
  def bounceIn(t: Double): Double
  def bounceInOut(t: Double): Double
  def bounceOut(t: Double): Double
  def circIn(t: Double): Double
  def circInOut(t: Double): Double
  def circOut(t: Double): Double
  def cubicIn(t: Double): Double
  def cubicInOut(t: Double): Double
  def cubicOut(t: Double): Double
  def elasticIn(t: Double): Double
  def elasticInOut(t: Double): Double
  def elasticOut(t: Double): Double
  def expoIn(t: Double): Double
  def expoInOut(t: Double): Double
  def expoOut(t: Double): Double
  def linear(t: Double): Double
  def quadIn(t: Double): Double
  def quadInOut(t: Double): Double
  def quadOut(t: Double): Double
  def quartIn(t: Double): Double
  def quartInOut(t: Double): Double
  def quartOut(t: Double): Double
  def quintIn(t: Double): Double
  def quintInOut(t: Double): Double
  def quintOut(t: Double): Double
  def sineIn(t: Double): Double
  def sineInOut(t: Double): Double
  def sineOut(t: Double): Double
}

object Eases {
  @scala.inline
  def apply(
    backIn: Double => CallbackTo[Double],
    backInOut: Double => CallbackTo[Double],
    backOut: Double => CallbackTo[Double],
    bounceIn: Double => CallbackTo[Double],
    bounceInOut: Double => CallbackTo[Double],
    bounceOut: Double => CallbackTo[Double],
    circIn: Double => CallbackTo[Double],
    circInOut: Double => CallbackTo[Double],
    circOut: Double => CallbackTo[Double],
    cubicIn: Double => CallbackTo[Double],
    cubicInOut: Double => CallbackTo[Double],
    cubicOut: Double => CallbackTo[Double],
    elasticIn: Double => CallbackTo[Double],
    elasticInOut: Double => CallbackTo[Double],
    elasticOut: Double => CallbackTo[Double],
    expoIn: Double => CallbackTo[Double],
    expoInOut: Double => CallbackTo[Double],
    expoOut: Double => CallbackTo[Double],
    linear: Double => CallbackTo[Double],
    quadIn: Double => CallbackTo[Double],
    quadInOut: Double => CallbackTo[Double],
    quadOut: Double => CallbackTo[Double],
    quartIn: Double => CallbackTo[Double],
    quartInOut: Double => CallbackTo[Double],
    quartOut: Double => CallbackTo[Double],
    quintIn: Double => CallbackTo[Double],
    quintInOut: Double => CallbackTo[Double],
    quintOut: Double => CallbackTo[Double],
    sineIn: Double => CallbackTo[Double],
    sineInOut: Double => CallbackTo[Double],
    sineOut: Double => CallbackTo[Double]
  ): Eases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backIn")(js.Any.fromFunction1((t0: scala.Double) => backIn(t0).runNow()))
    __obj.updateDynamic("backInOut")(js.Any.fromFunction1((t0: scala.Double) => backInOut(t0).runNow()))
    __obj.updateDynamic("backOut")(js.Any.fromFunction1((t0: scala.Double) => backOut(t0).runNow()))
    __obj.updateDynamic("bounceIn")(js.Any.fromFunction1((t0: scala.Double) => bounceIn(t0).runNow()))
    __obj.updateDynamic("bounceInOut")(js.Any.fromFunction1((t0: scala.Double) => bounceInOut(t0).runNow()))
    __obj.updateDynamic("bounceOut")(js.Any.fromFunction1((t0: scala.Double) => bounceOut(t0).runNow()))
    __obj.updateDynamic("circIn")(js.Any.fromFunction1((t0: scala.Double) => circIn(t0).runNow()))
    __obj.updateDynamic("circInOut")(js.Any.fromFunction1((t0: scala.Double) => circInOut(t0).runNow()))
    __obj.updateDynamic("circOut")(js.Any.fromFunction1((t0: scala.Double) => circOut(t0).runNow()))
    __obj.updateDynamic("cubicIn")(js.Any.fromFunction1((t0: scala.Double) => cubicIn(t0).runNow()))
    __obj.updateDynamic("cubicInOut")(js.Any.fromFunction1((t0: scala.Double) => cubicInOut(t0).runNow()))
    __obj.updateDynamic("cubicOut")(js.Any.fromFunction1((t0: scala.Double) => cubicOut(t0).runNow()))
    __obj.updateDynamic("elasticIn")(js.Any.fromFunction1((t0: scala.Double) => elasticIn(t0).runNow()))
    __obj.updateDynamic("elasticInOut")(js.Any.fromFunction1((t0: scala.Double) => elasticInOut(t0).runNow()))
    __obj.updateDynamic("elasticOut")(js.Any.fromFunction1((t0: scala.Double) => elasticOut(t0).runNow()))
    __obj.updateDynamic("expoIn")(js.Any.fromFunction1((t0: scala.Double) => expoIn(t0).runNow()))
    __obj.updateDynamic("expoInOut")(js.Any.fromFunction1((t0: scala.Double) => expoInOut(t0).runNow()))
    __obj.updateDynamic("expoOut")(js.Any.fromFunction1((t0: scala.Double) => expoOut(t0).runNow()))
    __obj.updateDynamic("linear")(js.Any.fromFunction1((t0: scala.Double) => linear(t0).runNow()))
    __obj.updateDynamic("quadIn")(js.Any.fromFunction1((t0: scala.Double) => quadIn(t0).runNow()))
    __obj.updateDynamic("quadInOut")(js.Any.fromFunction1((t0: scala.Double) => quadInOut(t0).runNow()))
    __obj.updateDynamic("quadOut")(js.Any.fromFunction1((t0: scala.Double) => quadOut(t0).runNow()))
    __obj.updateDynamic("quartIn")(js.Any.fromFunction1((t0: scala.Double) => quartIn(t0).runNow()))
    __obj.updateDynamic("quartInOut")(js.Any.fromFunction1((t0: scala.Double) => quartInOut(t0).runNow()))
    __obj.updateDynamic("quartOut")(js.Any.fromFunction1((t0: scala.Double) => quartOut(t0).runNow()))
    __obj.updateDynamic("quintIn")(js.Any.fromFunction1((t0: scala.Double) => quintIn(t0).runNow()))
    __obj.updateDynamic("quintInOut")(js.Any.fromFunction1((t0: scala.Double) => quintInOut(t0).runNow()))
    __obj.updateDynamic("quintOut")(js.Any.fromFunction1((t0: scala.Double) => quintOut(t0).runNow()))
    __obj.updateDynamic("sineIn")(js.Any.fromFunction1((t0: scala.Double) => sineIn(t0).runNow()))
    __obj.updateDynamic("sineInOut")(js.Any.fromFunction1((t0: scala.Double) => sineInOut(t0).runNow()))
    __obj.updateDynamic("sineOut")(js.Any.fromFunction1((t0: scala.Double) => sineOut(t0).runNow()))
    __obj.asInstanceOf[Eases]
  }
}

