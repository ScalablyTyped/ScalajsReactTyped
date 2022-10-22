package typingsJapgolly.nodeCalendar

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module allows you to output calendars like the Unix cal program, and provides
  * additional useful functions related to the calendar. By default, these calendars
  * have Monday as the first day of the week, and Sunday as the last (the European
  * convention). Use setfirstweekday() to set the first day of the week to Sunday
  * (6) or to any other weekday. Parameters that specify dates are given as integers.
  */
object mod {
  
  @JSImport("node-calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-calendar", "APRIL")
  @js.native
  def APRIL: Double = js.native
  inline def APRIL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APRIL")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "AUGUST")
  @js.native
  def AUGUST: Double = js.native
  inline def AUGUST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUGUST")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "Calendar")
  @js.native
  /**
    * @param {number} firstweekday
    *  Numerical day of the week the calendar weeks should start.
    *  (0=MON, 1=TUE, ...) Default: 0
    */
  open class Calendar () extends StObject {
    def this(firstweekday: Double) = this()
    
    /**
      * Numerical day of the week the calendar weeks should start.
      * (0=MON, 1=TUE, ...)
      * 
      * @method getfirstweekday
      */
    def getfirstweekday(): Double = js.native
    
    /**
      * Dates for one month. The array will contain Date values and will always
      * iterate through complete weeks, so it will yield dates outside the
      * specified month.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def itermonthdates(year: Double, month: Double): js.Array[js.Date] = js.native
    
    /**
      * Like itermonthdates(), but will yield day numbers. For days outside
      * the specified month the day number is 0.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def itermonthdays(year: Double, month: Double): js.Array[Double] = js.native
    
    /**
      * Like itermonthdates(), but will yield [day number, weekday number]
      * arrays. For days outside the specified month the day number is 0.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def itermonthdays2(year: Double, month: Double): js.Array[js.Tuple2[Double, Double]] = js.native
    
    /**
      * One week of weekday numbers starting with the configured first one.
      */
    def iterweekdays(): js.Array[Double] = js.native
    
    /**
      * A matrix (array of array) representing a month's calendar.
      * Each row represents a week; week entries are Date values.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def monthdatescalendar(year: Double, month: Double): IMonthGrid[js.Date] = js.native
    
    /**
      * Return a matrix representing a month's calendar. Each row represents
      * a week; week entries are [day number, weekday number] arrays. Day numbers
      * outside this month are zero.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def monthdays2calendar(year: Double, month: Double): IMonthGrid[js.Tuple2[Double, Double]] = js.native
    
    /**
      * A matrix representing a month's calendar. Each row represents a week;
      * days outside this month are zero.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} month
      *  Month for which the calendar should be generated.
      */
    def monthdayscalendar(year: Double, month: Double): IMonthGrid[Double] = js.native
    
    /**
      * Numerical day of the week the calendar weeks should start.
      * (0=MON, 1=TUE, ...)
      * 
      * @param {number} firstweekday
      *  Numerical day of the week the calendar weeks should start.
      *  (0=MON, 1=TUE, ...) Default: 0
      */
    def setfirstweekday(firstweekday: Double): Unit = js.native
    
    /**
      * The specified year ready for formatting. The return value is an array
      * of month rows. Each month row contains up to width months. Each month
      * contains between 4 and 6 weeks and each week contains 1-7 days. Days
      * are Date objects.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated.
      * 
      * @param {number} width
      *  The number of months to include in each row. Default: 3
      */
    def yeardatescalendar(year: Double): IYearGrid[js.Date] = js.native
    def yeardatescalendar(year: Double, width: Double): IYearGrid[js.Date] = js.native
    
    /**
      * The specified year ready for formatting (similar to yeardatescalendar()).
      * Entries in the week arrays are [day number, weekday number] arrays.
      * Day numbers outside this month are zero.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated
      * 
      * @param {number} width
      *  The number of months to include in each row. Default: 3
      */
    def yeardays2calendar(year: Double): IYearGrid[js.Tuple2[Double, Double]] = js.native
    def yeardays2calendar(year: Double, width: Double): IYearGrid[js.Tuple2[Double, Double]] = js.native
    
