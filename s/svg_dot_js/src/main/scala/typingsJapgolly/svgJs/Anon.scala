package typingsJapgolly.svgJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName(">")
  def Greaterthansign(pos: Double): Double
  @JSName("<")
  def Lessthansign(pos: Double): Double
  @JSName("<>")
  def LessthansignGreaterthansign(pos: Double): Double
  @JSName("-")
  def _dash(pos: Double): Double
}

object Anon {
  @scala.inline
  def apply(
    Greaterthansign: Double => CallbackTo[Double],
    Lessthansign: Double => CallbackTo[Double],
    LessthansignGreaterthansign: Double => CallbackTo[Double],
    _dash: Double => CallbackTo[Double]
  ): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Greaterthansign")(js.Any.fromFunction1((t0: scala.Double) => Greaterthansign(t0).runNow()))
    __obj.updateDynamic("Lessthansign")(js.Any.fromFunction1((t0: scala.Double) => Lessthansign(t0).runNow()))
    __obj.updateDynamic("LessthansignGreaterthansign")(js.Any.fromFunction1((t0: scala.Double) => LessthansignGreaterthansign(t0).runNow()))
    __obj.updateDynamic("_dash")(js.Any.fromFunction1((t0: scala.Double) => _dash(t0).runNow()))
    __obj.asInstanceOf[Anon]
  }
}

