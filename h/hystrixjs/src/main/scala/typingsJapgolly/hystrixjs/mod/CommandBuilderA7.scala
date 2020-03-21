package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def build(): CommandA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def fallbackTo(
    value: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def timeout(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
}

object CommandBuilderA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](
    build: CallbackTo[CommandA7[R, T, U, V, W, X, Y, Z]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    context: js.Any => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    run: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]],
    timeout: Double => CallbackTo[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  }
}

