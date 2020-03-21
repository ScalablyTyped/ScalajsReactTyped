package typingsJapgolly.reactDaterangePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.momentRange.mod.DateRange
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactDaterangePicker.MomentRangeNoneinpMomentI
import typingsJapgolly.reactDaterangePicker.mod.DateRangePicker
import typingsJapgolly.reactDaterangePicker.mod.DateState
import typingsJapgolly.reactDaterangePicker.mod.OnSelectCallbackParam
import typingsJapgolly.reactDaterangePicker.mod.PaginationArrowProps
import typingsJapgolly.reactDaterangePicker.mod.StateDefinitions
import typingsJapgolly.reactDaterangePicker.mod.default
import typingsJapgolly.reactDaterangePicker.reactDaterangePickerStrings.range
import typingsJapgolly.reactDaterangePicker.reactDaterangePickerStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDaterangePicker {
  def RangeProps(
    bemBlock: String = null,
    bemNamespace: String = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: Int | Double = null,
    helpMessage: String = null,
    initialDate: js.Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: Int | Double = null,
    initialRange: js.Object = null,
    initialYear: Int | Double = null,
    maximumDate: js.Date = null,
    minimumDate: js.Date = null,
    numberOfCalendars: Int | Double = null,
    onHighlightDate: /* date */ js.Date => Callback = null,
    onHighlightRange: /* date */ js.Date => Callback = null,
    onSelect: /* value */ OnSelectCallbackParam => Callback = null,
    onSelectStart: /* value */ MomentRangeNoneinpMomentI => Callback = null,
    paginationArrowComponent: (ComponentClassP[PaginationArrowProps[js.Object] with js.Object]) | SFC[PaginationArrowProps[js.Object]] = null,
    selectedLabel: String = null,
    selectionType: range = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: MomentRangeNoneinpMomentI | DateRange | Moment = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactDaterangePicker.mod.RangeProps[DateRangePicker], 
    default, 
    Unit, 
    typingsJapgolly.reactDaterangePicker.mod.RangeProps[DateRangePicker]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.asInstanceOf[js.Any])
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1((t0: /* date */ js.Date) => onHighlightDate(t0).runNow()))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onHighlightRange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactDaterangePicker.mod.OnSelectCallbackParam) => onSelect(t0).runNow()))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactDaterangePicker.MomentRangeNoneinpMomentI) => onSelectStart(t0).runNow()))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDaterangePicker.mod.RangeProps[typingsJapgolly.reactDaterangePicker.mod.DateRangePicker], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDaterangePicker.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDaterangePicker.mod.RangeProps[typingsJapgolly.reactDaterangePicker.mod.DateRangePicker]])(children: _*)
  }
  def SingleProps(
    bemBlock: String = null,
    bemNamespace: String = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: Int | Double = null,
    helpMessage: String = null,
    initialDate: js.Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: Int | Double = null,
    initialRange: js.Object = null,
    initialYear: Int | Double = null,
    maximumDate: js.Date = null,
    minimumDate: js.Date = null,
    numberOfCalendars: Int | Double = null,
    onHighlightDate: /* date */ js.Date => Callback = null,
    onHighlightRange: /* date */ js.Date => Callback = null,
    onSelect: /* value */ Moment => Callback = null,
    onSelectStart: /* value */ MomentRangeNoneinpMomentI => Callback = null,
    paginationArrowComponent: (ComponentClassP[PaginationArrowProps[js.Object] with js.Object]) | SFC[PaginationArrowProps[js.Object]] = null,
    selectedLabel: String = null,
    selectionType: single = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: MomentRangeNoneinpMomentI | DateRange | Moment = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactDaterangePicker.mod.SingleProps[DateRangePicker], 
    default, 
    Unit, 
    typingsJapgolly.reactDaterangePicker.mod.SingleProps[DateRangePicker]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.asInstanceOf[js.Any])
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1((t0: /* date */ js.Date) => onHighlightDate(t0).runNow()))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onHighlightRange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.moment.mod.Moment) => onSelect(t0).runNow()))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactDaterangePicker.MomentRangeNoneinpMomentI) => onSelectStart(t0).runNow()))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDaterangePicker.mod.SingleProps[typingsJapgolly.reactDaterangePicker.mod.DateRangePicker], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDaterangePicker.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDaterangePicker.mod.SingleProps[typingsJapgolly.reactDaterangePicker.mod.DateRangePicker]])(children: _*)
  }
  @JSImport("react-daterange-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

