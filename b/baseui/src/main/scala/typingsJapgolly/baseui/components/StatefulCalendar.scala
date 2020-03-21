package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonBeginDate
import typingsJapgolly.baseui.AnonDate
import typingsJapgolly.baseui.AnonDateDate
import typingsJapgolly.baseui.AnonDateEvent
import typingsJapgolly.baseui.StatefulDatepickerPropsCa
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.mouseOver
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveLeft
import typingsJapgolly.baseui.baseuiStrings.moveRight
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.datepickerMod.CalendarProps
import typingsJapgolly.baseui.datepickerMod.ContainerState
import typingsJapgolly.baseui.datepickerMod.DatepickerOverrides
import typingsJapgolly.baseui.datepickerMod.SharedStylePropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulCalendar {
  def apply(
    autoFocusCalendar: js.UndefOr[Boolean] = js.undefined,
    excludeDates: js.Array[js.Date] = null,
    filterDate: /* day */ js.Date => CallbackTo[Boolean] = null,
    highlightedDate: js.Date = null,
    includeDates: js.Array[js.Date] = null,
    initialState: ContainerState = null,
    locale: js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsShown: Int | Double = null,
    onChange: /* args */ AnonDate => CallbackTo[js.Any] = null,
    onDayClick: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onDayMouseLeave: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onDayMouseOver: /* args */ AnonDateEvent => CallbackTo[js.Any] = null,
    onMonthChange: /* args */ AnonDateDate => CallbackTo[js.Any] = null,
    onYearChange: /* args */ AnonDateDate => CallbackTo[js.Any] = null,
    orientation: horizontal | vertical = null,
    overrides: DatepickerOverrides[SharedStylePropsT] = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    quickSelect: js.UndefOr[Boolean] = js.undefined,
    quickSelectOptions: js.Array[AnonBeginDate] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => CallbackTo[ContainerState] = null,
    timeSelectEnd: js.UndefOr[Boolean] = js.undefined,
    timeSelectStart: js.UndefOr[Boolean] = js.undefined,
    trapTabbing: js.UndefOr[Boolean] = js.undefined,
    value: js.Date | js.Array[js.Date] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* args */ CalendarProps => CallbackTo[Node] = null
  ): UnmountedSimple[
    StatefulDatepickerPropsCa, 
    MountedWithRawType[
      StatefulDatepickerPropsCa, 
      js.Object, 
      RawMounted[StatefulDatepickerPropsCa, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.datepickerMod.CalendarProps) => children(t0).runNow()))
    if (!js.isUndefined(autoFocusCalendar)) __obj.updateDynamic("autoFocusCalendar")(autoFocusCalendar.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1((t0: /* day */ js.Date) => filterDate(t0).runNow()))
    if (highlightedDate != null) __obj.updateDynamic("highlightedDate")(highlightedDate.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDate) => onChange(t0).runNow()))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayClick(t0).runNow()))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayMouseLeave(t0).runNow()))
    if (onDayMouseOver != null) __obj.updateDynamic("onDayMouseOver")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateEvent) => onDayMouseOver(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateDate) => onMonthChange(t0).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDateDate) => onYearChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(quickSelect)) __obj.updateDynamic("quickSelect")(quickSelect.asInstanceOf[js.Any])
    if (quickSelectOptions != null) __obj.updateDynamic("quickSelectOptions")(quickSelectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ typingsJapgolly.baseui.baseuiStrings.mouseLeave | typingsJapgolly.baseui.baseuiStrings.moveRight | typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.mouseOver | typingsJapgolly.baseui.baseuiStrings.change_ | typingsJapgolly.baseui.baseuiStrings.moveLeft, t1: /* nextState */ typingsJapgolly.baseui.datepickerMod.ContainerState, t2: /* currentState */ typingsJapgolly.baseui.datepickerMod.ContainerState) => stateReducer(t0, t1, t2).runNow()))
    if (!js.isUndefined(timeSelectEnd)) __obj.updateDynamic("timeSelectEnd")(timeSelectEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(timeSelectStart)) __obj.updateDynamic("timeSelectStart")(timeSelectStart.asInstanceOf[js.Any])
    if (!js.isUndefined(trapTabbing)) __obj.updateDynamic("trapTabbing")(trapTabbing.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.StatefulDatepickerPropsCa, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.StatefulDatepickerPropsCa])
  }
  @JSImport("baseui/datepicker", "StatefulCalendar")
  @js.native
  object componentImport extends js.Object
  
}

