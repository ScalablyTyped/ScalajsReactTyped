package typingsJapgolly.postgresInterval.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresInterval extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var milliseconds: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
  def toISO(): String
  def toISOString(): String
  def toPostgres(): String
}

object IPostgresInterval {
  @scala.inline
  def apply(
    toISO: CallbackTo[String],
    toISOString: CallbackTo[String],
    toPostgres: CallbackTo[String],
    days: Int | Double = null,
    hours: Int | Double = null,
    milliseconds: Int | Double = null,
    minutes: Int | Double = null,
    months: Int | Double = null,
    seconds: Int | Double = null,
    years: Int | Double = null
  ): IPostgresInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toISO")(toISO.toJsFn)
    __obj.updateDynamic("toISOString")(toISOString.toJsFn)
    __obj.updateDynamic("toPostgres")(toPostgres.toJsFn)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresInterval]
  }
}

