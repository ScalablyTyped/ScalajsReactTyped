package typingsJapgolly.reactInputCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInputCalendar {
  def apply(
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    computableFormat: String = null,
    date: String | js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    inputFieldClass: String = null,
    inputFieldId: String = null,
    maxDate: String | js.Date = null,
    minDate: String | js.Date = null,
    minView: Int | Double = null,
    onBlur: (/* event */ ReactEventFrom[
      typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar with Element
    ], /* computableDate */ String) => Callback = null,
    onChange: /* computableDate */ String => Callback = null,
    onFocus: /* event */ ReactEventFrom[
      typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar with Element
    ] => Callback = null,
    openOnInputFocus: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactInputCalendarProps, 
    typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar, 
    Unit, 
    ReactInputCalendarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (computableFormat != null) __obj.updateDynamic("computableFormat")(computableFormat.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputFieldClass != null) __obj.updateDynamic("inputFieldClass")(inputFieldClass.asInstanceOf[js.Any])
    if (inputFieldId != null) __obj.updateDynamic("inputFieldId")(inputFieldId.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minView != null) __obj.updateDynamic("minView")(minView.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar with org.scalajs.dom.raw.Element], t1: /* computableDate */ java.lang.String) => onBlur(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* computableDate */ java.lang.String) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[
  typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (!js.isUndefined(openOnInputFocus)) __obj.updateDynamic("openOnInputFocus")(openOnInputFocus.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInputCalendar.reactInputCalendar.ReactInputCalendarProps])(children: _*)
  }
  @JSGlobal("reactInputCalendar.ReactInputCalendar")
  @js.native
  object componentImport extends js.Object
  
}

