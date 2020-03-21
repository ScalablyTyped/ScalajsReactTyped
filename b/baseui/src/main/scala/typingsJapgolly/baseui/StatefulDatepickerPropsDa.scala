package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.mouseOver
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveLeft
import typingsJapgolly.baseui.baseuiStrings.moveRight
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.datepickerMod.ContainerState
import typingsJapgolly.baseui.datepickerMod.DatepickerOverrides
import typingsJapgolly.baseui.datepickerMod.DatepickerProps
import typingsJapgolly.baseui.datepickerMod.SharedStylePropsT
import typingsJapgolly.baseui.datepickerMod.StateReducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/datepicker.StatefulDatepickerProps<baseui.baseui/datepicker.DatepickerProps> */
trait StatefulDatepickerPropsDa extends js.Object {
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var autoFocusCalendar: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Function1[/* args */ DatepickerProps, Node]] = js.undefined
  var clearable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var excludeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  var filterDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  var formatDisplayValue: js.UndefOr[
    js.Function2[/* date */ js.Date | js.Array[js.Date], /* formatString */ String, String]
  ] = js.undefined
  var formatString: js.UndefOr[String] = js.undefined
  var highlightedDate: js.UndefOr[js.Date] = js.undefined
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.undefined
  var initialState: js.UndefOr[ContainerState] = js.undefined
  // see https://github.com/date-fns/date-fns/blob/master/src/locale/index.js.flow
  var locale: js.UndefOr[js.Any] = js.undefined
  var mask: js.UndefOr[String | Null] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var monthsShown: js.UndefOr[Double] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onChange: js.UndefOr[typingsJapgolly.baseui.datepickerMod.onChange] = js.undefined
  var onClose: js.UndefOr[js.Function0[_]] = js.undefined
  var onDayClick: js.UndefOr[js.Function1[/* args */ AnonDateEvent, _]] = js.undefined
  var onDayMouseLeave: js.UndefOr[js.Function1[/* args */ AnonDateEvent, _]] = js.undefined
  var onDayMouseOver: js.UndefOr[js.Function1[/* args */ AnonDateEvent, _]] = js.undefined
  var onMonthChange: js.UndefOr[js.Function1[/* args */ AnonDateDate, _]] = js.undefined
  var onYearChange: js.UndefOr[js.Function1[/* args */ AnonDateDate, _]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var overrides: js.UndefOr[DatepickerOverrides[SharedStylePropsT]] = js.undefined
  var peekNextMonth: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var quickSelect: js.UndefOr[Boolean] = js.undefined
  var quickSelectOptions: js.UndefOr[js.Array[AnonBeginDate]] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  var timeSelectEnd: js.UndefOr[Boolean] = js.undefined
  var timeSelectStart: js.UndefOr[Boolean] = js.undefined
  var trapTabbing: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Date | js.Array[js.Date] | Null] = js.undefined
}

object StatefulDatepickerPropsDa {
  @scala.inline
  def apply(
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocusCalendar: js.UndefOr[Boolean] = js.undefined,
    children: /* args */ DatepickerProps => CallbackTo[Node] = null,
    clearable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    excludeDates: js.Array[js.Date] = null,
    filterDate: /* day */ js.Date => CallbackTo[Boolean] = null,
    formatDisplayValue: (/* date */ js.Date | js.Array[js.Date], /* formatString */ String) => CallbackTo[String] = null,
    formatString: String = null,
    highlightedDate: js.Date = null,
    includeDates: js.Array[js.Date] = null,
    initialState: ContainerState = null,
    locale: js.Any = null,
    mask: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsShown: Int | Double = null,
    mountNode: HTMLElement = null,
    onChange: /* args */ AnonDate => CallbackTo[js.Any] = null,
    onClose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onDayClick: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onDayMouseLeave: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onDayMouseOver: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onMonthChange: /* args */ AnonDateDate => CallbackTo[js.Any] = null,
    onYearChange: /* args */ AnonDateDate => CallbackTo[js.Any] = null,
    orientation: horizontal | vertical = null,
    overrides: DatepickerOverrides[SharedStylePropsT] = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    quickSelect: js.UndefOr[Boolean] = js.undefined,
    quickSelectOptions: js.Array[AnonBeginDate] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    stateReducer: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => CallbackTo[ContainerState] = null,
    timeSelectEnd: js.UndefOr[Boolean] = js.undefined,
    timeSelectStart: js.UndefOr[Boolean] = js.undefined,
    trapTabbing: js.UndefOr[Boolean] = js.undefined,
    value: js.Date | js.Array[js.Date] = null
  ): StatefulDatepickerPropsDa = {
    val __obj = js.Dynamic.literal()
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocusCalendar)) __obj.updateDynamic("autoFocusCalendar")(autoFocusCalendar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.datepickerMod.DatepickerProps) => children(t0).runNow()))
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1((t0: /* day */ js.Date) => filterDate(t0).runNow()))
    if (formatDisplayValue != null) __obj.updateDynamic("formatDisplayValue")(js.Any.fromFunction2((t0: /* date */ js.Date | js.Array[js.Date], t1: /* formatString */ java.lang.String) => formatDisplayValue(t0, t1).runNow()))
    if (formatString != null) __obj.updateDynamic("formatString")(formatString.asInstanceOf[js.Any])
    if (highlightedDate != null) __obj.updateDynamic("highlightedDate")(highlightedDate.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDate) => onChange(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayClick(t0).runNow()))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayMouseLeave(t0).runNow()))
    if (onDayMouseOver != null) __obj.updateDynamic("onDayMouseOver")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayMouseOver(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateDate) => onMonthChange(t0).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateDate) => onYearChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(quickSelect)) __obj.updateDynamic("quickSelect")(quickSelect.asInstanceOf[js.Any])
    if (quickSelectOptions != null) __obj.updateDynamic("quickSelectOptions")(quickSelectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ typingsJapgolly.baseui.baseuiStrings.mouseLeave | typingsJapgolly.baseui.baseuiStrings.moveRight | typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.mouseOver | typingsJapgolly.baseui.baseuiStrings.change_ | typingsJapgolly.baseui.baseuiStrings.moveLeft, t1: /* nextState */ typingsJapgolly.baseui.datepickerMod.ContainerState, t2: /* currentState */ typingsJapgolly.baseui.datepickerMod.ContainerState) => stateReducer(t0, t1, t2).runNow()))
    if (!js.isUndefined(timeSelectEnd)) __obj.updateDynamic("timeSelectEnd")(timeSelectEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectStart)) __obj.updateDynamic("timeSelectStart")(timeSelectStart.asInstanceOf[js.Any])
    if (!js.isUndefined(trapTabbing)) __obj.updateDynamic("trapTabbing")(trapTabbing.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulDatepickerPropsDa]
  }
}

