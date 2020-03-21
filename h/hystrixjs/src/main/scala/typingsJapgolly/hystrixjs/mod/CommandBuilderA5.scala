package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  def build(): CommandA5[R, T, U, V, W, X]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA5[R, T, U, V, W, X]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def timeout(value: Double): CommandBuilderA5[R, T, U, V, W, X]
}

object CommandBuilderA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](
    build: CallbackTo[CommandA5[R, T, U, V, W, X]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    context: js.Any => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    run: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]],
    timeout: Double => CallbackTo[CommandBuilderA5[R, T, U, V, W, X]]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
}

