package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftmrec extends js.Object {
  def is_leap_year(y: Double): Double
  def is_leap_year_now(): Double
  def `match`(rv: String): Double
  def match_timestamp(rv: String, ti: Double): Double
  def time_period_match(period: String): Double
  def time_period_match_timestamp(period: String, ti: Double): Double
}

object Typeoftmrec {
  @scala.inline
  def apply(
    is_leap_year: Double => CallbackTo[Double],
    is_leap_year_now: CallbackTo[Double],
    `match`: String => CallbackTo[Double],
    match_timestamp: (String, Double) => CallbackTo[Double],
    time_period_match: String => CallbackTo[Double],
    time_period_match_timestamp: (String, Double) => CallbackTo[Double]
  ): Typeoftmrec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("is_leap_year")(js.Any.fromFunction1((t0: scala.Double) => is_leap_year(t0).runNow()))
    __obj.updateDynamic("is_leap_year_now")(is_leap_year_now.toJsFn)
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: java.lang.String) => `match`(t0).runNow()))
    __obj.updateDynamic("match_timestamp")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => match_timestamp(t0, t1).runNow()))
    __obj.updateDynamic("time_period_match")(js.Any.fromFunction1((t0: java.lang.String) => time_period_match(t0).runNow()))
    __obj.updateDynamic("time_period_match_timestamp")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => time_period_match_timestamp(t0, t1).runNow()))
    __obj.asInstanceOf[Typeoftmrec]
  }
}

