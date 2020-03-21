package typingsJapgolly.reactInfiniteCalendar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.reactInfiniteCalendar.AnonAccentColor
import typingsJapgolly.reactInfiniteCalendar.AnonBlank
import typingsJapgolly.reactInfiniteCalendar.AnonEnd
import typingsJapgolly.reactInfiniteCalendar.AnonHideYearsOnSelect
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInfiniteCalendarProps extends js.Object {
  var Component: js.UndefOr[ComponentClassP[ReactInfiniteCalendarProps with js.Object]] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabledDates: js.UndefOr[js.Array[DateType]] = js.undefined
  var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.undefined
  var display: js.UndefOr[days | years] = js.undefined
  var displayOptions: js.UndefOr[AnonHideYearsOnSelect] = js.undefined
  var height: js.UndefOr[Double | auto] = js.undefined
  var interpolateSelection: js.UndefOr[
    js.Function2[/* date */ js.Date, /* selected */ js.Array[js.Date], js.Array[js.Date]]
  ] = js.undefined
  var locale: js.UndefOr[AnonBlank] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxDate: js.UndefOr[DateType] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minDate: js.UndefOr[DateType] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
  var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
  var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var selected: js.UndefOr[DateType | `false` | AnonEnd] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[AnonAccentColor] = js.undefined
  var width: js.UndefOr[Double | auto | `100Percentsign`] = js.undefined
}

object ReactInfiniteCalendarProps {
  @scala.inline
  def apply(
    Component: ComponentClassP[ReactInfiniteCalendarProps with js.Object] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabledDates: js.Array[DateType] = null,
    disabledDays: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = null,
    display: days | years = null,
    displayOptions: AnonHideYearsOnSelect = null,
    height: Double | auto = null,
    interpolateSelection: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => CallbackTo[js.Array[js.Date]] = null,
    locale: AnonBlank = null,
    max: DateType = null,
    maxDate: DateType = null,
    min: DateType = null,
    minDate: DateType = null,
    onScroll: /* scrollTop */ Double => Callback = null,
    onScrollEnd: /* scrollTop */ Double => Callback = null,
    onSelect: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Callback = null,
    rowHeight: Int | Double = null,
    selected: DateType | `false` | AnonEnd = null,
    tabIndex: Int | Double = null,
    theme: AnonAccentColor = null,
    width: Double | auto | `100Percentsign` = null
  ): ReactInfiniteCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolateSelection != null) __obj.updateDynamic("interpolateSelection")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* selected */ js.Array[js.Date]) => interpolateSelection(t0, t1).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* scrollTop */ scala.Double) => onScroll(t0).runNow()))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction1((t0: /* scrollTop */ scala.Double) => onScrollEnd(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: (/* date */ js.Date) | (/* rangedDate */ typingsJapgolly.reactInfiniteCalendar.mod.RangedSelection)) => onSelect(t0).runNow()))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactInfiniteCalendarProps]
  }
}

