package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
trait JdbcTimestamp extends StObject {
  
  def after(when: JdbcTimestamp): Boolean
  
  def before(when: JdbcTimestamp): Boolean
  
  def getDate(): Integer
  
  def getHours(): Integer
  
  def getMinutes(): Integer
  
  def getMonth(): Integer
  
  def getNanos(): Integer
  
  def getSeconds(): Integer
  
  def getTime(): Integer
  
  def getYear(): Integer
  
  def setDate(date: Integer): Unit
  
  def setHours(hours: Integer): Unit
  
  def setMinutes(minutes: Integer): Unit
  
  def setMonth(month: Integer): Unit
  
  def setNanos(nanoseconds: Integer): Unit
  
  def setSeconds(seconds: Integer): Unit
  
  def setTime(milliseconds: Integer): Unit
  
  def setYear(year: Integer): Unit
}
object JdbcTimestamp {
  
  inline def apply(
    after: JdbcTimestamp => Boolean,
    before: JdbcTimestamp => Boolean,
    getDate: CallbackTo[Integer],
    getHours: CallbackTo[Integer],
    getMinutes: CallbackTo[Integer],
    getMonth: CallbackTo[Integer],
    getNanos: CallbackTo[Integer],
    getSeconds: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    getYear: CallbackTo[Integer],
    setDate: Integer => Callback,
    setHours: Integer => Callback,
    setMinutes: Integer => Callback,
    setMonth: Integer => Callback,
    setNanos: Integer => Callback,
    setSeconds: Integer => Callback,
    setTime: Integer => Callback,
    setYear: Integer => Callback
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = getDate.toJsFn, getHours = getHours.toJsFn, getMinutes = getMinutes.toJsFn, getMonth = getMonth.toJsFn, getNanos = getNanos.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, getYear = getYear.toJsFn, setDate = js.Any.fromFunction1((t0: Integer) => setDate(t0).runNow()), setHours = js.Any.fromFunction1((t0: Integer) => setHours(t0).runNow()), setMinutes = js.Any.fromFunction1((t0: Integer) => setMinutes(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Integer) => setMonth(t0).runNow()), setNanos = js.Any.fromFunction1((t0: Integer) => setNanos(t0).runNow()), setSeconds = js.Any.fromFunction1((t0: Integer) => setSeconds(t0).runNow()), setTime = js.Any.fromFunction1((t0: Integer) => setTime(t0).runNow()), setYear = js.Any.fromFunction1((t0: Integer) => setYear(t0).runNow()))
    __obj.asInstanceOf[JdbcTimestamp]
  }
  
  extension [Self <: JdbcTimestamp](x: Self) {
    
    inline def setAfter(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: JdbcTimestamp => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setGetDate(value: CallbackTo[Integer]): Self = StObject.set(x, "getDate", value.toJsFn)
    
    inline def setGetHours(value: CallbackTo[Integer]): Self = StObject.set(x, "getHours", value.toJsFn)
    
    inline def setGetMinutes(value: CallbackTo[Integer]): Self = StObject.set(x, "getMinutes", value.toJsFn)
    
    inline def setGetMonth(value: CallbackTo[Integer]): Self = StObject.set(x, "getMonth", value.toJsFn)
    
    inline def setGetNanos(value: CallbackTo[Integer]): Self = StObject.set(x, "getNanos", value.toJsFn)
    
    inline def setGetSeconds(value: CallbackTo[Integer]): Self = StObject.set(x, "getSeconds", value.toJsFn)
    
    inline def setGetTime(value: CallbackTo[Integer]): Self = StObject.set(x, "getTime", value.toJsFn)
    
    inline def setGetYear(value: CallbackTo[Integer]): Self = StObject.set(x, "getYear", value.toJsFn)
    
    inline def setSetDate(value: Integer => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetHours(value: Integer => Callback): Self = StObject.set(x, "setHours", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetMinutes(value: Integer => Callback): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetMonth(value: Integer => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetNanos(value: Integer => Callback): Self = StObject.set(x, "setNanos", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetSeconds(value: Integer => Callback): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetTime(value: Integer => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetYear(value: Integer => Callback): Self = StObject.set(x, "setYear", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
  }
}
