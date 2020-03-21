package typingsJapgolly.milliseconds

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milliseconds_ extends js.Object {
  def days(days: Double): Double
  def hours(hours: Double): Double
  def minutes(minutes: Double): Double
  def months(months: Double): Double
  def seconds(seconds: Double): Double
  def weeks(weeks: Double): Double
  def years(years: Double): Double
}

object Milliseconds_ {
  @scala.inline
  def apply(
    days: Double => CallbackTo[Double],
    hours: Double => CallbackTo[Double],
    minutes: Double => CallbackTo[Double],
    months: Double => CallbackTo[Double],
    seconds: Double => CallbackTo[Double],
    weeks: Double => CallbackTo[Double],
    years: Double => CallbackTo[Double]
  ): Milliseconds_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(js.Any.fromFunction1((t0: scala.Double) => days(t0).runNow()))
    __obj.updateDynamic("hours")(js.Any.fromFunction1((t0: scala.Double) => hours(t0).runNow()))
    __obj.updateDynamic("minutes")(js.Any.fromFunction1((t0: scala.Double) => minutes(t0).runNow()))
    __obj.updateDynamic("months")(js.Any.fromFunction1((t0: scala.Double) => months(t0).runNow()))
    __obj.updateDynamic("seconds")(js.Any.fromFunction1((t0: scala.Double) => seconds(t0).runNow()))
    __obj.updateDynamic("weeks")(js.Any.fromFunction1((t0: scala.Double) => weeks(t0).runNow()))
    __obj.updateDynamic("years")(js.Any.fromFunction1((t0: scala.Double) => years(t0).runNow()))
    __obj.asInstanceOf[Milliseconds_]
  }
}

