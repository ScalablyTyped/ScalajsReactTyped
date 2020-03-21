package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.left
import typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListBaseProps extends CalendarBaseProps {
  /**
    *  Set custom calendar heigth.
    */
  var calendarHeight: js.UndefOr[Double] = js.undefined
  /**
    *  Set custom calendar width.
    */
  var calendarWidth: js.UndefOr[Double] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.undefined
  /**
    *  Enable horizontal scrolling, default = false
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    *  Enable paging on horizontal, default = false
    */
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.undefined
  /**
    *  Enable or disable scrolling of calendar list
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    *  When true, the calendar list scrolls to top when the status bar is tapped. Default = true
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Initially selected day
    */
  var selected: js.UndefOr[String] = js.undefined
  /**
    *  Enable or disable vertical scroll indicator. Default = false
    */
  var showScrollIndicator: js.UndefOr[Boolean] = js.undefined
}

object CalendarListBaseProps {
  @scala.inline
  def apply(
    calendarHeight: Int | Double = null,
    calendarWidth: Int | Double = null,
    current: TCalendarDate = null,
    dayComponent: (Component[DayComponentProps with js.Object, js.Object]) | SFC[DayComponentProps] = null,
    disableMonthChange: js.UndefOr[Boolean] = js.undefined,
    disabledByDefault: js.UndefOr[Boolean] = js.undefined,
    displayLoadingIndicator: js.UndefOr[Boolean] = js.undefined,
    firstDay: Int | Double = null,
    futureScrollRange: Int | Double = null,
    hideArrows: js.UndefOr[Boolean] = js.undefined,
    hideDayNames: js.UndefOr[Boolean] = js.undefined,
    hideExtraDays: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    maxDate: TCalendarDate = null,
    minDate: TCalendarDate = null,
    monthFormat: String = null,
    onDayLongPress: /* date */ DateObject => Callback = null,
    onDayPress: /* date */ DateObject => Callback = null,
    onMonthChange: /* date */ DateObject => Callback = null,
    onPressArrowLeft: /* substractMonth */ js.Function0[Unit] => Callback = null,
    onPressArrowRight: /* addMonth */ js.Function0[Unit] => Callback = null,
    onVisibleMonthsChange: /* months */ js.Array[DateObject] => Callback = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    pastScrollRange: Int | Double = null,
    renderArrow: /* direction */ left | right => CallbackTo[Node] = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    selected: String = null,
    showScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    theme: CalendarTheme = null
  ): CalendarListBaseProps = {
    val __obj = js.Dynamic.literal()
    if (calendarHeight != null) __obj.updateDynamic("calendarHeight")(calendarHeight.asInstanceOf[js.Any])
    if (calendarWidth != null) __obj.updateDynamic("calendarWidth")(calendarWidth.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonthChange)) __obj.updateDynamic("disableMonthChange")(disableMonthChange.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledByDefault)) __obj.updateDynamic("disabledByDefault")(disabledByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLoadingIndicator)) __obj.updateDynamic("displayLoadingIndicator")(displayLoadingIndicator.asInstanceOf[js.Any])
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (futureScrollRange != null) __obj.updateDynamic("futureScrollRange")(futureScrollRange.asInstanceOf[js.Any])
    if (!js.isUndefined(hideArrows)) __obj.updateDynamic("hideArrows")(hideArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDayNames)) __obj.updateDynamic("hideDayNames")(hideDayNames.asInstanceOf[js.Any])
    if (!js.isUndefined(hideExtraDays)) __obj.updateDynamic("hideExtraDays")(hideExtraDays.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onDayLongPress != null) __obj.updateDynamic("onDayLongPress")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => onDayLongPress(t0).runNow()))
    if (onDayPress != null) __obj.updateDynamic("onDayPress")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => onDayPress(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject) => onMonthChange(t0).runNow()))
    if (onPressArrowLeft != null) __obj.updateDynamic("onPressArrowLeft")(js.Any.fromFunction1((t0: /* substractMonth */ js.Function0[scala.Unit]) => onPressArrowLeft(t0).runNow()))
    if (onPressArrowRight != null) __obj.updateDynamic("onPressArrowRight")(js.Any.fromFunction1((t0: /* addMonth */ js.Function0[scala.Unit]) => onPressArrowRight(t0).runNow()))
    if (onVisibleMonthsChange != null) __obj.updateDynamic("onVisibleMonthsChange")(js.Any.fromFunction1((t0: /* months */ js.Array[typingsJapgolly.reactNativeCalendars.mod.DateObject]) => onVisibleMonthsChange(t0).runNow()))
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (pastScrollRange != null) __obj.updateDynamic("pastScrollRange")(pastScrollRange.asInstanceOf[js.Any])
    if (renderArrow != null) __obj.updateDynamic("renderArrow")(js.Any.fromFunction1((t0: /* direction */ typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.left | typingsJapgolly.reactNativeCalendars.reactNativeCalendarsStrings.right) => renderArrow(t0).runNow()))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollIndicator)) __obj.updateDynamic("showScrollIndicator")(showScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListBaseProps]
  }
}

