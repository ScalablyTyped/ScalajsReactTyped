package typingsJapgolly.momentTimezone.momentTimezoneMod.momentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentZone extends js.Object {
  var abbrs: js.Array[String]
  var name: String
  var offsets: js.Array[Double]
  var population: Double
  var untils: js.Array[Double]
  def abbr(timestamp: Double): String
  def offset(timestamp: Double): Double
  def parse(timestamp: Double): Double
  def utcOffset(timestamp: Double): Double
}

object MomentZone {
  @scala.inline
  def apply(
    abbr: Double => CallbackTo[String],
    abbrs: js.Array[String],
    name: String,
    offset: Double => CallbackTo[Double],
    offsets: js.Array[Double],
    parse: Double => CallbackTo[Double],
    population: Double,
    untils: js.Array[Double],
    utcOffset: Double => CallbackTo[Double]
  ): MomentZone = {
    val __obj = js.Dynamic.literal(abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any])
    __obj.updateDynamic("abbr")(js.Any.fromFunction1((t0: scala.Double) => abbr(t0).runNow()))
    __obj.updateDynamic("offset")(js.Any.fromFunction1((t0: scala.Double) => offset(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: scala.Double) => parse(t0).runNow()))
    __obj.updateDynamic("utcOffset")(js.Any.fromFunction1((t0: scala.Double) => utcOffset(t0).runNow()))
    __obj.asInstanceOf[MomentZone]
  }
}

