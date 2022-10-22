package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
trait JdbcDate extends StObject {
  
  def after(when: JdbcDate): Boolean
  
  def before(when: JdbcDate): Boolean
  
  def getDate(): Integer
  
  def getMonth(): Integer
  
  def getTime(): Integer
  
  def getYear(): Integer
  
  def setDate(date: Integer): Unit
  
  def setMonth(month: Integer): Unit
  
  def setTime(milliseconds: Integer): Unit
  
  def setYear(year: Integer): Unit
}
object JdbcDate {
  
  inline def apply(
    after: JdbcDate => Boolean,
    before: JdbcDate => Boolean,
    getDate: CallbackTo[Integer],
    getMonth: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    getYear: CallbackTo[Integer],
    setDate: Integer => Callback,
    setMonth: Integer => Callback,
    setTime: Integer => Callback,
    setYear: Integer => Callback
  ): JdbcDate = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = getDate.toJsFn, getMonth = getMonth.toJsFn, getTime = getTime.toJsFn, getYear = getYear.toJsFn, setDate = js.Any.fromFunction1((t0: Integer) => setDate(t0).runNow()), setMonth = js.Any.fromFunction1((t0: Integer) => setMonth(t0).runNow()), setTime = js.Any.fromFunction1((t0: Integer) => setTime(t0).runNow()), setYear = js.Any.fromFunction1((t0: Integer) => setYear(t0).runNow()))
    __obj.asInstanceOf[JdbcDate]
  }
  
  extension [Self <: JdbcDate](x: Self) {
    
    inline def setAfter(value: JdbcDate => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: JdbcDate => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setGetDate(value: CallbackTo[Integer]): Self = StObject.set(x, "getDate", value.toJsFn)
    
    inline def setGetMonth(value: CallbackTo[Integer]): Self = StObject.set(x, "getMonth", value.toJsFn)
    
    inline def setGetTime(value: CallbackTo[Integer]): Self = StObject.set(x, "getTime", value.toJsFn)
    
    inline def setGetYear(value: CallbackTo[Integer]): Self = StObject.set(x, "getYear", value.toJsFn)
    
    inline def setSetDate(value: Integer => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetMonth(value: Integer => Callback): Self = StObject.set(x, "setMonth", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetTime(value: Integer => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetYear(value: Integer => Callback): Self = StObject.set(x, "setYear", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
  }
}
