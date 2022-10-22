package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HystrixConfig_ extends StObject {
  
  def circuitBreakerErrorThresholdPercentage(): Double
  
  def circuitBreakerForceClosed(): Boolean
  
  def circuitBreakerForceOpened(): Boolean
  
  def circuitBreakerRequestVolumeThreshold(): Double
  
  def circuitBreakerRequestVolumeThresholdForceOverride(): Boolean
  
  def circuitBreakerRequestVolumeThresholdOverride(): Double
  
  def circuitBreakerSleepWindowInMilliseconds(): Double
  
  def executionTimeoutInMilliseconds(): Double
  
  def init(properties: HystrixProperties): Unit
  
  def metricsPercentileWindowBuckets(): Double
  
  def metricsPercentileWindowInMilliseconds(): Double
  
  def metricsStatisticalWindowBuckets(): Double
  
  def metricsStatisticalWindowInMilliseconds(): Double
  
  def requestVolumeRejectionThreshold(): Double
  
  def resetProperties(): Unit
}
object HystrixConfig_ {
  
  inline def apply(
    circuitBreakerErrorThresholdPercentage: CallbackTo[Double],
    circuitBreakerForceClosed: CallbackTo[Boolean],
    circuitBreakerForceOpened: CallbackTo[Boolean],
    circuitBreakerRequestVolumeThreshold: CallbackTo[Double],
    circuitBreakerRequestVolumeThresholdForceOverride: CallbackTo[Boolean],
    circuitBreakerRequestVolumeThresholdOverride: CallbackTo[Double],
    circuitBreakerSleepWindowInMilliseconds: CallbackTo[Double],
    executionTimeoutInMilliseconds: CallbackTo[Double],
    init: HystrixProperties => Callback,
    metricsPercentileWindowBuckets: CallbackTo[Double],
    metricsPercentileWindowInMilliseconds: CallbackTo[Double],
    metricsStatisticalWindowBuckets: CallbackTo[Double],
    metricsStatisticalWindowInMilliseconds: CallbackTo[Double],
    requestVolumeRejectionThreshold: CallbackTo[Double],
    resetProperties: Callback
  ): HystrixConfig_ = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage.toJsFn, circuitBreakerForceClosed = circuitBreakerForceClosed.toJsFn, circuitBreakerForceOpened = circuitBreakerForceOpened.toJsFn, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold.toJsFn, circuitBreakerRequestVolumeThresholdForceOverride = circuitBreakerRequestVolumeThresholdForceOverride.toJsFn, circuitBreakerRequestVolumeThresholdOverride = circuitBreakerRequestVolumeThresholdOverride.toJsFn, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds.toJsFn, executionTimeoutInMilliseconds = executionTimeoutInMilliseconds.toJsFn, init = js.Any.fromFunction1((t0: HystrixProperties) => init(t0).runNow()), metricsPercentileWindowBuckets = metricsPercentileWindowBuckets.toJsFn, metricsPercentileWindowInMilliseconds = metricsPercentileWindowInMilliseconds.toJsFn, metricsStatisticalWindowBuckets = metricsStatisticalWindowBuckets.toJsFn, metricsStatisticalWindowInMilliseconds = metricsStatisticalWindowInMilliseconds.toJsFn, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold.toJsFn, resetProperties = resetProperties.toJsFn)
    __obj.asInstanceOf[HystrixConfig_]
  }
  
  extension [Self <: HystrixConfig_](x: Self) {
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: CallbackTo[Double]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", value.toJsFn)
    
    inline def setCircuitBreakerForceClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "circuitBreakerForceClosed", value.toJsFn)
    
    inline def setCircuitBreakerForceOpened(value: CallbackTo[Boolean]): Self = StObject.set(x, "circuitBreakerForceOpened", value.toJsFn)
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: CallbackTo[Double]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", value.toJsFn)
    
    inline def setCircuitBreakerRequestVolumeThresholdForceOverride(value: CallbackTo[Boolean]): Self = StObject.set(x, "circuitBreakerRequestVolumeThresholdForceOverride", value.toJsFn)
    
    inline def setCircuitBreakerRequestVolumeThresholdOverride(value: CallbackTo[Double]): Self = StObject.set(x, "circuitBreakerRequestVolumeThresholdOverride", value.toJsFn)
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", value.toJsFn)
    
    inline def setExecutionTimeoutInMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "executionTimeoutInMilliseconds", value.toJsFn)
    
    inline def setInit(value: HystrixProperties => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: HystrixProperties) => value(t0).runNow()))
    
    inline def setMetricsPercentileWindowBuckets(value: CallbackTo[Double]): Self = StObject.set(x, "metricsPercentileWindowBuckets", value.toJsFn)
    
    inline def setMetricsPercentileWindowInMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "metricsPercentileWindowInMilliseconds", value.toJsFn)
    
    inline def setMetricsStatisticalWindowBuckets(value: CallbackTo[Double]): Self = StObject.set(x, "metricsStatisticalWindowBuckets", value.toJsFn)
    
    inline def setMetricsStatisticalWindowInMilliseconds(value: CallbackTo[Double]): Self = StObject.set(x, "metricsStatisticalWindowInMilliseconds", value.toJsFn)
    
    inline def setRequestVolumeRejectionThreshold(value: CallbackTo[Double]): Self = StObject.set(x, "requestVolumeRejectionThreshold", value.toJsFn)
    
    inline def setResetProperties(value: Callback): Self = StObject.set(x, "resetProperties", value.toJsFn)
  }
}
