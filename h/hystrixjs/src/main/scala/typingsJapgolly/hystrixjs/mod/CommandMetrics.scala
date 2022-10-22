package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetrics extends StObject {
  
  def addExecutionTime(value: Double): Unit
  
  def decrementExecutionCount(): Unit
  
  def getCurrentExecutionCount(): Double
  
  def getExecutionTime(percentile: Any): Double
  
  def getHealthCounts(): HealthCounts
  
  def getRollingCount(`type`: Any): Double
  
  def incrementExecutionCount(): Unit
  
  def markFailure(): Unit
  
  def markRejected(): Unit
  
  def markShortCircuited(): Unit
  
  def markSuccess(): Unit
  
  def markTimeout(): Unit
  
  def reset(): Unit
}
object CommandMetrics {
  
  inline def apply(
    addExecutionTime: Double => Callback,
    decrementExecutionCount: Callback,
    getCurrentExecutionCount: CallbackTo[Double],
    getExecutionTime: Any => Double,
    getHealthCounts: CallbackTo[HealthCounts],
    getRollingCount: Any => Double,
    incrementExecutionCount: Callback,
    markFailure: Callback,
    markRejected: Callback,
    markShortCircuited: Callback,
    markSuccess: Callback,
    markTimeout: Callback,
    reset: Callback
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1((t0: Double) => addExecutionTime(t0).runNow()), decrementExecutionCount = decrementExecutionCount.toJsFn, getCurrentExecutionCount = getCurrentExecutionCount.toJsFn, getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = getHealthCounts.toJsFn, getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = incrementExecutionCount.toJsFn, markFailure = markFailure.toJsFn, markRejected = markRejected.toJsFn, markShortCircuited = markShortCircuited.toJsFn, markSuccess = markSuccess.toJsFn, markTimeout = markTimeout.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[CommandMetrics]
  }
  
  extension [Self <: CommandMetrics](x: Self) {
    
    inline def setAddExecutionTime(value: Double => Callback): Self = StObject.set(x, "addExecutionTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDecrementExecutionCount(value: Callback): Self = StObject.set(x, "decrementExecutionCount", value.toJsFn)
    
    inline def setGetCurrentExecutionCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentExecutionCount", value.toJsFn)
    
    inline def setGetExecutionTime(value: Any => Double): Self = StObject.set(x, "getExecutionTime", js.Any.fromFunction1(value))
    
    inline def setGetHealthCounts(value: CallbackTo[HealthCounts]): Self = StObject.set(x, "getHealthCounts", value.toJsFn)
    
    inline def setGetRollingCount(value: Any => Double): Self = StObject.set(x, "getRollingCount", js.Any.fromFunction1(value))
    
    inline def setIncrementExecutionCount(value: Callback): Self = StObject.set(x, "incrementExecutionCount", value.toJsFn)
    
    inline def setMarkFailure(value: Callback): Self = StObject.set(x, "markFailure", value.toJsFn)
    
    inline def setMarkRejected(value: Callback): Self = StObject.set(x, "markRejected", value.toJsFn)
    
    inline def setMarkShortCircuited(value: Callback): Self = StObject.set(x, "markShortCircuited", value.toJsFn)
    
    inline def setMarkSuccess(value: Callback): Self = StObject.set(x, "markSuccess", value.toJsFn)
    
    inline def setMarkTimeout(value: Callback): Self = StObject.set(x, "markTimeout", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
