package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilderA6[R, T, U, V, W, X, Y] extends StObject {
  
  def build(): CommandA6[R, T, U, V, W, X, Y]
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def context(value: Any): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], PromiseLike[R]]): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def percentileWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, PromiseLike[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def statisticalWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  
  def timeout(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
}
object CommandBuilderA6 {
  
  inline def apply[R, T, U, V, W, X, Y](
    build: CallbackTo[CommandA6[R, T, U, V, W, X, Y]],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceClosed: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceOpened: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    context: Any => CommandBuilderA6[R, T, U, V, W, X, Y],
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], PromiseLike[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    requestVolumeRejectionThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, PromiseLike[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    timeout: Double => CommandBuilderA6[R, T, U, V, W, X, Y]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
  
  extension [Self <: CommandBuilderA6[?, ?, ?, ?, ?, ?, ?], R, T, U, V, W, X, Y](x: Self & (CommandBuilderA6[R, T, U, V, W, X, Y])) {
    
    inline def setBuild(value: CallbackTo[CommandA6[R, T, U, V, W, X, Y]]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], PromiseLike[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(
      value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, PromiseLike[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
