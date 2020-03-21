package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA1[R, T] extends js.Object {
  def build(): CommandA1[R, T]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA1[R, T]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA1[R, T]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA1[R, T]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA1[R, T]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA1[R, T]
  def context(value: js.Any): CommandBuilderA1[R, T]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA1[R, T]
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T]
  def percentileWindowLength(value: Double): CommandBuilderA1[R, T]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA1[R, T]
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T]
  def statisticalWindowLength(value: Double): CommandBuilderA1[R, T]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  def timeout(value: Double): CommandBuilderA1[R, T]
}

object CommandBuilderA1 {
  @scala.inline
  def apply[R, T](
    build: CallbackTo[CommandA1[R, T]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA1[R, T]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA1[R, T]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA1[R, T]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA1[R, T]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA1[R, T]],
    context: js.Any => CallbackTo[CommandBuilderA1[R, T]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA1[R, T]],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]] => CallbackTo[CommandBuilderA1[R, T]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA1[R, T]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA1[R, T]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA1[R, T]],
    run: js.Function1[/* t */ T, js.Thenable[R]] => CallbackTo[CommandBuilderA1[R, T]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA1[R, T]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA1[R, T]],
    timeout: Double => CallbackTo[CommandBuilderA1[R, T]]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
}

