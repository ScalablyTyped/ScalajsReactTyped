package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactWidgets.calendarMod.CalendarMessages
import typingsJapgolly.reactWidgets.calendarMod.CalendarProps
import typingsJapgolly.reactWidgets.calendarMod.CalendarView
import typingsJapgolly.reactWidgets.mod.Calendar.^
import typingsJapgolly.reactWidgets.reactWidgetsStrings.century
import typingsJapgolly.reactWidgets.reactWidgetsStrings.decade
import typingsJapgolly.reactWidgets.reactWidgetsStrings.month
import typingsJapgolly.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    centuryFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    culture: String = null,
    currentDate: js.Date = null,
    dateFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    dayComponent: ReactType[_] = null,
    dayFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    decadeFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    defaultValue: js.Date = null,
    defaultView: CalendarView = null,
    disabled: Boolean | js.Array[_] = null,
    finalView: month | year | decade | century = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    footerFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    headerFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    id: String = null,
    initialView: month | year | decade | century = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    max: js.Date = null,
    messages: CalendarMessages = null,
    min: js.Date = null,
    monthFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    onChange: /* date */ js.UndefOr[js.Date] => Callback = null,
    onCurrentDateChange: /* date */ js.UndefOr[js.Date] => Callback = null,
    onKeyDown: /* event */ KeyboardEvent => Callback = null,
    onNavigate: (/* date */ js.Date, /* direction */ String, /* view */ String) => Callback = null,
    onViewChange: js.UndefOr[Callback] = js.undefined,
    readOnly: Boolean | js.Array[_] = null,
    value: js.Date = null,
    view: CalendarView = null,
    views: js.Array[CalendarView] = null,
    yearFormat: String | (js.Function1[/* day */ js.Date, String]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CalendarProps, ^, Unit, CalendarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (centuryFormat != null) __obj.updateDynamic("centuryFormat")(centuryFormat.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayComponent != null) __obj.updateDynamic("dayComponent")(dayComponent.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (decadeFormat != null) __obj.updateDynamic("decadeFormat")(decadeFormat.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerFormat != null) __obj.updateDynamic("footerFormat")(footerFormat.asInstanceOf[js.Any])
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[js.Date]) => onChange(t0).runNow()))
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[js.Date]) => onCurrentDateChange(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction3((t0: /* date */ js.Date, t1: /* direction */ java.lang.String, t2: /* view */ java.lang.String) => onNavigate(t0, t1, t2).runNow()))
    onViewChange.foreach(p => __obj.updateDynamic("onViewChange")(p.toJsFn))
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWidgets.calendarMod.CalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactWidgets.mod.Calendar.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWidgets.calendarMod.CalendarProps])(children: _*)
  }
  @JSImport("react-widgets", "Calendar")
  @js.native
  object componentImport extends js.Object
  
}

