package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to locale specific calendar systems.
  *
  * It is derived from {@link com.sun.star.i18n.XCalendar3} and provides additional methods to set and get the local time.
  * @since LibreOffice 5.0
  */
trait XCalendar4
  extends StObject
     with XCalendar3 {
  
  /**
    * Get the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and added to the UTC time at the calendar.
    */
  var LocalDateTime: Double
  
  /**
    * Get the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and added to the UTC time at the calendar.
    */
  def getLocalDateTime(): Double
  
  /**
    * Set the local date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since
    * start date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    *
    * The actual timezone and daylight saving time offsets effective at the given date and time are considered and subtracted before setting the UTC time at
    * the calendar.
    */
  def setLocalDateTime(TimeInDays: Double): Unit
}
object XCalendar4 {
  
  inline def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    Days2: SafeArray[CalendarItem2],
    FirstDayOfWeek: Double,
    GenitiveMonths2: SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
    LocalDateTime: Double,
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    Months2: SafeArray[CalendarItem2],
    NumberOfDaysInWeek: Double,
    NumberOfMonthsInYear: Double,
    PartitiveMonths2: SafeArray[CalendarItem2],
    UniqueID: String,
    acquire: Callback,
    addValue: (Double, Double) => Callback,
    getAllCalendars: Locale => SafeArray[String],
    getDateTime: CallbackTo[Double],
    getDays: CallbackTo[SafeArray[CalendarItem]],
    getDays2: CallbackTo[SafeArray[CalendarItem2]],
    getDisplayName: (Double, Double, Double) => String,
    getDisplayString: (Double, Double) => String,
    getFirstDayOfWeek: CallbackTo[Double],
    getGenitiveMonths2: CallbackTo[SafeArray[CalendarItem2]],
    getLoadedCalendar: CallbackTo[Calendar],
    getLoadedCalendar2: CallbackTo[Calendar2],
    getLocalDateTime: CallbackTo[Double],
    getMinimumNumberOfDaysForFirstWeek: CallbackTo[Double],
    getMonths: CallbackTo[SafeArray[CalendarItem]],
    getMonths2: CallbackTo[SafeArray[CalendarItem2]],
    getNumberOfDaysInWeek: CallbackTo[Double],
    getNumberOfMonthsInYear: CallbackTo[Double],
    getPartitiveMonths2: CallbackTo[SafeArray[CalendarItem2]],
    getUniqueID: CallbackTo[String],
    getValue: Double => Double,
    isValid: CallbackTo[Boolean],
    loadCalendar: (String, Locale) => Callback,
    loadDefaultCalendar: Locale => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDateTime: Double => Callback,
    setFirstDayOfWeek: Double => Callback,
    setLocalDateTime: Double => Callback,
    setMinimumNumberOfDaysForFirstWeek: Double => Callback,
    setValue: (Double, Double) => Callback
  ): XCalendar4 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Days2 = Days2.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], GenitiveMonths2 = GenitiveMonths2.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], LoadedCalendar2 = LoadedCalendar2.asInstanceOf[js.Any], LocalDateTime = LocalDateTime.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Months2 = Months2.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], PartitiveMonths2 = PartitiveMonths2.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = acquire.toJsFn, addValue = js.Any.fromFunction2((t0: Double, t1: Double) => (addValue(t0, t1)).runNow()), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = getDateTime.toJsFn, getDays = getDays.toJsFn, getDays2 = getDays2.toJsFn, getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = getFirstDayOfWeek.toJsFn, getGenitiveMonths2 = getGenitiveMonths2.toJsFn, getLoadedCalendar = getLoadedCalendar.toJsFn, getLoadedCalendar2 = getLoadedCalendar2.toJsFn, getLocalDateTime = getLocalDateTime.toJsFn, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek.toJsFn, getMonths = getMonths.toJsFn, getMonths2 = getMonths2.toJsFn, getNumberOfDaysInWeek = getNumberOfDaysInWeek.toJsFn, getNumberOfMonthsInYear = getNumberOfMonthsInYear.toJsFn, getPartitiveMonths2 = getPartitiveMonths2.toJsFn, getUniqueID = getUniqueID.toJsFn, getValue = js.Any.fromFunction1(getValue), isValid = isValid.toJsFn, loadCalendar = js.Any.fromFunction2((t0: String, t1: Locale) => (loadCalendar(t0, t1)).runNow()), loadDefaultCalendar = js.Any.fromFunction1((t0: Locale) => loadDefaultCalendar(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDateTime = js.Any.fromFunction1((t0: Double) => setDateTime(t0).runNow()), setFirstDayOfWeek = js.Any.fromFunction1((t0: Double) => setFirstDayOfWeek(t0).runNow()), setLocalDateTime = js.Any.fromFunction1((t0: Double) => setLocalDateTime(t0).runNow()), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1((t0: Double) => setMinimumNumberOfDaysForFirstWeek(t0).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XCalendar4]
  }
  
  extension [Self <: XCalendar4](x: Self) {
    
    inline def setGetLocalDateTime(value: CallbackTo[Double]): Self = StObject.set(x, "getLocalDateTime", value.toJsFn)
    
    inline def setLocalDateTime(value: Double): Self = StObject.set(x, "LocalDateTime", value.asInstanceOf[js.Any])
    
    inline def setSetLocalDateTime(value: Double => Callback): Self = StObject.set(x, "setLocalDateTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
