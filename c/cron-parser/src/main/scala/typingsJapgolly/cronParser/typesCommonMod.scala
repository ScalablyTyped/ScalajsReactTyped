package typingsJapgolly.cronParser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cronParser.cronParserBooleans.`false`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommonMod {
  
  trait CronDate extends StObject {
    
    def addDay(): Unit
    
    def addHour(): Unit
    
    def addMinute(): Unit
    
    def addMonth(): Unit
    
    def addSecond(): Unit
    
    def addYear(): Unit
    
    def getDate(): Double
    
    def getDay(): Double
    
    def getFullYear(): Double
    
    def getHours(): Double
    
    def getMilliseconds(): Double
    
    def getMinutes(): Double
    
    def getMonth(): Double
    
    def getSeconds(): Double
    
    def getTime(): Double
    
    def getUTCDate(): Double
    
    def getUTCDay(): Double
    
    def getUTCFullYear(): Double
    
    def getUTCHours(): Double
    
    def getUTCMinutes(): Double
    
    def getUTCMonth(): Double
    
    def getUTCSeconds(): Double
    
    def isLastDayOfMonth(): Boolean
    
    def setDate(d: Double): Unit
    
    def setDay(d: Double): Unit
    
    def setFullYear(y: Double): Unit
    
    def setHours(h: Double): Unit
    
    def setMilliseconds(s: Double): Unit
    
    def setMinutes(m: Double): Unit
    
    def setMonth(m: Double): Unit
    
    def setSeconds(s: Double): Unit
    
    def subtractDay(): Unit
    
    def subtractHour(): Unit
    
    def subtractMinute(): Unit
    
    def subtractMonth(): Unit
    
    def subtractSecond(): Unit
    
    def subtractYear(): Unit
    
    def toDate(): js.Date
    
    def toISOString(): String
    
    def toJSON(): String
  }
  object CronDate {
    
    inline def apply(
      addDay: Callback,
      addHour: Callback,
      addMinute: Callback,
      addMonth: Callback,
      addSecond: Callback,
      addYear: Callback,
      getDate: CallbackTo[Double],
      getDay: CallbackTo[Double],
      getFullYear: CallbackTo[Double],
      getHours: CallbackTo[Double],
      getMilliseconds: CallbackTo[Double],
      getMinutes: CallbackTo[Double],
      getMonth: CallbackTo[Double],
      getSeconds: CallbackTo[Double],
      getTime: CallbackTo[Double],
      getUTCDate: CallbackTo[Double],
      getUTCDay: CallbackTo[Double],
      getUTCFullYear: CallbackTo[Double],
      getUTCHours: CallbackTo[Double],
      getUTCMinutes: CallbackTo[Double],
      getUTCMonth: CallbackTo[Double],
      getUTCSeconds: CallbackTo[Double],
      isLastDayOfMonth: CallbackTo[Boolean],
      setDate: Double => Callback,
      setDay: Double => Callback,
      setFullYear: Double => Callback,
      setHours: Double => Callback,
      setMilliseconds: Double => Callback,
      setMinutes: Double => Callback,
      setMonth: Double => Callback,
      setSeconds: Double => Callback,
      subtractDay: Callback,
      subtractHour: Callback,
      subtractMinute: Callback,
      subtractMonth: Callback,
      subtractSecond: Callback,
      subtractYear: Callback,
      toDate: CallbackTo[js.Date],
      toISOString: CallbackTo[String],
      toJSON: CallbackTo[String]
    ): CronDate = {
      val __obj = js.Dynamic.literal(addDay = addDay.toJsFn, addHour = addHour.toJsFn, addMinute = addMinute.toJsFn, addMonth = addMonth.toJsFn, addSecond = addSecond.toJsFn, addYear = addYear.toJsFn, getDate = getDate.toJsFn, getDay = getDay.toJsFn, getFullYear = getFullYear.toJsFn, getHours = getHours.toJsFn, getMilliseconds = getMilliseconds.toJsFn, getMinutes = getMinutes.toJsFn, getMonth = getMonth.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, getUTCDate = getUTCDate.toJsFn, getUTCDay = getUTCDay.toJsFn, getUTCFullYear = getUTCFullYear.toJsFn, getUTCHours = getUTCHours.toJsFn, getUTCMinutes = getUTCMinutes.toJsFn, getUTCMonth = getUTCMonth.toJsFn, getUTCSeconds = getUTCSeconds.toJsFn, isLastDayOfMonth = isLastDayOfMonth.toJsFn, setDate = js.Any.fromFunction1((t0: Double) => setDate(t0).runNow()), setDay = js.Any.fromFunction1((t0: Double) => setDay(t0).runNow()), setFullYear = js.Any.fromFunction1((t0: Double) => setFullYear(t0).runNow()), setHours = js.Any.fromFunction1((t0: Double) => setHours(t0).runNow()), setMilliseconds = js.Any.fromFunction1((t0: Double) => setMilliseconds(t0).runNow()), setMinutes = js.Any.fromFunction1((t0: Double) => setMinutes(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Double) => setMonth(t0).runNow()), setSeconds = js.Any.fromFunction1((t0: Double) => setSeconds(t0).runNow()), subtractDay = subtractDay.toJsFn, subtractHour = subtractHour.toJsFn, subtractMinute = subtractMinute.toJsFn, subtractMonth = subtractMonth.toJsFn, subtractSecond = subtractSecond.toJsFn, subtractYear = subtractYear.toJsFn, toDate = toDate.toJsFn, toISOString = toISOString.toJsFn, toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[CronDate]
    }
    
    extension [Self <: CronDate](x: Self) {
      
      inline def setAddDay(value: Callback): Self = StObject.set(x, "addDay", value.toJsFn)
      
      inline def setAddHour(value: Callback): Self = StObject.set(x, "addHour", value.toJsFn)
      
      inline def setAddMinute(value: Callback): Self = StObject.set(x, "addMinute", value.toJsFn)
      
      inline def setAddMonth(value: Callback): Self = StObject.set(x, "addMonth", value.toJsFn)
      
      inline def setAddSecond(value: Callback): Self = StObject.set(x, "addSecond", value.toJsFn)
      
      inline def setAddYear(value: Callback): Self = StObject.set(x, "addYear", value.toJsFn)
      
      inline def setGetDate(value: CallbackTo[Double]): Self = StObject.set(x, "getDate", value.toJsFn)
      
      inline def setGetDay(value: CallbackTo[Double]): Self = StObject.set(x, "getDay", value.toJsFn)
      
      inline def setGetFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getFullYear", value.toJsFn)
      
      inline def setGetHours(value: CallbackTo[Double]): Self = StObject.set(x, "getHours", value.toJsFn)
      
      inline def setGetMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "getMilliseconds", value.toJsFn)
      
      inline def setGetMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getMinutes", value.toJsFn)
      
      inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getMonth", value.toJsFn)
      
      inline def setGetSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getSeconds", value.toJsFn)
      
      inline def setGetTime(value: CallbackTo[Double]): Self = StObject.set(x, "getTime", value.toJsFn)
      
      inline def setGetUTCDate(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDate", value.toJsFn)
      
      inline def setGetUTCDay(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCDay", value.toJsFn)
      
      inline def setGetUTCFullYear(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCFullYear", value.toJsFn)
      
      inline def setGetUTCHours(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCHours", value.toJsFn)
      
      inline def setGetUTCMinutes(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMinutes", value.toJsFn)
      
      inline def setGetUTCMonth(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCMonth", value.toJsFn)
      
      inline def setGetUTCSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "getUTCSeconds", value.toJsFn)
      
      inline def setIsLastDayOfMonth(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLastDayOfMonth", value.toJsFn)
      
      inline def setSetDate(value: Double => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetDay(value: Double => Callback): Self = StObject.set(x, "setDay", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetFullYear(value: Double => Callback): Self = StObject.set(x, "setFullYear", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetHours(value: Double => Callback): Self = StObject.set(x, "setHours", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMilliseconds(value: Double => Callback): Self = StObject.set(x, "setMilliseconds", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMinutes(value: Double => Callback): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMonth(value: Double => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetSeconds(value: Double => Callback): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSubtractDay(value: Callback): Self = StObject.set(x, "subtractDay", value.toJsFn)
      
      inline def setSubtractHour(value: Callback): Self = StObject.set(x, "subtractHour", value.toJsFn)
      
      inline def setSubtractMinute(value: Callback): Self = StObject.set(x, "subtractMinute", value.toJsFn)
      
      inline def setSubtractMonth(value: Callback): Self = StObject.set(x, "subtractMonth", value.toJsFn)
      
      inline def setSubtractSecond(value: Callback): Self = StObject.set(x, "subtractSecond", value.toJsFn)
      
      inline def setSubtractYear(value: Callback): Self = StObject.set(x, "subtractYear", value.toJsFn)
      
      inline def setToDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "toDate", value.toJsFn)
      
      inline def setToISOString(value: CallbackTo[String]): Self = StObject.set(x, "toISOString", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  type DateType = js.Date | Double | String
  
  @js.native
  trait ICronExpression[CronFields, IsIterable /* <: Boolean */] extends StObject {
    
    val fields: CronFields = js.native
    
    /** Check if next suitable date exists */
    def hasNext(): Boolean = js.native
    
    /** Check if previous suitable date exists */
    def hasPrev(): Boolean = js.native
    
    /** Iterate over expression iterator */
    def iterate(steps: Double): js.Array[IteratorResultOrCronDate[IsIterable]] = js.native
    def iterate(
      steps: Double,
      callback: js.Function2[/* item */ IteratorResultOrCronDate[IsIterable], /* i */ Double, Unit]
    ): js.Array[IteratorResultOrCronDate[IsIterable]] = js.native
    
    /** Find next suitable date */
    def next(): IteratorResultOrCronDate[IsIterable] = js.native
    
    /** Find previous suitable date */
    def prev(): IteratorResultOrCronDate[IsIterable] = js.native
    
    /** Reset expression iterator state */
    def reset(): Unit = js.native
    def reset(resetDate: String): Unit = js.native
    def reset(resetDate: js.Date): Unit = js.native
    def reset(resetDate: Double): Unit = js.native
    
    def stringify(): String = js.native
    def stringify(includeSeconds: Boolean): String = js.native
  }
  
  trait IStringResult[CronFields] extends StObject {
    
    var errors: Record[String, Any]
    
    var expressions: js.Array[ICronExpression[CronFields, `false`]]
    
    var variables: Record[String, String]
  }
  object IStringResult {
    
    inline def apply[CronFields](
      errors: Record[String, Any],
      expressions: js.Array[ICronExpression[CronFields, `false`]],
      variables: Record[String, String]
    ): IStringResult[CronFields] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStringResult[CronFields]]
    }
    
    extension [Self <: IStringResult[?], CronFields](x: Self & IStringResult[CronFields]) {
      
      inline def setErrors(value: Record[String, Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setExpressions(value: js.Array[ICronExpression[CronFields, `false`]]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsVarargs(value: (ICronExpression[CronFields, `false`])*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setVariables(value: Record[String, String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    IsIterable extends true ? std.IteratorResult<cron-parser.cron-parser/types/common.CronDate, cron-parser.cron-parser/types/common.CronDate> : cron-parser.cron-parser/types/common.CronDate
    }}}
    */
  @js.native
  trait IteratorResultOrCronDate[IsIterable /* <: Boolean */] extends StObject
  
  trait ParserOptions[IsIterable /* <: Boolean */] extends StObject {
    
    var currentDate: js.UndefOr[DateType] = js.undefined
    
    var endDate: js.UndefOr[DateType] = js.undefined
    
    var iterator: js.UndefOr[IsIterable] = js.undefined
    
    var nthDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[DateType] = js.undefined
    
    var tz: js.UndefOr[String] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply[IsIterable /* <: Boolean */](): ParserOptions[IsIterable] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions[IsIterable]]
    }
    
    extension [Self <: ParserOptions[?], IsIterable /* <: Boolean */](x: Self & ParserOptions[IsIterable]) {
      
      inline def setCurrentDate(value: DateType): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setEndDate(value: DateType): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIterator(value: IsIterable): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
      
      inline def setIteratorUndefined: Self = StObject.set(x, "iterator", js.undefined)
      
      inline def setNthDayOfWeek(value: Double): Self = StObject.set(x, "nthDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setNthDayOfWeekUndefined: Self = StObject.set(x, "nthDayOfWeek", js.undefined)
      
      inline def setStartDate(value: DateType): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
}
