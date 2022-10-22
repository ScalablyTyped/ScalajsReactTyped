package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideSchedule extends StObject {
  
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime
  
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration
  
  def getName(): String
  
  def isInSchedule(time: GlideDateTime): String
  
  def isValid(): Boolean
  
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit
  
  def setTimeZone(tz: String): Unit
  
  def whenNext(time: GlideDateTime, timeZone: String): Double
}
object GlideSchedule {
  
  inline def apply(
    add: (GlideDateTime, GlideDuration) => GlideDateTime,
    duration: (GlideDateTime, GlideDateTime) => GlideDuration,
    getName: CallbackTo[String],
    isInSchedule: GlideDateTime => String,
    isValid: CallbackTo[Boolean],
    load: (String, String, String) => Callback,
    setTimeZone: String => Callback,
    whenNext: (GlideDateTime, String) => Double
  ): GlideSchedule = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), duration = js.Any.fromFunction2(duration), getName = getName.toJsFn, isInSchedule = js.Any.fromFunction1(isInSchedule), isValid = isValid.toJsFn, load = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (load(t0, t1, t2)).runNow()), setTimeZone = js.Any.fromFunction1((t0: String) => setTimeZone(t0).runNow()), whenNext = js.Any.fromFunction2(whenNext))
    __obj.asInstanceOf[GlideSchedule]
  }
  
  extension [Self <: GlideSchedule](x: Self) {
    
    inline def setAdd(value: (GlideDateTime, GlideDuration) => GlideDateTime): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setDuration(value: (GlideDateTime, GlideDateTime) => GlideDuration): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setIsInSchedule(value: GlideDateTime => String): Self = StObject.set(x, "isInSchedule", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setLoad(value: (String, String, String) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetTimeZone(value: String => Callback): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWhenNext(value: (GlideDateTime, String) => Double): Self = StObject.set(x, "whenNext", js.Any.fromFunction2(value))
  }
}
