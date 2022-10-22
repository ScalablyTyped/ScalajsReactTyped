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
  * It is derived from {@link com.sun.star.i18n.XExtendedCalendar} and provides additional methods to obtain {@link Calendar2} items that include the
  * possessive genitive case month names and sequences of {@link CalendarItem2} items..
  * @since LibreOffice 3.5
  */
trait XCalendar3
  extends StObject
     with XExtendedCalendar {
  
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  val Days2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  val GenitiveMonths2: SafeArray[CalendarItem2]
  
  val LoadedCalendar2: Calendar2
  
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  val Months2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  val PartitiveMonths2: SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the day names. */
  def getDays2(): SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the genitive case month names. */
  def getGenitiveMonths2(): SafeArray[CalendarItem2]
  
  def getLoadedCalendar2(): Calendar2
  
  /** returns a sequence of {@link CalendarItem2} describing the month names. */
  def getMonths2(): SafeArray[CalendarItem2]
  
  /** returns a sequence of {@link CalendarItem2} describing the partitive case month names. */
  def getPartitiveMonths2(): SafeArray[CalendarItem2]
}
object XCalendar3 {
  
  inline def apply(
    DateTime: Double,
    Days: SafeArray[CalendarItem],
    Days2: SafeArray[CalendarItem2],
    FirstDayOfWeek: Double,
    GenitiveMonths2: SafeArray[CalendarItem2],
    LoadedCalendar: Calendar,
    LoadedCalendar2: Calendar2,
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
    setMinimumNumberOfDaysForFirstWeek: Double => Callback,
    setValue: (Double, Double) => Callback
  ): XCalendar3 = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Days2 = Days2.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], GenitiveMonths2 = GenitiveMonths2.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], LoadedCalendar2 = LoadedCalendar2.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Months2 = Months2.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], PartitiveMonths2 = PartitiveMonths2.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = acquire.toJsFn, addValue = js.Any.fromFunction2((t0: Double, t1: Double) => (addValue(t0, t1)).runNow()), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = getDateTime.toJsFn, getDays = getDays.toJsFn, getDays2 = getDays2.toJsFn, getDisplayName = js.Any.fromFunction3(getDisplayName), getDisplayString = js.Any.fromFunction2(getDisplayString), getFirstDayOfWeek = getFirstDayOfWeek.toJsFn, getGenitiveMonths2 = getGenitiveMonths2.toJsFn, getLoadedCalendar = getLoadedCalendar.toJsFn, getLoadedCalendar2 = getLoadedCalendar2.toJsFn, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek.toJsFn, getMonths = getMonths.toJsFn, getMonths2 = getMonths2.toJsFn, getNumberOfDaysInWeek = getNumberOfDaysInWeek.toJsFn, getNumberOfMonthsInYear = getNumberOfMonthsInYear.toJsFn, getPartitiveMonths2 = getPartitiveMonths2.toJsFn, getUniqueID = getUniqueID.toJsFn, getValue = js.Any.fromFunction1(getValue), isValid = isValid.toJsFn, loadCalendar = js.Any.fromFunction2((t0: String, t1: Locale) => (loadCalendar(t0, t1)).runNow()), loadDefaultCalendar = js.Any.fromFunction1((t0: Locale) => loadDefaultCalendar(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDateTime = js.Any.fromFunction1((t0: Double) => setDateTime(t0).runNow()), setFirstDayOfWeek = js.Any.fromFunction1((t0: Double) => setFirstDayOfWeek(t0).runNow()), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1((t0: Double) => setMinimumNumberOfDaysForFirstWeek(t0).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XCalendar3]
  }
  
  extension [Self <: XCalendar3](x: Self) {
    
    inline def setDays2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Days2", value.asInstanceOf[js.Any])
    
    inline def setGenitiveMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "GenitiveMonths2", value.asInstanceOf[js.Any])
    
    inline def setGetDays2(value: CallbackTo[SafeArray[CalendarItem2]]): Self = StObject.set(x, "getDays2", value.toJsFn)
    
    inline def setGetGenitiveMonths2(value: CallbackTo[SafeArray[CalendarItem2]]): Self = StObject.set(x, "getGenitiveMonths2", value.toJsFn)
    
    inline def setGetLoadedCalendar2(value: CallbackTo[Calendar2]): Self = StObject.set(x, "getLoadedCalendar2", value.toJsFn)
    
    inline def setGetMonths2(value: CallbackTo[SafeArray[CalendarItem2]]): Self = StObject.set(x, "getMonths2", value.toJsFn)
    
    inline def setGetPartitiveMonths2(value: CallbackTo[SafeArray[CalendarItem2]]): Self = StObject.set(x, "getPartitiveMonths2", value.toJsFn)
    
    inline def setLoadedCalendar2(value: Calendar2): Self = StObject.set(x, "LoadedCalendar2", value.asInstanceOf[js.Any])
    
    inline def setMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Months2", value.asInstanceOf[js.Any])
    
    inline def setPartitiveMonths2(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "PartitiveMonths2", value.asInstanceOf[js.Any])
  }
}
