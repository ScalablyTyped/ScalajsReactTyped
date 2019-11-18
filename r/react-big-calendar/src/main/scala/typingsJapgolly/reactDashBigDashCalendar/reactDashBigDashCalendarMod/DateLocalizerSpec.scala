package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocalizerSpec extends js.Object {
  var formats: Formats
  var propType: js.UndefOr[Validator[_]] = js.undefined
  def firstOfWeek(culture: Culture): Double
  def format(value: FormatInput, format: String, culture: Culture): String
}

object DateLocalizerSpec {
  @scala.inline
  def apply(
    firstOfWeek: Culture => CallbackTo[Double],
    format: (FormatInput, String, Culture) => CallbackTo[String],
    formats: Formats,
    propType: Validator[_] = null
  ): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("firstOfWeek")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Culture) => firstOfWeek(t0).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction3((t0: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.FormatInput, t1: java.lang.String, t2: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Culture) => format(t0, t1, t2).runNow()))
    if (propType != null) __obj.updateDynamic("propType")(propType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocalizerSpec]
  }
}

