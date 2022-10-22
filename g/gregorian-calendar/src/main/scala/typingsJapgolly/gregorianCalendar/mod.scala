package typingsJapgolly.gregorianCalendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gregorian-calendar", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GregorianCalendar {
    def this(locale: js.Object) = this()
    
    /**
      * add the day of month of the given calendar field.
      */
    /* CompleteClass */
    override def addDayOfMonth(amount: Number): Unit = js.native
    
    /**
      * add the hour of day of the given calendar field.
      */
    /* CompleteClass */
    override def addHourOfDay(amount: Number): Unit = js.native
    
    /**
      * add the millisecond of the given calendar field.
      */
    /* CompleteClass */
    override def addMilliSecond(amount: Number): Unit = js.native
    
    /**
      * add the minute of the given calendar field.
      */
    /* CompleteClass */
    override def addMinute(amount: Number): Unit = js.native
    
    /**
      * add the month of the given calendar field.
      */
    /* CompleteClass */
    override def addMonth(amount: Number): Unit = js.native
    
    /**
      * add the second of the given calendar field.
      */
    /* CompleteClass */
    override def addSecond(amount: Number): Unit = js.native
    
    /**
      * add the year of the given calendar field.
      */
    /* CompleteClass */
    override def addYear(amount: Number): Unit = js.native
    
    /**
      * clear all field of current instance
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * compare this object and other by day. return -1 0 or 1
      */
    /* CompleteClass */
    override def compareToDay(other: GregorianCalendar): Number = js.native
    
    /* CompleteClass */
    override def equals(other: GregorianCalendar): Boolean = js.native
    
    /**
      * Returns the day of month of the given calendar field.
      */
    /* CompleteClass */
    override def getDayOfMonth(): Number = js.native
    
    /**
      * Returns the day of week of the given calendar field. sunday is 0, monday is 1
      */
    /* CompleteClass */
    override def getDayOfWeek(): Number = js.native
    
    /**
      * Returns the day of week in month of the given calendar field.
      */
    /* CompleteClass */
    override def getDayOfWeekInMonth(): Number = js.native
    
    /**
      * Returns the day of year of the given calendar field.
      */
    /* CompleteClass */
    override def getDayOfYear(): Number = js.native
    
    /**
      * Returns the hour of day for the given calendar field.
      */
    /* CompleteClass */
    override def getHourOfDay(): Number = js.native
    
    /**
      * Returns the millisecond of the given calendar field.
      */
    /* CompleteClass */
    override def getMilliSeconds(): Number = js.native
    
    /**
      * Returns the minute of the given calendar field.
      */
    /* CompleteClass */
    override def getMinutes(): Number = js.native
    
    /**
      * Returns the month of the given calendar field.
      */
    /* CompleteClass */
    override def getMonth(): Number = js.native
    
    /**
      * Returns the second of the given calendar field.
      */
    /* CompleteClass */
    override def getSeconds(): Number = js.native
    
    /**
      * get absolute time for current instance
      */
    /* CompleteClass */
    override def getTime(): Number = js.native
    
    /**
      * current date instance's timezone offset (in minutes)
      */
    /* CompleteClass */
    override def getTimezoneOffset(): Number = js.native
    
    /**
      * Returns the week of month of the given calendar field.
      */
    /* CompleteClass */
    override def getWeekOfMonth(): Number = js.native
    
    /**
      * Returns the week of year of the given calendar field.
      */
    /* CompleteClass */
    override def getWeekOfYear(): Number = js.native
    
    /**
      * Returns the week number of year represented by this GregorianCalendar.
      */
    /* CompleteClass */
    override def getWeekYear(): Number = js.native
    
    /**
      * Returns the number of weeks in the week year
      */
    /* CompleteClass */
    override def getWeeksInWeekYear(): Number = js.native
    
    /**
      * Returns the year of the given calendar field.
      */
    /* CompleteClass */
    override def getYear(): Number = js.native
    
    /**
      * set the month of the given calendar field without influence month.
      * 2015-09-29 -> setMonth(2) -> 2015-03-01
      * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
      */
    /* CompleteClass */
    override def rollSetMonth(month: Number): Unit = js.native
    
    /**
      * same as call setYear, setMonth, setDayOfMonth ....
      */
    /* CompleteClass */
    override def set(
      year: Number,
      month: Number,
      dayOfMonth: Number,
      hourOfDay: Number,
      minutes: Number,
      seconds: Number,
      milliseconds: Number
    ): Unit = js.native
    
    /**
      * set the day of month of the given calendar field.
      */
    /* CompleteClass */
    override def setDayOfMonth(day: Number): Unit = js.native
    
    /**
      * set the hour of day for the given calendar field.
      */
    /* CompleteClass */
    override def setHourOfDay(hour: Number): Unit = js.native
    
    /**
      * set the millisecond of the given calendar field.
      */
    /* CompleteClass */
    override def setMilliSeconds(second: Number): Unit = js.native
    
    /**
      * set the minute of the given calendar field.
      */
    /* CompleteClass */
    override def setMinutes(minute: Number): Unit = js.native
    
    /**
      * set the month of the given calendar field. January is 0, you can use enum
      */
    /* CompleteClass */
    override def setMonth(month: Number): Unit = js.native
    
    /**
      * set the second of the given calendar field.
      */
    /* CompleteClass */
    override def setSeconds(second: Number): Unit = js.native
    
    /**
      * set absolute time for current instance
      */
    /* CompleteClass */
    override def setTime(time: Number): Unit = js.native
    
    /**
      * set current date instance's timezone offset (in minutes)
      */
    /* CompleteClass */
    override def setTimezoneOffset(timezoneOffset: Number): Unit = js.native
    
    /**
      * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
      * weekOfYear follows the WEEK_OF_YEAR numbering.
      * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
      *        weekYear: the week year
      *         weekOfYear: the week number based on weekYear
      *         dayOfWeek: the day of week value
      */
    /* CompleteClass */
    override def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit = js.native
    
    /**
      * set the year of the given calendar field.
      */
    /* CompleteClass */
    override def setYear(year: Number): Unit = js.native
  }
  
  trait GregorianCalendar extends StObject {
    
    /**
      * add the day of month of the given calendar field.
      */
    def addDayOfMonth(amount: Number): Unit
    
    /**
      * add the hour of day of the given calendar field.
      */
    def addHourOfDay(amount: Number): Unit
    
    /**
      * add the millisecond of the given calendar field.
      */
    def addMilliSecond(amount: Number): Unit
    
    /**
      * add the minute of the given calendar field.
      */
    def addMinute(amount: Number): Unit
    
    /**
      * add the month of the given calendar field.
      */
    def addMonth(amount: Number): Unit
    
    /**
      * add the second of the given calendar field.
      */
    def addSecond(amount: Number): Unit
    
    /**
      * add the year of the given calendar field.
      */
    def addYear(amount: Number): Unit
    
    /**
      * clear all field of current instance
      */
    def clear(): Unit
    
    /**
      * compare this object and other by day. return -1 0 or 1
      */
    def compareToDay(other: GregorianCalendar): Number
    
    def equals(other: GregorianCalendar): Boolean
    
    /**
      * Returns the day of month of the given calendar field.
      */
    def getDayOfMonth(): Number
    
    /**
      * Returns the day of week of the given calendar field. sunday is 0, monday is 1
      */
    def getDayOfWeek(): Number
    
    /**
      * Returns the day of week in month of the given calendar field.
      */
    def getDayOfWeekInMonth(): Number
    
    /**
      * Returns the day of year of the given calendar field.
      */
    def getDayOfYear(): Number
    
    /**
      * Returns the hour of day for the given calendar field.
      */
    def getHourOfDay(): Number
    
    /**
      * Returns the millisecond of the given calendar field.
      */
    def getMilliSeconds(): Number
    
    /**
      * Returns the minute of the given calendar field.
      */
    def getMinutes(): Number
    
    /**
      * Returns the month of the given calendar field.
      */
    def getMonth(): Number
    
    /**
      * Returns the second of the given calendar field.
      */
    def getSeconds(): Number
    
    /**
      * get absolute time for current instance
      */
    def getTime(): Number
    
    /**
      * current date instance's timezone offset (in minutes)
      */
    def getTimezoneOffset(): Number
    
    /**
      * Returns the week of month of the given calendar field.
      */
    def getWeekOfMonth(): Number
    
    /**
      * Returns the week of year of the given calendar field.
      */
    def getWeekOfYear(): Number
    
    /**
      * Returns the week number of year represented by this GregorianCalendar.
      */
    def getWeekYear(): Number
    
    /**
      * Returns the number of weeks in the week year
      */
    def getWeeksInWeekYear(): Number
    
    /**
      * Returns the year of the given calendar field.
      */
    def getYear(): Number
    
    /**
      * set the month of the given calendar field without influence month.
      * 2015-09-29 -> setMonth(2) -> 2015-03-01
      * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
      */
    def rollSetMonth(month: Number): Unit
    
    /**
      * same as call setYear, setMonth, setDayOfMonth ....
      */
    def set(
      year: Number,
      month: Number,
      dayOfMonth: Number,
      hourOfDay: Number,
      minutes: Number,
      seconds: Number,
      milliseconds: Number
    ): Unit
    
    /**
      * set the day of month of the given calendar field.
      */
    def setDayOfMonth(day: Number): Unit
    
    /**
      * set the hour of day for the given calendar field.
      */
    def setHourOfDay(hour: Number): Unit
    
    /**
      * set the millisecond of the given calendar field.
      */
    def setMilliSeconds(second: Number): Unit
    
    /**
      * set the minute of the given calendar field.
      */
    def setMinutes(minute: Number): Unit
    
    /**
      * set the month of the given calendar field. January is 0, you can use enum
      */
    def setMonth(month: Number): Unit
    
    /**
      * set the second of the given calendar field.
      */
    def setSeconds(second: Number): Unit
    
    /**
      * set absolute time for current instance
      */
    def setTime(time: Number): Unit
    
    /**
      * set current date instance's timezone offset (in minutes)
      */
    def setTimezoneOffset(timezoneOffset: Number): Unit
    
    /**
      * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
      * weekOfYear follows the WEEK_OF_YEAR numbering.
      * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
      *        weekYear: the week year
      *         weekOfYear: the week number based on weekYear
      *         dayOfWeek: the day of week value
      */
    def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit
    
    /**
      * set the year of the given calendar field.
      */
    def setYear(year: Number): Unit
  }
  object GregorianCalendar {
    
    inline def apply(
      addDayOfMonth: Number => Callback,
      addHourOfDay: Number => Callback,
      addMilliSecond: Number => Callback,
      addMinute: Number => Callback,
      addMonth: Number => Callback,
      addSecond: Number => Callback,
      addYear: Number => Callback,
      clear: Callback,
      compareToDay: GregorianCalendar => Number,
      equals_ : GregorianCalendar => Boolean,
      getDayOfMonth: CallbackTo[Number],
      getDayOfWeek: CallbackTo[Number],
      getDayOfWeekInMonth: CallbackTo[Number],
      getDayOfYear: CallbackTo[Number],
      getHourOfDay: CallbackTo[Number],
      getMilliSeconds: CallbackTo[Number],
      getMinutes: CallbackTo[Number],
      getMonth: CallbackTo[Number],
      getSeconds: CallbackTo[Number],
      getTime: CallbackTo[Number],
      getTimezoneOffset: CallbackTo[Number],
      getWeekOfMonth: CallbackTo[Number],
      getWeekOfYear: CallbackTo[Number],
      getWeekYear: CallbackTo[Number],
      getWeeksInWeekYear: CallbackTo[Number],
      getYear: CallbackTo[Number],
      rollSetMonth: Number => Callback,
      set: (Number, Number, Number, Number, Number, Number, Number) => Callback,
      setDayOfMonth: Number => Callback,
      setHourOfDay: Number => Callback,
      setMilliSeconds: Number => Callback,
      setMinutes: Number => Callback,
      setMonth: Number => Callback,
      setSeconds: Number => Callback,
      setTime: Number => Callback,
      setTimezoneOffset: Number => Callback,
      setWeekDate: (Number, Number, Number) => Callback,
      setYear: Number => Callback
    ): GregorianCalendar = {
      val __obj = js.Dynamic.literal(addDayOfMonth = js.Any.fromFunction1((t0: Number) => addDayOfMonth(t0).runNow()), addHourOfDay = js.Any.fromFunction1((t0: Number) => addHourOfDay(t0).runNow()), addMilliSecond = js.Any.fromFunction1((t0: Number) => addMilliSecond(t0).runNow()), addMinute = js.Any.fromFunction1((t0: Number) => addMinute(t0).runNow()), addMonth = js.Any.fromFunction1((t0: Number) => addMonth(t0).runNow()), addSecond = js.Any.fromFunction1((t0: Number) => addSecond(t0).runNow()), addYear = js.Any.fromFunction1((t0: Number) => addYear(t0).runNow()), clear = clear.toJsFn, compareToDay = js.Any.fromFunction1(compareToDay), getDayOfMonth = getDayOfMonth.toJsFn, getDayOfWeek = getDayOfWeek.toJsFn, getDayOfWeekInMonth = getDayOfWeekInMonth.toJsFn, getDayOfYear = getDayOfYear.toJsFn, getHourOfDay = getHourOfDay.toJsFn, getMilliSeconds = getMilliSeconds.toJsFn, getMinutes = getMinutes.toJsFn, getMonth = getMonth.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, getTimezoneOffset = getTimezoneOffset.toJsFn, getWeekOfMonth = getWeekOfMonth.toJsFn, getWeekOfYear = getWeekOfYear.toJsFn, getWeekYear = getWeekYear.toJsFn, getWeeksInWeekYear = getWeeksInWeekYear.toJsFn, getYear = getYear.toJsFn, rollSetMonth = js.Any.fromFunction1((t0: Number) => rollSetMonth(t0).runNow()), set = js.Any.fromFunction7((t0: Number, t1: Number, t2: Number, t3: Number, t4: Number, t5: Number, t6: Number) => (set(t0, t1, t2, t3, t4, t5, t6)).runNow()), setDayOfMonth = js.Any.fromFunction1((t0: Number) => setDayOfMonth(t0).runNow()), setHourOfDay = js.Any.fromFunction1((t0: Number) => setHourOfDay(t0).runNow()), setMilliSeconds = js.Any.fromFunction1((t0: Number) => setMilliSeconds(t0).runNow()), setMinutes = js.Any.fromFunction1((t0: Number) => setMinutes(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Number) => setMonth(t0).runNow()), setSeconds = js.Any.fromFunction1((t0: Number) => setSeconds(t0).runNow()), setTime = js.Any.fromFunction1((t0: Number) => setTime(t0).runNow()), setTimezoneOffset = js.Any.fromFunction1((t0: Number) => setTimezoneOffset(t0).runNow()), setWeekDate = js.Any.fromFunction3((t0: Number, t1: Number, t2: Number) => (setWeekDate(t0, t1, t2)).runNow()), setYear = js.Any.fromFunction1((t0: Number) => setYear(t0).runNow()))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[GregorianCalendar]
    }
    
    extension [Self <: GregorianCalendar](x: Self) {
      
      inline def setAddDayOfMonth(value: Number => Callback): Self = StObject.set(x, "addDayOfMonth", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddHourOfDay(value: Number => Callback): Self = StObject.set(x, "addHourOfDay", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddMilliSecond(value: Number => Callback): Self = StObject.set(x, "addMilliSecond", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddMinute(value: Number => Callback): Self = StObject.set(x, "addMinute", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddMonth(value: Number => Callback): Self = StObject.set(x, "addMonth", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddSecond(value: Number => Callback): Self = StObject.set(x, "addSecond", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setAddYear(value: Number => Callback): Self = StObject.set(x, "addYear", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setCompareToDay(value: GregorianCalendar => Number): Self = StObject.set(x, "compareToDay", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: GregorianCalendar => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetDayOfMonth(value: CallbackTo[Number]): Self = StObject.set(x, "getDayOfMonth", value.toJsFn)
      
      inline def setGetDayOfWeek(value: CallbackTo[Number]): Self = StObject.set(x, "getDayOfWeek", value.toJsFn)
      
      inline def setGetDayOfWeekInMonth(value: CallbackTo[Number]): Self = StObject.set(x, "getDayOfWeekInMonth", value.toJsFn)
      
      inline def setGetDayOfYear(value: CallbackTo[Number]): Self = StObject.set(x, "getDayOfYear", value.toJsFn)
      
      inline def setGetHourOfDay(value: CallbackTo[Number]): Self = StObject.set(x, "getHourOfDay", value.toJsFn)
      
      inline def setGetMilliSeconds(value: CallbackTo[Number]): Self = StObject.set(x, "getMilliSeconds", value.toJsFn)
      
      inline def setGetMinutes(value: CallbackTo[Number]): Self = StObject.set(x, "getMinutes", value.toJsFn)
      
      inline def setGetMonth(value: CallbackTo[Number]): Self = StObject.set(x, "getMonth", value.toJsFn)
      
      inline def setGetSeconds(value: CallbackTo[Number]): Self = StObject.set(x, "getSeconds", value.toJsFn)
      
      inline def setGetTime(value: CallbackTo[Number]): Self = StObject.set(x, "getTime", value.toJsFn)
      
      inline def setGetTimezoneOffset(value: CallbackTo[Number]): Self = StObject.set(x, "getTimezoneOffset", value.toJsFn)
      
      inline def setGetWeekOfMonth(value: CallbackTo[Number]): Self = StObject.set(x, "getWeekOfMonth", value.toJsFn)
      
      inline def setGetWeekOfYear(value: CallbackTo[Number]): Self = StObject.set(x, "getWeekOfYear", value.toJsFn)
      
      inline def setGetWeekYear(value: CallbackTo[Number]): Self = StObject.set(x, "getWeekYear", value.toJsFn)
      
      inline def setGetWeeksInWeekYear(value: CallbackTo[Number]): Self = StObject.set(x, "getWeeksInWeekYear", value.toJsFn)
      
      inline def setGetYear(value: CallbackTo[Number]): Self = StObject.set(x, "getYear", value.toJsFn)
      
      inline def setRollSetMonth(value: Number => Callback): Self = StObject.set(x, "rollSetMonth", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSet(value: (Number, Number, Number, Number, Number, Number, Number) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction7((t0: Number, t1: Number, t2: Number, t3: Number, t4: Number, t5: Number, t6: Number) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setSetDayOfMonth(value: Number => Callback): Self = StObject.set(x, "setDayOfMonth", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetHourOfDay(value: Number => Callback): Self = StObject.set(x, "setHourOfDay", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetMilliSeconds(value: Number => Callback): Self = StObject.set(x, "setMilliSeconds", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetMinutes(value: Number => Callback): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetMonth(value: Number => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetSeconds(value: Number => Callback): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetTime(value: Number => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetTimezoneOffset(value: Number => Callback): Self = StObject.set(x, "setTimezoneOffset", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setSetWeekDate(value: (Number, Number, Number) => Callback): Self = StObject.set(x, "setWeekDate", js.Any.fromFunction3((t0: Number, t1: Number, t2: Number) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetYear(value: Number => Callback): Self = StObject.set(x, "setYear", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
    }
  }
}
