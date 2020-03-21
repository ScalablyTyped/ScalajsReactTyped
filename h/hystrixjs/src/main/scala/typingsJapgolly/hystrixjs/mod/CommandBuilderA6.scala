package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  def build(): CommandA6[R, T, U, V, W, X, Y]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def timeout(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
}

object CommandBuilderA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](
    build: CallbackTo[CommandA6[R, T, U, V, W, X, Y]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    context: js.Any => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]],
    timeout: Double => CallbackTo[CommandBuilderA6[R, T, U, V, W, X, Y]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
}

