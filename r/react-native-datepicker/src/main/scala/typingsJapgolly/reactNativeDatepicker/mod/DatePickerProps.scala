package typingsJapgolly.reactNativeDatepicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var TouchableComponent: js.UndefOr[Component[js.Object, js.Object]] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var androidMode: js.UndefOr[
    typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
  ] = js.undefined
  var cancelBtnTestID: js.UndefOr[String] = js.undefined
  var cancelBtnText: js.UndefOr[String] = js.undefined
  var confirmBtnTestID: js.UndefOr[String] = js.undefined
  var confirmBtnText: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.undefined
  var date: js.UndefOr[String | js.Date | Moment] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var getDateStr: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hideText: js.UndefOr[Boolean] = js.undefined
  var iconComponent: js.UndefOr[Element] = js.undefined
  var iconSource: js.UndefOr[ImageURISource] = js.undefined
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[String | js.Date] = js.undefined
  var minDate: js.UndefOr[String | js.Date] = js.undefined
  var minuteInterval: js.UndefOr[Double] = js.undefined
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.undefined
  var mode: js.UndefOr[date | datetime | time] = js.undefined
  var onCloseModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ String, /* date */ js.Date, Unit]] = js.undefined
  var onOpenModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[_]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    TouchableComponent: Component[js.Object, js.Object] = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    androidMode: typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner = null,
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
    timeZoneOffsetInMinutes: Int | Double = null
  ): DatePickerProps = {
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
    __obj.asInstanceOf[DatePickerProps]
  }
}

