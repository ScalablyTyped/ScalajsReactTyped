package typingsJapgolly.reactDayPicker

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDayPicker.commonMod.RangeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddDayToRange extends js.Object {
  def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier
  def addMonths(d: js.Date, n: Double): js.Date
  def clone(d: js.Date): js.Date
  def isDate(d: js.Date): Boolean
  def isDayAfter(day1: js.Date, day2: js.Date): Boolean
  def isDayBefore(day1: js.Date, day2: js.Date): Boolean
  def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean
  def isDayInRange(day: js.Date, range: RangeModifier): Boolean
  def isFutureDay(day: js.Date): Boolean
  def isPastDay(day: js.Date): Boolean
  def isSameDay(day1: js.Date, day2: js.Date): Boolean
  def isSameMonth(day1: js.Date, day2: js.Date): Boolean
}

object AnonAddDayToRange {
  @scala.inline
  def apply(
    addDayToRange: (js.Date, RangeModifier) => CallbackTo[RangeModifier],
    addMonths: (js.Date, Double) => CallbackTo[js.Date],
    clone: js.Date => CallbackTo[js.Date],
    isDate: js.Date => CallbackTo[Boolean],
    isDayAfter: (js.Date, js.Date) => CallbackTo[Boolean],
    isDayBefore: (js.Date, js.Date) => CallbackTo[Boolean],
    isDayBetween: (js.Date, js.Date, js.Date) => CallbackTo[Boolean],
    isDayInRange: (js.Date, RangeModifier) => CallbackTo[Boolean],
    isFutureDay: js.Date => CallbackTo[Boolean],
    isPastDay: js.Date => CallbackTo[Boolean],
    isSameDay: (js.Date, js.Date) => CallbackTo[Boolean],
    isSameMonth: (js.Date, js.Date) => CallbackTo[Boolean]
  ): AnonAddDayToRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDayToRange")(js.Any.fromFunction2((t0: js.Date, t1: typingsJapgolly.reactDayPicker.commonMod.RangeModifier) => addDayToRange(t0, t1).runNow()))
    __obj.updateDynamic("addMonths")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => addMonths(t0, t1).runNow()))
    __obj.updateDynamic("clone")(js.Any.fromFunction1((t0: js.Date) => clone(t0).runNow()))
    __obj.updateDynamic("isDate")(js.Any.fromFunction1((t0: js.Date) => isDate(t0).runNow()))
    __obj.updateDynamic("isDayAfter")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => isDayAfter(t0, t1).runNow()))
    __obj.updateDynamic("isDayBefore")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => isDayBefore(t0, t1).runNow()))
    __obj.updateDynamic("isDayBetween")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Date) => isDayBetween(t0, t1, t2).runNow()))
    __obj.updateDynamic("isDayInRange")(js.Any.fromFunction2((t0: js.Date, t1: typingsJapgolly.reactDayPicker.commonMod.RangeModifier) => isDayInRange(t0, t1).runNow()))
    __obj.updateDynamic("isFutureDay")(js.Any.fromFunction1((t0: js.Date) => isFutureDay(t0).runNow()))
    __obj.updateDynamic("isPastDay")(js.Any.fromFunction1((t0: js.Date) => isPastDay(t0).runNow()))
    __obj.updateDynamic("isSameDay")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => isSameDay(t0, t1).runNow()))
    __obj.updateDynamic("isSameMonth")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => isSameMonth(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAddDayToRange]
  }
}

