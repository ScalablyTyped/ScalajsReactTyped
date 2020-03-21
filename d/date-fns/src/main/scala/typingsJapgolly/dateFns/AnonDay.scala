package typingsJapgolly.dateFns

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  def day(args: js.Any*): js.Any
  def dayPeriod(args: js.Any*): js.Any
  def era(args: js.Any*): js.Any
  def month(args: js.Any*): js.Any
  def ordinalNumber(args: js.Any*): js.Any
  def quarter(args: js.Any*): js.Any
}

object AnonDay {
  @scala.inline
  def apply(
    day: /* repeated */ js.Any => CallbackTo[js.Any],
    dayPeriod: /* repeated */ js.Any => CallbackTo[js.Any],
    era: /* repeated */ js.Any => CallbackTo[js.Any],
    month: /* repeated */ js.Any => CallbackTo[js.Any],
    ordinalNumber: /* repeated */ js.Any => CallbackTo[js.Any],
    quarter: /* repeated */ js.Any => CallbackTo[js.Any]
  ): AnonDay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => day(t0).runNow()))
    __obj.updateDynamic("dayPeriod")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => dayPeriod(t0).runNow()))
    __obj.updateDynamic("era")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => era(t0).runNow()))
    __obj.updateDynamic("month")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => month(t0).runNow()))
    __obj.updateDynamic("ordinalNumber")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => ordinalNumber(t0).runNow()))
    __obj.updateDynamic("quarter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => quarter(t0).runNow()))
    __obj.asInstanceOf[AnonDay]
  }
}

