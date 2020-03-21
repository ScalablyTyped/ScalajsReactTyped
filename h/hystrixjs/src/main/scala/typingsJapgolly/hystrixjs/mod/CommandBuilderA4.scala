package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  def build(): CommandA4[R, T, U, V, W]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA4[R, T, U, V, W]
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA4[R, T, U, V, W]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA4[R, T, U, V, W]
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W]
  def timeout(value: Double): CommandBuilderA4[R, T, U, V, W]
}

object CommandBuilderA4 {
  @scala.inline
  def apply[R, T, U, V, W](
    build: CallbackTo[CommandA4[R, T, U, V, W]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    context: js.Any => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    run: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]],
    timeout: Double => CallbackTo[CommandBuilderA4[R, T, U, V, W]]
  ): CommandBuilderA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
}

