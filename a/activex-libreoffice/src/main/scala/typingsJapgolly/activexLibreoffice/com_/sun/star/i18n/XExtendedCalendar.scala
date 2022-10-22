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
  * It is derived from {@link com.sun.star.i18n.XCalendar} and provides additional functionality to display parts of the date currently set at the
  * calendar.
  * @since OOo 1.1.2
  */
trait XExtendedCalendar
  extends StObject
     with XCalendar {
  
  /**
    * Returns a string (number or name to display) matching the given code constant.
    *
    * Note that the string returned depends completely on the locale's calendar. It is not predictable if the string will be numeric or a name, or if in
    * case it returns a numeric string how many digits that will have. For example, a short year display string will normally be two digits with a Gregorian
    * calendar, but with a Jewish calendar it will have three digits.
    * @param nCalendarDisplayCode One of {@link CalendarDisplayCode}
    * @param nNativeNumberMode One of {@link NativeNumberMode} . ;  This argument designates the basic transliteration mode as if specified for the year repre
    */
  def getDisplayString(nCalendarDisplayCode: Double, nNativeNumberMode: Double): String
}
object XExtendedCalendar {
  
  inline def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    FirstDayOfWeek: Double,
    LoadedCalendar: Calendar,
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem],
    NumberOfDaysInWeek: Double,
    NumberOfMonthsInYear: Double,
    UniqueID: String,
    acquire: Callback,
    addValue: (Double, Double) => Callback,
    getAllCalendars: Locale => SafeArray[String],
    getDateTime: CallbackTo[Double],
    getDays: CallbackTo[SafeArray[CalendarItem]],
    getDisplayName: (Double, Double, Double) => String,
    getDisplayString: (Double, Double) => String,
    getFirstDayOfWeek: CallbackTo[Double],
    getLoadedCalendar: CallbackTo[Calendar],
    getMinimumNumberOfDaysForFirstWeek: CallbackTo[Double],
    getMonths: CallbackTo[SafeArray[CalendarItem]],
    getNumberOfDaysInWeek: CallbackTo[Double],
    getNumberOfMonthsInYear: CallbackTo[Double],
    getUniqueID: CallbackTo[String],
    getValue: Double => Double,
    isValid: CallbackTo[Boolean],
    loadCalendar: (String, Locale) => Callback,
    loadDefaultCalendar: Locale => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDateTime: Double => Callback,
    setFirstDayOfWeek: Double => Callback,
    setMinimumNumberOfDaysForFirstWeek: Double => Callback,
    setValue: (Double, Double) => Callback
  ): XExtendedCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = acquire.toJsFn, addValue = js.Any.fromFunction2((t0: Double, t1: Double) => (addValue(t0, t1)).runNow()), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = getDateTime.toJsFn, getDays = getDays.toJsFn, getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = getFirstDayOfWeek.toJsFn, getLoadedCalendar = getLoadedCalendar.toJsFn, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek.toJsFn, getMonths = getMonths.toJsFn, getNumberOfDaysInWeek = getNumberOfDaysInWeek.toJsFn, getNumberOfMonthsInYear = getNumberOfMonthsInYear.toJsFn, getUniqueID = getUniqueID.toJsFn, getValue = js.Any.fromFunction1(getValue), isValid = isValid.toJsFn, loadCalendar = js.Any.fromFunction2((t0: String, t1: Locale) => (loadCalendar(t0, t1)).runNow()), loadDefaultCalendar = js.Any.fromFunction1((t0: Locale) => loadDefaultCalendar(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDateTime = js.Any.fromFunction1((t0: Double) => setDateTime(t0).runNow()), setFirstDayOfWeek = js.Any.fromFunction1((t0: Double) => setFirstDayOfWeek(t0).runNow()), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1((t0: Double) => setMinimumNumberOfDaysForFirstWeek(t0).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XExtendedCalendar]
  }
  
  extension [Self <: XExtendedCalendar](x: Self) {
    
    inline def setGetDisplayString(value: (Double, Double) => String): Self = StObject.set(x, "getDisplayString", js.Any.fromFunction2(value))
  }
}