    /**
      * the specified year ready for formatting (similar to yeardatescalendar()).
      * Entries in the week arrays are day numbers. Day numbers outside this
      * month are zero.
      * 
      * @param {number} year
      *  Year for which the calendar should be generated
      * 
      * @param {number} width
      *  The number of months to include in each row. Default: 3
      */
    def yeardayscalendar(year: Double): IYearGrid[Double] = js.native
    def yeardayscalendar(year: Double, width: Double): IYearGrid[Double] = js.native
  }
  
  @JSImport("node-calendar", "DECEMBER")
  @js.native
  def DECEMBER: Double = js.native
  inline def DECEMBER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DECEMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "FEBRUARY")
  @js.native
  def FEBRUARY: Double = js.native
  inline def FEBRUARY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FEBRUARY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "FRIDAY")
  @js.native
  def FRIDAY: Double = js.native
  inline def FRIDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRIDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "IllegalDayError")
  @js.native
  /**
    * @param {string} message
    *  Optional custom error message.
    */
  open class IllegalDayError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-calendar", "IllegalLocaleError")
  @js.native
  /**
    * @param {string} message
    *  Optional custom error message.
    */
  open class IllegalLocaleError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-calendar", "IllegalMonthError")
  @js.native
  /**
    * @param {string} message
    *  Optional custom error message.
    */
  open class IllegalMonthError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-calendar", "IllegalTimeError")
  @js.native
  /**
    * @param {string} message
    *  Optional custom error message.
    */
  open class IllegalTimeError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-calendar", "IllegalWeekdayError")
  @js.native
  /**
    * @param {string} message
    *  Optional custom error message.
    */
  open class IllegalWeekdayError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-calendar", "JANUARY")
  @js.native
  def JANUARY: Double = js.native
  inline def JANUARY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JANUARY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "JULY")
  @js.native
  def JULY: Double = js.native
  inline def JULY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JULY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "JUNE")
  @js.native
  def JUNE: Double = js.native
  inline def JUNE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JUNE")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "MARCH")
  @js.native
  def MARCH: Double = js.native
  inline def MARCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARCH")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "MAY")
  @js.native
  def MAY: Double = js.native
  inline def MAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "MONDAY")
  @js.native
  def MONDAY: Double = js.native
  inline def MONDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "NOVEMBER")
  @js.native
  def NOVEMBER: Double = js.native
  inline def NOVEMBER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOVEMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "OCTOBER")
  @js.native
  def OCTOBER: Double = js.native
  inline def OCTOBER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCTOBER")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "SATURDAY")
  @js.native
  def SATURDAY: Double = js.native
  inline def SATURDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SATURDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "SEPTEMBER")
  @js.native
  def SEPTEMBER: Double = js.native
  inline def SEPTEMBER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPTEMBER")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "SUNDAY")
  @js.native
  def SUNDAY: Double = js.native
  inline def SUNDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUNDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "THURSDAY")
  @js.native
  def THURSDAY: Double = js.native
  inline def THURSDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THURSDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "TUESDAY")
  @js.native
  def TUESDAY: Double = js.native
  inline def TUESDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TUESDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "WEDNESDAY")
  @js.native
  def WEDNESDAY: Double = js.native
  inline def WEDNESDAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEDNESDAY")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "day_abbr")
  @js.native
  def dayAbbr: js.Array[String] = js.native
  
  inline def dayAbbr_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_abbr")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "day_name")
  @js.native
  def dayName: js.Array[String] = js.native
  
  inline def dayName_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("day_name")(x.asInstanceOf[js.Any])
  
  inline def isleap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isleap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def leapdays(y1: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("leapdays")(y1.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("node-calendar", "month_abbr")
  @js.native
  def monthAbbr: js.Array[String] = js.native
  
  inline def monthAbbr_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month_abbr")(x.asInstanceOf[js.Any])
  
  @JSImport("node-calendar", "month_name")
  @js.native
  def monthName: js.Array[String] = js.native
  
  inline def monthName_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("month_name")(x.asInstanceOf[js.Any])
  
  inline def monthrange(year: Double, month: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("monthrange")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def setlocale(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setlocale")().asInstanceOf[Unit]
  inline def setlocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setlocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timegm(timegmt: js.Tuple6[Double, Double, Double, Double, Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timegm")(timegmt.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def weekday(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
}
