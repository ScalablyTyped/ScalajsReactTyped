package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimePresentation
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.TitleSelectedDatesFormatter
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonDatetimeCustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.cover
import typingsJapgolly.ionicCore.ionicCoreStrings.fixed
import typingsJapgolly.ionicCore.ionicCoreStrings.h12
import typingsJapgolly.ionicCore.ionicCoreStrings.h23
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonDatetime extends StObject {
  
  /**
    * The text to display on the picker's cancel button.
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display on the picker's "Clear" button.
    */
  var clearText: js.UndefOr[String] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Values used to create the list of selectable days. By default every day is shown for the given month. However, to control exactly which days of the month to display, the `dayValues` input can take a number, an array of numbers, or a string of comma separated numbers. Note that even if the array days have an invalid number for the selected month, like `31` in February, it will correctly not show days which are not valid for the selected month.
    */
  var dayValues: js.UndefOr[js.Array[Double] | Double | String] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text to display on the picker's "Done" button.
    */
  var doneText: js.UndefOr[String] = js.undefined
  
  /**
    * The first day of the week to use for `ion-datetime`. The default value is `0` and represents Sunday.
    */
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  
  /**
    * The hour cycle of the `ion-datetime`. If no value is set, this is specified by the current locale.
    */
  var hourCycle: js.UndefOr[h23 | h12] = js.undefined
  
  /**
    * Values used to create the list of selectable hours. By default the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However, to control exactly which hours to display, the `hourValues` input can take a number, an array of numbers, or a string of comma separated numbers.
    */
  var hourValues: js.UndefOr[js.Array[Double] | Double | String] = js.undefined
  
  /**
    * Returns if an individual date (calendar day) is enabled or disabled.  If `true`, the day will be enabled/interactive. If `false`, the day will be disabled/non-interactive.  The function accepts an ISO 8601 date string of a given day. By default, all days are enabled. Developers can use this function to write custom logic to disable certain days.  The function is called for each rendered calendar day, for the previous, current and next month. Custom implementations should be optimized for performance to avoid jank.
    */
  var isDateEnabled: js.UndefOr[js.Function1[/* dateIsoString */ String, Boolean]] = js.undefined
  
  /**
    * The locale to use for `ion-datetime`. This impacts month and day name formatting. The `'default'` value refers to the default locale set by your device.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the maximum could just be the year, such as `1994`. Defaults to the end of this year.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), such as `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the minimum could just be the year, such as `1994`. Defaults to the beginning of the year, 100 years ago from today.
    */
  var min: js.UndefOr[String] = js.undefined
  
  /**
    * Values used to create the list of selectable minutes. By default the minutes range from `0` to `59`. However, to control exactly which minutes to display, the `minuteValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if the minute selections should only be every 15 minutes, then this input value would be `minuteValues="0,15,30,45"`.
    */
  var minuteValues: js.UndefOr[js.Array[Double] | Double | String] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Values used to create the list of selectable months. By default the month values range from `1` to `12`. However, to control exactly which months to display, the `monthValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if only summer months should be shown, then this input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a zero-based index, meaning January's value is `1`, and December's is `12`.
    */
  var monthValues: js.UndefOr[js.Array[Double] | Double | String] = js.undefined
  
  /**
    * If `true`, multiple dates can be selected at once. Only applies to `presentation="date"` and `preferWheel="false"`.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the datetime loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ IonDatetimeCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the datetime selection was cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ IonDatetimeCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the value (selected date) has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[/* event */ IonDatetimeCustomEvent[DatetimeChangeEventDetail], Unit]
  ] = js.undefined
  
  /**
    * Emitted when the datetime has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ IonDatetimeCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, a wheel picker will be rendered instead of a calendar grid where possible. If `false`, a calendar grid will be rendered instead of a wheel picker where possible.  A wheel picker can be rendered instead of a grid when `presentation` is one of the following values: `'date'`, `'date-time'`, or `'time-date'`.  A wheel picker will always be rendered regardless of the `preferWheel` value when `presentation` is one of the following values: `'time'`, `'month'`, `'month-year'`, or `'year'`.
    */
  var preferWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which values you want to select. `'date'` will show a calendar picker to select the month, day, and year. `'time'` will show a time picker to select the hour, minute, and (optionally) AM/PM. `'date-time'` will show the date picker first and time picker second. `'time-date'` will show the time picker first and date picker second.
    */
  var presentation: js.UndefOr[DatetimePresentation] = js.undefined
  
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, a "Clear" button will be rendered alongside the default "Cancel" and "OK" buttons at the bottom of the `ion-datetime` component. Developers can also use the `button` slot if they want to customize these buttons. If custom buttons are set in the `button` slot then the default buttons will not be rendered.
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the default "Cancel" and "OK" buttons will be rendered at the bottom of the `ion-datetime` component. Developers can also use the `button` slot if they want to customize these buttons. If custom buttons are set in the `button` slot then the default buttons will not be rendered.
    */
  var showDefaultButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the default "Time" label will be rendered for the time selector of the `ion-datetime` component. Developers can also use the `time-label` slot if they want to customize this label. If a custom label is set in the `time-label` slot then the default label will not be rendered.
    */
  var showDefaultTimeLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, a header will be shown above the calendar picker. This will include both the slotted title, and the selected date.
    */
  var showDefaultTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `cover`, the `ion-datetime` will expand to cover the full width of its container. If `fixed`, the `ion-datetime` will have a fixed width.
    */
  var size: js.UndefOr[cover | fixed] = js.undefined
  
  /**
    * A callback used to format the header text that shows how many dates are selected. Only used if there are 0 or more than 1 selected (i.e. unused for exactly 1). By default, the header text is set to "numberOfDates days".
    */
  var titleSelectedDatesFormatter: js.UndefOr[TitleSelectedDatesFormatter] = js.undefined
  
  /**
    * The value of the datetime as a valid ISO 8601 datetime string. Should be an array of strings if `multiple="true"`.
    */
  var value: js.UndefOr[String | js.Array[String] | Null] = js.undefined
  
  /**
    * Values used to create the list of selectable years. By default the year values range between the `min` and `max` datetime inputs. However, to control exactly which years to display, the `yearValues` input can take a number, an array of numbers, or string of comma separated numbers. For example, to show upcoming and recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
    */
  var yearValues: js.UndefOr[js.Array[Double] | Double | String] = js.undefined
}
object IonDatetime {
  
  inline def apply(): IonDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonDatetime]
  }
  
  extension [Self <: IonDatetime](x: Self) {
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDayValues(value: js.Array[Double] | Double | String): Self = StObject.set(x, "dayValues", value.asInstanceOf[js.Any])
    
    inline def setDayValuesUndefined: Self = StObject.set(x, "dayValues", js.undefined)
    
    inline def setDayValuesVarargs(value: Double*): Self = StObject.set(x, "dayValues", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDoneText(value: String): Self = StObject.set(x, "doneText", value.asInstanceOf[js.Any])
    
    inline def setDoneTextUndefined: Self = StObject.set(x, "doneText", js.undefined)
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setHourCycle(value: h23 | h12): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourValues(value: js.Array[Double] | Double | String): Self = StObject.set(x, "hourValues", value.asInstanceOf[js.Any])
    
    inline def setHourValuesUndefined: Self = StObject.set(x, "hourValues", js.undefined)
    
    inline def setHourValuesVarargs(value: Double*): Self = StObject.set(x, "hourValues", js.Array(value*))
    
    inline def setIsDateEnabled(value: /* dateIsoString */ String => Boolean): Self = StObject.set(x, "isDateEnabled", js.Any.fromFunction1(value))
    
    inline def setIsDateEnabledUndefined: Self = StObject.set(x, "isDateEnabled", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinuteValues(value: js.Array[Double] | Double | String): Self = StObject.set(x, "minuteValues", value.asInstanceOf[js.Any])
    
    inline def setMinuteValuesUndefined: Self = StObject.set(x, "minuteValues", js.undefined)
    
    inline def setMinuteValuesVarargs(value: Double*): Self = StObject.set(x, "minuteValues", js.Array(value*))
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMonthValues(value: js.Array[Double] | Double | String): Self = StObject.set(x, "monthValues", value.asInstanceOf[js.Any])
    
    inline def setMonthValuesUndefined: Self = StObject.set(x, "monthValues", js.undefined)
    
    inline def setMonthValuesVarargs(value: Double*): Self = StObject.set(x, "monthValues", js.Array(value*))
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ IonDatetimeCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1((t0: /* event */ IonDatetimeCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonCancel(value: /* event */ IonDatetimeCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonCancel", js.Any.fromFunction1((t0: /* event */ IonDatetimeCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonCancelUndefined: Self = StObject.set(x, "onIonCancel", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonDatetimeCustomEvent[DatetimeChangeEventDetail] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonDatetimeCustomEvent[DatetimeChangeEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ IonDatetimeCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1((t0: /* event */ IonDatetimeCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setPreferWheel(value: Boolean): Self = StObject.set(x, "preferWheel", value.asInstanceOf[js.Any])
    
    inline def setPreferWheelUndefined: Self = StObject.set(x, "preferWheel", js.undefined)
    
    inline def setPresentation(value: DatetimePresentation): Self = StObject.set(x, "presentation", value.asInstanceOf[js.Any])
    
    inline def setPresentationUndefined: Self = StObject.set(x, "presentation", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
    
    inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    
    inline def setShowDefaultButtons(value: Boolean): Self = StObject.set(x, "showDefaultButtons", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultButtonsUndefined: Self = StObject.set(x, "showDefaultButtons", js.undefined)
    
    inline def setShowDefaultTimeLabel(value: Boolean): Self = StObject.set(x, "showDefaultTimeLabel", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultTimeLabelUndefined: Self = StObject.set(x, "showDefaultTimeLabel", js.undefined)
    
    inline def setShowDefaultTitle(value: Boolean): Self = StObject.set(x, "showDefaultTitle", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultTitleUndefined: Self = StObject.set(x, "showDefaultTitle", js.undefined)
    
    inline def setSize(value: cover | fixed): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitleSelectedDatesFormatter(value: /* selectedDates */ js.Array[String] => String): Self = StObject.set(x, "titleSelectedDatesFormatter", js.Any.fromFunction1(value))
    
    inline def setTitleSelectedDatesFormatterUndefined: Self = StObject.set(x, "titleSelectedDatesFormatter", js.undefined)
    
    inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setYearValues(value: js.Array[Double] | Double | String): Self = StObject.set(x, "yearValues", value.asInstanceOf[js.Any])
    
    inline def setYearValuesUndefined: Self = StObject.set(x, "yearValues", js.undefined)
    
    inline def setYearValuesVarargs(value: Double*): Self = StObject.set(x, "yearValues", js.Array(value*))
  }
}
