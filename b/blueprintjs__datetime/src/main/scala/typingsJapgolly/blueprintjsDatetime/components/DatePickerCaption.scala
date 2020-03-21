package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod.IDatePickerCaptionProps
import typingsJapgolly.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerCaption {
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date,
    months: js.Array[String] = null,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    onDateChange: /* date */ js.Date => Callback = null,
    onMonthChange: /* month */ Double => Callback = null,
    onYearChange: /* year */ Double => Callback = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDatePickerCaptionProps, 
    typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod.DatePickerCaption, 
    Unit, 
    IDatePickerCaptionProps
  ] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
  
      if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onDateChange(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* month */ scala.Double) => onMonthChange(t0).runNow()))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onYearChange(t0).runNow()))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod.IDatePickerCaptionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod.DatePickerCaption](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.datePickerCaptionMod.IDatePickerCaptionProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  object componentImport extends js.Object
  
}

