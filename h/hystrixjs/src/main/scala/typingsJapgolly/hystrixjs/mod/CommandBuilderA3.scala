package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA3[R, T, U, V] extends js.Object {
  def build(): CommandA3[R, T, U, V]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA3[R, T, U, V]
  def context(value: js.Any): CommandBuilderA3[R, T, U, V]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA3[R, T, U, V]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def percentileWindowLength(value: Double): CommandBuilderA3[R, T, U, V]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA3[R, T, U, V]
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def statisticalWindowLength(value: Double): CommandBuilderA3[R, T, U, V]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V]
  def timeout(value: Double): CommandBuilderA3[R, T, U, V]
}

object CommandBuilderA3 {
  @scala.inline
  def apply[R, T, U, V](
    build: CallbackTo[CommandA3[R, T, U, V]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA3[R, T, U, V]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA3[R, T, U, V]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    context: js.Any => CallbackTo[CommandBuilderA3[R, T, U, V]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA3[R, T, U, V]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CallbackTo[CommandBuilderA3[R, T, U, V]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    run: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CallbackTo[CommandBuilderA3[R, T, U, V]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA3[R, T, U, V]],
    timeout: Double => CallbackTo[CommandBuilderA3[R, T, U, V]]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
}

