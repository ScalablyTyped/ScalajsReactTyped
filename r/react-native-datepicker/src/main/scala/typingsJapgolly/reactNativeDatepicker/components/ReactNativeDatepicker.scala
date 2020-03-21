package typingsJapgolly.reactNativeDatepicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeDatepicker.mod.DatePickerCustomStylesProps
import typingsJapgolly.reactNativeDatepicker.mod.DatePickerProps
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.default
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeDatepicker {
  def apply(
    TouchableComponent: Component[js.Object, js.Object] = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    androidMode: default | calendar | spinner = null,
    cancelBtnTestID: String = null,
    cancelBtnText: String = null,
    confirmBtnTestID: String = null,
    confirmBtnText: String = null,
    customStyles: DatePickerCustomStylesProps = null,
    date: String | js.Date | Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    format: String = null,
    getDateStr: /* date */ js.Date => CallbackTo[String] = null,
    height: Int | Double = null,
    hideText: js.UndefOr[Boolean] = js.undefined,
    iconComponent: VdomElement = null,
    iconSource: ImageURISource = null,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxDate: String | js.Date = null,
    minDate: String | js.Date = null,
    minuteInterval: Int | Double = null,
    modalOnResponderTerminationRequest: /* e */ js.Any => CallbackTo[Boolean] = null,
    mode: date | datetime | time = null,
    onCloseModal: js.UndefOr[Callback] = js.undefined,
    onDateChange: (/* dateStr */ String, /* date */ js.Date) => Callback = null,
    onOpenModal: js.UndefOr[Callback] = js.undefined,
    onPressMask: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[_] = null,
    testID: String = null,
    timeZoneOffsetInMinutes: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DatePickerProps, 
    typingsJapgolly.reactNativeDatepicker.mod.default, 
    Unit, 
    DatePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (TouchableComponent != null) __obj.updateDynamic("TouchableComponent")(TouchableComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (androidMode != null) __obj.updateDynamic("androidMode")(androidMode.asInstanceOf[js.Any])
    if (cancelBtnTestID != null) __obj.updateDynamic("cancelBtnTestID")(cancelBtnTestID.asInstanceOf[js.Any])
    if (cancelBtnText != null) __obj.updateDynamic("cancelBtnText")(cancelBtnText.asInstanceOf[js.Any])
    if (confirmBtnTestID != null) __obj.updateDynamic("confirmBtnTestID")(confirmBtnTestID.asInstanceOf[js.Any])
    if (confirmBtnText != null) __obj.updateDynamic("confirmBtnText")(confirmBtnText.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getDateStr != null) __obj.updateDynamic("getDateStr")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateStr(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideText)) __obj.updateDynamic("hideText")(hideText.asInstanceOf[js.Any])
    if (iconComponent != null) __obj.updateDynamic("iconComponent")(iconComponent.rawElement.asInstanceOf[js.Any])
    if (iconSource != null) __obj.updateDynamic("iconSource")(iconSource.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (modalOnResponderTerminationRequest != null) __obj.updateDynamic("modalOnResponderTerminationRequest")(js.Any.fromFunction1((t0: /* e */ js.Any) => modalOnResponderTerminationRequest(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onCloseModal.foreach(p => __obj.updateDynamic("onCloseModal")(p.toJsFn))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction2((t0: /* dateStr */ java.lang.String, t1: /* date */ js.Date) => onDateChange(t0, t1).runNow()))
    onOpenModal.foreach(p => __obj.updateDynamic("onOpenModal")(p.toJsFn))
    onPressMask.foreach(p => __obj.updateDynamic("onPressMask")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (timeZoneOffsetInMinutes != null) __obj.updateDynamic("timeZoneOffsetInMinutes")(timeZoneOffsetInMinutes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeDatepicker.mod.DatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeDatepicker.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeDatepicker.mod.DatePickerProps])(children: _*)
  }
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

