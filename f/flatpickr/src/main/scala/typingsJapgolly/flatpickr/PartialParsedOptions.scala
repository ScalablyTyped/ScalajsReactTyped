package typingsJapgolly.flatpickr

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flatpickr.flatpickrStrings.above
import typingsJapgolly.flatpickr.flatpickrStrings.auto
import typingsJapgolly.flatpickr.flatpickrStrings.below
import typingsJapgolly.flatpickr.flatpickrStrings.multiple
import typingsJapgolly.flatpickr.flatpickrStrings.range
import typingsJapgolly.flatpickr.flatpickrStrings.single
import typingsJapgolly.flatpickr.flatpickrStrings.time
import typingsJapgolly.flatpickr.globalsMod._Global_.Date
import typingsJapgolly.flatpickr.globalsMod._Global_.HTMLElement
import typingsJapgolly.flatpickr.localeMod.CustomLocale
import typingsJapgolly.flatpickr.localeMod.Locale
import typingsJapgolly.flatpickr.localeMod.key
import typingsJapgolly.flatpickr.optionsMod.DateLimit
import typingsJapgolly.flatpickr.optionsMod.Hook
import typingsJapgolly.flatpickr.optionsMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.ParsedOptions> */
trait PartialParsedOptions extends js.Object {
  var _disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var _maxDate: js.UndefOr[Date] = js.undefined
  var _maxTime: js.UndefOr[Date] = js.undefined
  var _minDate: js.UndefOr[Date] = js.undefined
  var _minTime: js.UndefOr[Date] = js.undefined
  var allowInput: js.UndefOr[Boolean] = js.undefined
  var altFormat: js.UndefOr[String] = js.undefined
  var altInput: js.UndefOr[Boolean] = js.undefined
  var altInputClass: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var ariaDateFormat: js.UndefOr[String] = js.undefined
  var clickOpens: js.UndefOr[Boolean] = js.undefined
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  var conjunction: js.UndefOr[String] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.undefined
  var defaultHour: js.UndefOr[Double] = js.undefined
  var defaultMinute: js.UndefOr[Double] = js.undefined
  var defaultSeconds: js.UndefOr[Double] = js.undefined
  var disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var disableMobile: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.undefined
  var enableSeconds: js.UndefOr[Boolean] = js.undefined
  var enableTime: js.UndefOr[Boolean] = js.undefined
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.undefined
  var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.undefined
  var hourIncrement: js.UndefOr[Double] = js.undefined
  var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[key | CustomLocale] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var maxTime: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var minTime: js.UndefOr[Date] = js.undefined
  var minuteIncrement: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[single | multiple | range | time] = js.undefined
  var monthSelectorType: js.UndefOr[String] = js.undefined
  var nextArrow: js.UndefOr[String] = js.undefined
  var noCalendar: js.UndefOr[Boolean] = js.undefined
  var now: js.UndefOr[Date] = js.undefined
  var onChange: js.UndefOr[js.Array[Hook]] = js.undefined
  var onClose: js.UndefOr[js.Array[Hook]] = js.undefined
  var onDayCreate: js.UndefOr[js.Array[Hook]] = js.undefined
  var onDestroy: js.UndefOr[js.Array[Hook]] = js.undefined
  var onKeyDown: js.UndefOr[js.Array[Hook]] = js.undefined
  var onMonthChange: js.UndefOr[js.Array[Hook]] = js.undefined
  var onOpen: js.UndefOr[js.Array[Hook]] = js.undefined
  var onParseConfig: js.UndefOr[js.Array[Hook]] = js.undefined
  var onPreCalendarPosition: js.UndefOr[js.Array[Hook]] = js.undefined
  var onReady: js.UndefOr[js.Array[Hook]] = js.undefined
  var onValueUpdate: js.UndefOr[js.Array[Hook]] = js.undefined
  var onYearChange: js.UndefOr[js.Array[Hook]] = js.undefined
  var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.undefined
  var position: js.UndefOr[auto | above | below] = js.undefined
  var positionElement: js.UndefOr[HTMLElement] = js.undefined
  var prevArrow: js.UndefOr[String] = js.undefined
  var shorthandCurrentMonth: js.UndefOr[Boolean] = js.undefined
  var showMonths: js.UndefOr[Double] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var time_24hr: js.UndefOr[Boolean] = js.undefined
  var weekNumbers: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object PartialParsedOptions {
  @scala.inline
  def apply(
    _disable: js.Array[DateLimit[Date]] = null,
    _enable: js.Array[DateLimit[Date]] = null,
    _maxDate: Date = null,
    _maxTime: Date = null,
    _minDate: Date = null,
    _minTime: Date = null,
    allowInput: js.UndefOr[Boolean] = js.undefined,
    altFormat: String = null,
    altInput: js.UndefOr[Boolean] = js.undefined,
    altInputClass: String = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    appendTo: HTMLElement = null,
    ariaDateFormat: String = null,
    clickOpens: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    conjunction: String = null,
    dateFormat: String = null,
    defaultDate: Date | js.Array[Date] = null,
    defaultHour: Int | Double = null,
    defaultMinute: Int | Double = null,
    defaultSeconds: Int | Double = null,
    disable: js.Array[DateLimit[Date]] = null,
    disableMobile: js.UndefOr[Boolean] = js.undefined,
    enable: js.Array[DateLimit[Date]] = null,
    enableSeconds: js.UndefOr[Boolean] = js.undefined,
    enableTime: js.UndefOr[Boolean] = js.undefined,
    errorHandler: /* err */ js.Error => Callback = null,
    formatDate: (/* date */ Date, /* format */ String, /* locale */ Locale) => CallbackTo[String] = null,
    getWeek: /* date */ Date => CallbackTo[String | Double] = null,
    hourIncrement: Int | Double = null,
    ignoredFocusElements: js.Array[HTMLElement] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    locale: key | CustomLocale = null,
    maxDate: Date = null,
    maxTime: Date = null,
    minDate: Date = null,
    minTime: Date = null,
    minuteIncrement: Int | Double = null,
    mode: single | multiple | range | time = null,
    monthSelectorType: String = null,
    nextArrow: String = null,
    noCalendar: js.UndefOr[Boolean] = js.undefined,
    now: Date = null,
    onChange: js.Array[Hook] = null,
    onClose: js.Array[Hook] = null,
    onDayCreate: js.Array[Hook] = null,
    onDestroy: js.Array[Hook] = null,
    onKeyDown: js.Array[Hook] = null,
    onMonthChange: js.Array[Hook] = null,
    onOpen: js.Array[Hook] = null,
    onParseConfig: js.Array[Hook] = null,
    onPreCalendarPosition: js.Array[Hook] = null,
    onReady: js.Array[Hook] = null,
    onValueUpdate: js.Array[Hook] = null,
    onYearChange: js.Array[Hook] = null,
    parseDate: (/* date */ String, /* format */ String) => CallbackTo[Date] = null,
    plugins: js.Array[Plugin[js.Object]] = null,
    position: auto | above | below = null,
    positionElement: HTMLElement = null,
    prevArrow: String = null,
    shorthandCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    showMonths: Int | Double = null,
    static: js.UndefOr[Boolean] = js.undefined,
    time_24hr: js.UndefOr[Boolean] = js.undefined,
    weekNumbers: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): PartialParsedOptions = {
    val __obj = js.Dynamic.literal()
    if (_disable != null) __obj.updateDynamic("_disable")(_disable.asInstanceOf[js.Any])
    if (_enable != null) __obj.updateDynamic("_enable")(_enable.asInstanceOf[js.Any])
    if (_maxDate != null) __obj.updateDynamic("_maxDate")(_maxDate.asInstanceOf[js.Any])
    if (_maxTime != null) __obj.updateDynamic("_maxTime")(_maxTime.asInstanceOf[js.Any])
    if (_minDate != null) __obj.updateDynamic("_minDate")(_minDate.asInstanceOf[js.Any])
    if (_minTime != null) __obj.updateDynamic("_minTime")(_minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInput)) __obj.updateDynamic("allowInput")(allowInput.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(altInput)) __obj.updateDynamic("altInput")(altInput.asInstanceOf[js.Any])
    if (altInputClass != null) __obj.updateDynamic("altInputClass")(altInputClass.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaDateFormat != null) __obj.updateDynamic("ariaDateFormat")(ariaDateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOpens)) __obj.updateDynamic("clickOpens")(clickOpens.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultHour != null) __obj.updateDynamic("defaultHour")(defaultHour.asInstanceOf[js.Any])
    if (defaultMinute != null) __obj.updateDynamic("defaultMinute")(defaultMinute.asInstanceOf[js.Any])
    if (defaultSeconds != null) __obj.updateDynamic("defaultSeconds")(defaultSeconds.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobile)) __obj.updateDynamic("disableMobile")(disableMobile.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeconds)) __obj.updateDynamic("enableSeconds")(enableSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTime)) __obj.updateDynamic("enableTime")(enableTime.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: /* err */ js.Error) => errorHandler(t0).runNow()))
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3((t0: /* date */ typingsJapgolly.flatpickr.globalsMod._Global_.Date, t1: /* format */ java.lang.String, t2: /* locale */ typingsJapgolly.flatpickr.localeMod.Locale) => formatDate(t0, t1, t2).runNow()))
    if (getWeek != null) __obj.updateDynamic("getWeek")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.flatpickr.globalsMod._Global_.Date) => getWeek(t0).runNow()))
    if (hourIncrement != null) __obj.updateDynamic("hourIncrement")(hourIncrement.asInstanceOf[js.Any])
    if (ignoredFocusElements != null) __obj.updateDynamic("ignoredFocusElements")(ignoredFocusElements.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (minuteIncrement != null) __obj.updateDynamic("minuteIncrement")(minuteIncrement.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthSelectorType != null) __obj.updateDynamic("monthSelectorType")(monthSelectorType.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(noCalendar)) __obj.updateDynamic("noCalendar")(noCalendar.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(onDayCreate.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown.asInstanceOf[js.Any])
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (onParseConfig != null) __obj.updateDynamic("onParseConfig")(onParseConfig.asInstanceOf[js.Any])
    if (onPreCalendarPosition != null) __obj.updateDynamic("onPreCalendarPosition")(onPreCalendarPosition.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(onReady.asInstanceOf[js.Any])
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(onValueUpdate.asInstanceOf[js.Any])
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(onYearChange.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2((t0: /* date */ java.lang.String, t1: /* format */ java.lang.String) => parseDate(t0, t1).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionElement != null) __obj.updateDynamic("positionElement")(positionElement.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthandCurrentMonth)) __obj.updateDynamic("shorthandCurrentMonth")(shorthandCurrentMonth.asInstanceOf[js.Any])
    if (showMonths != null) __obj.updateDynamic("showMonths")(showMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (!js.isUndefined(time_24hr)) __obj.updateDynamic("time_24hr")(time_24hr.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumbers)) __obj.updateDynamic("weekNumbers")(weekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParsedOptions]
  }
}

