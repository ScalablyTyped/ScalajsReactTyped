package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to locale specific calendar systems. */
trait XCalendar
  extends StObject
     with XInterface {
  
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  var DateTime: Double
  
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  val Days: SafeArray[CalendarItem]
  
  /** returns the first day of a week, one of {@link Weekdays} values. */
  var FirstDayOfWeek: Double
  
  val LoadedCalendar: Calendar
  
  /** returns how many days of a week must reside in the first week of a year. */
  var MinimumNumberOfDaysForFirstWeek: Double
  
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  val Months: SafeArray[CalendarItem]
  
  val NumberOfDaysInWeek: Double
  
  val NumberOfMonthsInYear: Double
  
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  val UniqueID: String
  
  /**
    * Add an amount to a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nAmount The amount to add.
    */
  def addValue(nCalendarFieldIndex: Double, nAmount: Double): Unit
  
  def getAllCalendars(rLocale: Locale): SafeArray[String]
  
  /**
    * Get the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def getDateTime(): Double
  
  /** returns a sequence of {@link CalendarItem} describing the day names. */
  def getDays(): SafeArray[CalendarItem]
  
  /**
    * Returns a string (name to display) matching the given parameters.
    * @param nCalendarDisplayIndex One of {@link CalendarDisplayIndex} values
    * @param nIdx A value matching the **nCalendarDisplayIndex** type: **CalendarDisplayIndex::AM_PM**: one of {@link AmPmValue}**CalendarDisplayIndex::DAY**:
    * @param nNameType A value indicating whether to return the abbreviated or the full name, or the narrow name for some {@link CalendarDisplayIndex} values.
    * @since LibreOffice 3.5   This parameter is not used if the **nCalendarDisplayIndex** argument equals {@link CalendarDisplayIndex.AM_PM}
    */
  def getDisplayName(nCalendarDisplayIndex: Double, nIdx: Double, nNameType: Double): String
  
  /** returns the first day of a week, one of {@link Weekdays} values. */
  def getFirstDayOfWeek(): Double
  
  def getLoadedCalendar(): Calendar
  
  /** returns how many days of a week must reside in the first week of a year. */
  def getMinimumNumberOfDaysForFirstWeek(): Double
  
  /** returns a sequence of {@link CalendarItem} describing the month names. */
  def getMonths(): SafeArray[CalendarItem]
  
  def getNumberOfDaysInWeek(): Double
  
  def getNumberOfMonthsInYear(): Double
  
  /** Returns the ID string of the loaded calendar, for example, **"Gregorian"** */
  def getUniqueID(): String
  
  /**
    * Get the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    */
  def getValue(nCalendarFieldIndex: Double): Double
  
  /**
    * Verify if the date fields set by a combination of {@link XCalendar.setValue()} calls is valid. It has a side-effect because it will internally
    * calculate the final value for the date fields
    */
  def isValid(): Boolean
  
  def loadCalendar(uniqueID: String, rLocale: Locale): Unit
  
  def loadDefaultCalendar(rLocale: Locale): Unit
  
  /**
    * Set the UTC date/time as an offset to the start of the calendar at 1-Jan-1970 00:00. The integer part represents the number of days passed since start
    * date. The fractional part represents fractions of a day, thus 0.5 means 12 hours.
    */
  def setDateTime(nTimeInDays: Double): Unit
  
  /** Set the first day of a week, one of {@link Weekdays} values. */
  def setFirstDayOfWeek(nDay: Double): Unit
  
  /** Set how many days of a week must reside in the first week of a year. */
  def setMinimumNumberOfDaysForFirstWeek(nDays: Double): Unit
  
  /**
    * Set the value of a field.
    * @param nCalendarFieldIndex One of {@link CalendarFieldIndex} values.
    * @param nValue A value of the allowed range for the field index.
    */
  def setValue(nCalendarFieldIndex: Double, nValue: Double): Unit
}
object XCalendar {
  
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
  ): XCalendar = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], LoadedCalendar = LoadedCalendar.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NumberOfDaysInWeek = NumberOfDaysInWeek.asInstanceOf[js.Any], NumberOfMonthsInYear = NumberOfMonthsInYear.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = acquire.toJsFn, addValue = js.Any.fromFunction2((t0: Double, t1: Double) => (addValue(t0, t1)).runNow()), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getDateTime = getDateTime.toJsFn, getDays = getDays.toJsFn, getDisplayName = js.Any.fromFunction3(getDisplayName), getFirstDayOfWeek = getFirstDayOfWeek.toJsFn, getLoadedCalendar = getLoadedCalendar.toJsFn, getMinimumNumberOfDaysForFirstWeek = getMinimumNumberOfDaysForFirstWeek.toJsFn, getMonths = getMonths.toJsFn, getNumberOfDaysInWeek = getNumberOfDaysInWeek.toJsFn, getNumberOfMonthsInYear = getNumberOfMonthsInYear.toJsFn, getUniqueID = getUniqueID.toJsFn, getValue = js.Any.fromFunction1(getValue), isValid = isValid.toJsFn, loadCalendar = js.Any.fromFunction2((t0: String, t1: Locale) => (loadCalendar(t0, t1)).runNow()), loadDefaultCalendar = js.Any.fromFunction1((t0: Locale) => loadDefaultCalendar(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDateTime = js.Any.fromFunction1((t0: Double) => setDateTime(t0).runNow()), setFirstDayOfWeek = js.Any.fromFunction1((t0: Double) => setFirstDayOfWeek(t0).runNow()), setMinimumNumberOfDaysForFirstWeek = js.Any.fromFunction1((t0: Double) => setMinimumNumberOfDaysForFirstWeek(t0).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Double) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XCalendar]
  }
  
  extension [Self <: XCalendar](x: Self) {
    
    inline def setAddValue(value: (Double, Double) => Callback): Self = StObject.set(x, "addValue", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDateTime(value: Double): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
    
    inline def setDays(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "FirstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setGetAllCalendars(value: Locale => SafeArray[String]): Self = StObject.set(x, "getAllCalendars", js.Any.fromFunction1(value))
    
    inline def setGetDateTime(value: CallbackTo[Double]): Self = StObject.set(x, "getDateTime", value.toJsFn)
    
    inline def setGetDays(value: CallbackTo[SafeArray[CalendarItem]]): Self = StObject.set(x, "getDays", value.toJsFn)
    
    inline def setGetDisplayName(value: (Double, Double, Double) => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction3(value))
    
    inline def setGetFirstDayOfWeek(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstDayOfWeek", value.toJsFn)
    
    inline def setGetLoadedCalendar(value: CallbackTo[Calendar]): Self = StObject.set(x, "getLoadedCalendar", value.toJsFn)
    
    inline def setGetMinimumNumberOfDaysForFirstWeek(value: CallbackTo[Double]): Self = StObject.set(x, "getMinimumNumberOfDaysForFirstWeek", value.toJsFn)
    
    inline def setGetMonths(value: CallbackTo[SafeArray[CalendarItem]]): Self = StObject.set(x, "getMonths", value.toJsFn)
    
    inline def setGetNumberOfDaysInWeek(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfDaysInWeek", value.toJsFn)
    
    inline def setGetNumberOfMonthsInYear(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfMonthsInYear", value.toJsFn)
    
    inline def setGetUniqueID(value: CallbackTo[String]): Self = StObject.set(x, "getUniqueID", value.toJsFn)
    
    inline def setGetValue(value: Double => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setLoadCalendar(value: (String, Locale) => Callback): Self = StObject.set(x, "loadCalendar", js.Any.fromFunction2((t0: String, t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setLoadDefaultCalendar(value: Locale => Callback): Self = StObject.set(x, "loadDefaultCalendar", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
    
    inline def setLoadedCalendar(value: Calendar): Self = StObject.set(x, "LoadedCalendar", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = StObject.set(x, "MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: SafeArray[CalendarItem]): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDaysInWeek(value: Double): Self = StObject.set(x, "NumberOfDaysInWeek", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonthsInYear(value: Double): Self = StObject.set(x, "NumberOfMonthsInYear", value.asInstanceOf[js.Any])
    
    inline def setSetDateTime(value: Double => Callback): Self = StObject.set(x, "setDateTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFirstDayOfWeek(value: Double => Callback): Self = StObject.set(x, "setFirstDayOfWeek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinimumNumberOfDaysForFirstWeek(value: Double => Callback): Self = StObject.set(x, "setMinimumNumberOfDaysForFirstWeek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetValue(value: (Double, Double) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUniqueID(value: String): Self = StObject.set(x, "UniqueID", value.asInstanceOf[js.Any])
  }
}
