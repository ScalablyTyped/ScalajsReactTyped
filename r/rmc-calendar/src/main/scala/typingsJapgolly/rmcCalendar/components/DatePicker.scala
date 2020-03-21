package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.datePickerMod.default
import typingsJapgolly.rmcCalendar.datePickerPropsMod.PropsType
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  def apply(
    defaultDate: js.Date = null,
    endDate: js.Date = null,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: Int | Double = null,
    locale: Locale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onCellClick: /* date */ js.Date => Callback = null,
    onLayout: /* clientHight */ Double => Callback = null,
    onSelectHasDisableDate: /* date */ js.Array[js.Date] => Callback = null,
    prefixCls: String = null,
    rowSize: normal | xl = null,
    startDate: js.Date = null,
    `type`: one | range = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, default, Unit, PropsType] = {
    val __obj = js.Dynamic.literal()
  
      if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.asInstanceOf[js.Any])
    if (initalMonths != null) __obj.updateDynamic("initalMonths")(initalMonths.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction1((t0: /* date */ js.Date) => onCellClick(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* clientHight */ scala.Double) => onLayout(t0).runNow()))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1((t0: /* date */ js.Array[js.Date]) => onSelectHasDisableDate(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCalendar.datePickerPropsMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcCalendar.datePickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCalendar.datePickerPropsMod.PropsType])(children: _*)
  }
  @JSImport("rmc-calendar/lib/DatePicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

