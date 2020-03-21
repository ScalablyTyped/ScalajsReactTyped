package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA2[R, T, U] extends js.Object {
  def build(): CommandA2[R, T, U]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA2[R, T, U]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA2[R, T, U]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA2[R, T, U]
  def context(value: js.Any): CommandBuilderA2[R, T, U]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA2[R, T, U]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def percentileWindowLength(value: Double): CommandBuilderA2[R, T, U]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA2[R, T, U]
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def statisticalWindowLength(value: Double): CommandBuilderA2[R, T, U]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  def timeout(value: Double): CommandBuilderA2[R, T, U]
}

object CommandBuilderA2 {
  @scala.inline
  def apply[R, T, U](
    build: CallbackTo[CommandA2[R, T, U]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA2[R, T, U]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA2[R, T, U]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    context: js.Any => CallbackTo[CommandBuilderA2[R, T, U]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA2[R, T, U]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CallbackTo[CommandBuilderA2[R, T, U]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    run: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CallbackTo[CommandBuilderA2[R, T, U]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA2[R, T, U]],
    timeout: Double => CallbackTo[CommandBuilderA2[R, T, U]]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
}

