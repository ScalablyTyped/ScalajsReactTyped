package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.calendarMod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCalendar.calendarPropsMod.SelectDateType
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.headerMod.PropsType
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.horizontal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.vertical
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    defaultDate: js.Date = null,
    defaultTimeValue: js.Date = null,
    defaultValue: SelectDateType = null,
    enterDirection: horizontal | vertical = null,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onCancel: js.UndefOr[Callback] = js.undefined,
    onClear: js.UndefOr[Callback] = js.undefined,
    onConfirm: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Callback = null,
    onSelect: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => CallbackTo[SelectDateType | Unit] = null,
    onSelectHasDisableDate: /* date */ js.Array[js.Date] => Callback = null,
    pickTime: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    renderHeader: /* prop */ PropsType => CallbackTo[Node] = null,
    renderShortcut: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => CallbackTo[Node] = null,
    rowSize: normal | xl = null,
    showShortcut: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePickerPickerPrefixCls: String = null,
    timePickerPrefixCls: String = null,
    title: String = null,
    `type`: one | range = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.rmcCalendar.calendarPropsMod.PropsType, 
    default, 
    Unit, 
    typingsJapgolly.rmcCalendar.calendarPropsMod.PropsType
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultTimeValue != null) __obj.updateDynamic("defaultTimeValue")(defaultTimeValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enterDirection != null) __obj.updateDynamic("enterDirection")(enterDirection.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.asInstanceOf[js.Any])
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    onCancel.foreach(p => __obj.updateDynamic("onCancel")(p.toJsFn))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2((t0: /* startDateTime */ js.UndefOr[js.Date], t1: /* endDateTime */ js.UndefOr[js.Date]) => onConfirm(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => onSelect(t0, t1).runNow()))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => onSelectHasDisableDate(t0).runNow()))
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction1((t0: /* prop */ typingsJapgolly.rmcCalendar.headerMod.PropsType) => renderHeader(t0).runNow()))
    if (renderShortcut != null) __obj.updateDynamic("renderShortcut")(js.Any.fromFunction1((t0: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], scala.Unit]) => renderShortcut(t0).runNow()))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShortcut)) __obj.updateDynamic("showShortcut")(showShortcut.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePickerPickerPrefixCls != null) __obj.updateDynamic("timePickerPickerPrefixCls")(timePickerPickerPrefixCls.asInstanceOf[js.Any])
    if (timePickerPrefixCls != null) __obj.updateDynamic("timePickerPrefixCls")(timePickerPrefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCalendar.calendarPropsMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.calendarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCalendar.calendarPropsMod.PropsType])(children: _*)
  }
  @JSImport("antd-mobile/lib/calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

