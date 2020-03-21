package typingsJapgolly.reactDateRange.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDateRange.mod.CalendarProps
import typingsJapgolly.reactDateRange.mod.CalendarTheme
import typingsJapgolly.reactDateRange.mod.DateInputType
import typingsJapgolly.reactDateRange.mod.LanguageType
import typingsJapgolly.reactDateRange.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    date: DateInputType,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    lang: LanguageType = null,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onChange: /* range */ Range => Callback = null,
    onInit: /* range */ Range => Callback = null,
    theme: CalendarTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CalendarProps, typingsJapgolly.reactDateRange.mod.Calendar, Unit, CalendarProps] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
  
      if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onChange(t0).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: /* range */ typingsJapgolly.reactDateRange.mod.Range) => onInit(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDateRange.mod.CalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDateRange.mod.Calendar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDateRange.mod.CalendarProps])(children: _*)
  }
  @JSImport("react-date-range", "Calendar")
  @js.native
  object componentImport extends js.Object
  
}

