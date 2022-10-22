package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Time. For documentation of this class, see java.sql.Time
  * .
  */
trait JdbcTime extends StObject {
  
  def after(when: JdbcTime): Boolean
  
  def before(when: JdbcTime): Boolean
  
  def getHours(): Integer
  
  def getMinutes(): Integer
  
  def getSeconds(): Integer
  
  def getTime(): Integer
  
  def setHours(hours: Integer): Unit
  
  def setMinutes(minutes: Integer): Unit
  
  def setSeconds(seconds: Integer): Unit
  
  def setTime(milliseconds: Integer): Unit
}
object JdbcTime {
  
  inline def apply(
    after: JdbcTime => Boolean,
    before: JdbcTime => Boolean,
    getHours: CallbackTo[Integer],
    getMinutes: CallbackTo[Integer],
    getSeconds: CallbackTo[Integer],
    getTime: CallbackTo[Integer],
    setHours: Integer => Callback,
    setMinutes: Integer => Callback,
    setSeconds: Integer => Callback,
    setTime: Integer => Callback
  ): JdbcTime = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getHours = getHours.toJsFn, getMinutes = getMinutes.toJsFn, getSeconds = getSeconds.toJsFn, getTime = getTime.toJsFn, setHours = js.Any.fromFunction1((t0: Integer) => setHours(t0).runNow()), setMinutes = js.Any.fromFunction1((t0: Integer) => setMinutes(t0).runNow()), setSeconds = js.Any.fromFunction1((t0: Integer) => setSeconds(t0).runNow()), setTime = js.Any.fromFunction1((t0: Integer) => setTime(t0).runNow()))
    __obj.asInstanceOf[JdbcTime]
  }
  
  extension [Self <: JdbcTime](x: Self) {
    
    inline def setAfter(value: JdbcTime => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setBefore(value: JdbcTime => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setGetHours(value: CallbackTo[Integer]): Self = StObject.set(x, "getHours", value.toJsFn)
    
    inline def setGetMinutes(value: CallbackTo[Integer]): Self = StObject.set(x, "getMinutes", value.toJsFn)
    
    inline def setGetSeconds(value: CallbackTo[Integer]): Self = StObject.set(x, "getSeconds", value.toJsFn)
    
    inline def setGetTime(value: CallbackTo[Integer]): Self = StObject.set(x, "getTime", value.toJsFn)
    
    inline def setSetHours(value: Integer => Callback): Self = StObject.set(x, "setHours", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetMinutes(value: Integer => Callback): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetSeconds(value: Integer => Callback): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    
    inline def setSetTime(value: Integer => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
  }
}
