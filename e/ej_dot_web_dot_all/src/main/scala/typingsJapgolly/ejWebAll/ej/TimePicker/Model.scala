package typingsJapgolly.ejWebAll.ej.TimePicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when the time value changed in the TimePicker.
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.undefined
  /** Fires when the TimePicker popup before opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Fires when the time value changed in the TimePicker.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires when the TimePicker popup closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Fires when create TimePicker successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for the TimePicker theme, which is used to customize.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when the TimePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.undefined
  /** Specifies the animation behavior in TimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Save current model value to browser cookies for maintaining states. When refreshing the TimePicker control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Displays the TimePicker as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When the enableStrictMode is set as true it allows the value outside of the range and also indicate with red color border, otherwise it internally changed to the min or max range
    * value based an input value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.undefined
  /** When this property is set to false, it disables the TimePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Fires when the TimePicker control gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Fires when the TimePicker control get lost focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** Defines the height of the TimePicker textbox.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Sets the step value for increment an hour value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var hourInterval: js.UndefOr[Double] = js.undefined
  /** It allows to define the characteristics of the TimePicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the time interval between the two adjacent time values in the popup.
    * @Default {30}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Defines the localization info used by the TimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum time value to the TimePicker.
    * @Default {11:59:59 PM}
    */
  var maxTime: js.UndefOr[String] = js.undefined
  /** Sets the minimum time value to the TimePicker.
    * @Default {12:00:00 AM}
    */
  var minTime: js.UndefOr[String] = js.undefined
  /** Sets the step value for increment the minute value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var minutesInterval: js.UndefOr[Double] = js.undefined
  /** Fires when the TimePicker popup opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Defines the height of the TimePicker popup.
    * @Default {191px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.undefined
  /** Defines the width of the TimePicker popup.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String | Double] = js.undefined
  /** Toggles the readonly state of the TimePicker. When the widget is readOnly, it doesnâ€™t allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Sets the step value for increment the seconds value through arrow keys or mouse scroll.
    * @Default {1}
    */
  var secondsInterval: js.UndefOr[Double] = js.undefined
  /** Fires when the value is selected from the TimePicker dropdown list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** shows or hides the drop down button in TimePicker.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.undefined
  /** TimePicker is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Defines the time format displayed in the TimePicker.
    * @Default {h:mm tt}
    */
  var timeFormat: js.UndefOr[String] = js.undefined
  /** Set the jQuery validation error message in TimePicker.
    * @Default {null}
    */
  var validationMessages: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules in TimePicker.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Sets a specified time value on the TimePicker.
    * @Default {null}
    */
  var value: js.UndefOr[String | js.Date] = js.undefined
  /** Specifies the water mark text to be displayed in input text.
    * @Default {select a time}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** Defines the width of the TimePicker textbox.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    beforeChange: /* e */ BeforeChangeEventArgs => Callback = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Callback = null,
    change: /* e */ ChangeEventArgs => Callback = null,
    close: /* e */ CloseEventArgs => Callback = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    disableTimeRanges: js.Any = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableStrictMode: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    focusIn: /* e */ FocusInEventArgs => Callback = null,
    focusOut: /* e */ FocusOutEventArgs => Callback = null,
    height: String | Double = null,
    hourInterval: Int | Double = null,
    htmlAttributes: js.Any = null,
    interval: Int | Double = null,
    locale: String = null,
    maxTime: String = null,
    minTime: String = null,
    minutesInterval: Int | Double = null,
    open: /* e */ OpenEventArgs => Callback = null,
    popupHeight: String | Double = null,
    popupWidth: String | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    secondsInterval: Int | Double = null,
    select: /* e */ SelectEventArgs => Callback = null,
    showPopupButton: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    timeFormat: String = null,
    validationMessages: js.Any = null,
    validationRules: js.Any = null,
    value: String | js.Date = null,
    watermarkText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.BeforeChangeEventArgs) => beforeChange(t0).runNow()))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.BeforeOpenEventArgs) => beforeOpen(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.ChangeEventArgs) => change(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.CloseEventArgs) => close(t0).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.DestroyEventArgs) => destroy(t0).runNow()))
    if (disableTimeRanges != null) __obj.updateDynamic("disableTimeRanges")(disableTimeRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStrictMode)) __obj.updateDynamic("enableStrictMode")(enableStrictMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.FocusInEventArgs) => focusIn(t0).runNow()))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.FocusOutEventArgs) => focusOut(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hourInterval != null) __obj.updateDynamic("hourInterval")(hourInterval.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (minutesInterval != null) __obj.updateDynamic("minutesInterval")(minutesInterval.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.OpenEventArgs) => open(t0).runNow()))
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secondsInterval != null) __obj.updateDynamic("secondsInterval")(secondsInterval.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TimePicker.SelectEventArgs) => select(t0).runNow()))
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (validationMessages != null) __obj.updateDynamic("validationMessages")(validationMessages.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

