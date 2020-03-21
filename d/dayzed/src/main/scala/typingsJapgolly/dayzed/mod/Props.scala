package typingsJapgolly.dayzed.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.dayzed.dayzedNumbers.`0`
import typingsJapgolly.dayzed.dayzedNumbers.`1`
import typingsJapgolly.dayzed.dayzedNumbers.`2`
import typingsJapgolly.dayzed.dayzedNumbers.`3`
import typingsJapgolly.dayzed.dayzedNumbers.`4`
import typingsJapgolly.dayzed.dayzedNumbers.`5`
import typingsJapgolly.dayzed.dayzedNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[RenderFn] = js.undefined
  var date: js.UndefOr[js.Date] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var monthsToDisplay: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
  var render: js.UndefOr[RenderFn] = js.undefined
  var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
  var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  def onDateSelected(selectedDate: DateObj): Unit
}

object Props {
  @scala.inline
  def apply(
    onDateSelected: DateObj => Callback,
    children: /* renderProps */ RenderProps => CallbackTo[Node] = null,
    date: js.Date = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsToDisplay: Int | Double = null,
    offset: Int | Double = null,
    onOffsetChanged: /* offset */ Double => Callback = null,
    render: /* renderProps */ RenderProps => CallbackTo[Node] = null,
    selected: js.Date | js.Array[js.Date] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDateSelected")(js.Any.fromFunction1((t0: typingsJapgolly.dayzed.mod.DateObj) => onDateSelected(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* renderProps */ typingsJapgolly.dayzed.mod.RenderProps) => children(t0).runNow()))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsToDisplay != null) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(js.Any.fromFunction1((t0: /* offset */ scala.Double) => onOffsetChanged(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* renderProps */ typingsJapgolly.dayzed.mod.RenderProps) => render(t0).runNow()))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

