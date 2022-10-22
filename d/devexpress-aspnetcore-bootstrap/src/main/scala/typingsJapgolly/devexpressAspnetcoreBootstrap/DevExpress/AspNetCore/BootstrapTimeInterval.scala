package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTimeInterval extends StObject {
  
  def contains(interval: BootstrapTimeInterval): Boolean
  
  def equals(interval: BootstrapTimeInterval): Boolean
  
  def getAllDay(): Boolean
  
  def getDuration(): Double
  
  def getEnd(): js.Date
  
  def getStart(): js.Date
  
  /* protected */ val instance: Any
  
  def intersectsWith(interval: BootstrapTimeInterval): Boolean
  
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean
  
  def setAllDay(allDayValue: Boolean): Unit
  
  def setDuration(value: Double): Unit
  
  def setEnd(value: js.Date): Unit
  
  def setStart(value: js.Date): Unit
}
object BootstrapTimeInterval {
  
  inline def apply(
    contains: BootstrapTimeInterval => Boolean,
    equals_ : BootstrapTimeInterval => Boolean,
    getAllDay: CallbackTo[Boolean],
    getDuration: CallbackTo[Double],
    getEnd: CallbackTo[js.Date],
    getStart: CallbackTo[js.Date],
    instance: Any,
    intersectsWith: BootstrapTimeInterval => Boolean,
    intersectsWithExcludingBounds: BootstrapTimeInterval => Boolean,
    setAllDay: Boolean => Callback,
    setDuration: Double => Callback,
    setEnd: js.Date => Callback,
    setStart: js.Date => Callback
  ): BootstrapTimeInterval = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAllDay = getAllDay.toJsFn, getDuration = getDuration.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, instance = instance.asInstanceOf[js.Any], intersectsWith = js.Any.fromFunction1(intersectsWith), intersectsWithExcludingBounds = js.Any.fromFunction1(intersectsWithExcludingBounds), setAllDay = js.Any.fromFunction1((t0: Boolean) => setAllDay(t0).runNow()), setDuration = js.Any.fromFunction1((t0: Double) => setDuration(t0).runNow()), setEnd = js.Any.fromFunction1((t0: js.Date) => setEnd(t0).runNow()), setStart = js.Any.fromFunction1((t0: js.Date) => setStart(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[BootstrapTimeInterval]
  }
  
  extension [Self <: BootstrapTimeInterval](x: Self) {
    
    inline def setContains(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetAllDay(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllDay", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIntersectsWith(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWith", js.Any.fromFunction1(value))
    
    inline def setIntersectsWithExcludingBounds(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    inline def setSetAllDay(value: Boolean => Callback): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetDuration(value: Double => Callback): Self = StObject.set(x, "setDuration", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
  }
}
