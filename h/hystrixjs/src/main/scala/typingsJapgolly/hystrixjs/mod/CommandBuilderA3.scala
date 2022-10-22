package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilderA3[R, T, U, V] extends StObject {
  
  def build(): CommandA3[R, T, U, V]
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA3[R, T, U, V]
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA3[R, T, U, V]
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA3[R, T, U, V]
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA3[R, T, U, V]
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA3[R, T, U, V]
  
  def context(value: Any): CommandBuilderA3[R, T, U, V]
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilderA3[R, T, U, V]
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], PromiseLike[R]]): CommandBuilderA3[R, T, U, V]
  
  def percentileWindowLength(value: Double): CommandBuilderA3[R, T, U, V]
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V]
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA3[R, T, U, V]
  
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, PromiseLike[R]]): CommandBuilderA3[R, T, U, V]
  
  def statisticalWindowLength(value: Double): CommandBuilderA3[R, T, U, V]
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V]
  
  def timeout(value: Double): CommandBuilderA3[R, T, U, V]
}
object CommandBuilderA3 {
  
  inline def apply[R, T, U, V](
    build: CallbackTo[CommandA3[R, T, U, V]],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceClosed: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceOpened: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA3[R, T, U, V],
    context: Any => CommandBuilderA3[R, T, U, V],
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilderA3[R, T, U, V],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], PromiseLike[R]] => CommandBuilderA3[R, T, U, V],
    percentileWindowLength: Double => CommandBuilderA3[R, T, U, V],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    requestVolumeRejectionThreshold: Double => CommandBuilderA3[R, T, U, V],
    run: js.Function3[/* t */ T, /* u */ U, /* v */ V, PromiseLike[R]] => CommandBuilderA3[R, T, U, V],
    statisticalWindowLength: Double => CommandBuilderA3[R, T, U, V],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    timeout: Double => CommandBuilderA3[R, T, U, V]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
  
  extension [Self <: CommandBuilderA3[?, ?, ?, ?], R, T, U, V](x: Self & (CommandBuilderA3[R, T, U, V])) {
    
    inline def setBuild(value: CallbackTo[CommandA3[R, T, U, V]]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], PromiseLike[R]] => CommandBuilderA3[R, T, U, V]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(
      value: js.Function3[/* t */ T, /* u */ U, /* v */ V, PromiseLike[R]] => CommandBuilderA3[R, T, U, V]
    ): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
