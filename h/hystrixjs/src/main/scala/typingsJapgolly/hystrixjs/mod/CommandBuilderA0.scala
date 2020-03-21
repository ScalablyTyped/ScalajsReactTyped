package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA0[R] extends js.Object {
  def build(): CommandA0[R]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA0[R]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA0[R]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA0[R]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA0[R]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA0[R]
  def context(value: js.Any): CommandBuilderA0[R]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA0[R]
  def fallbackTo(value: js.Function1[/* error */ js.Error, js.Thenable[R]]): CommandBuilderA0[R]
  def percentileWindowLength(value: Double): CommandBuilderA0[R]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA0[R]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA0[R]
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R]
  def statisticalWindowLength(value: Double): CommandBuilderA0[R]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA0[R]
  def timeout(value: Double): CommandBuilderA0[R]
}

object CommandBuilderA0 {
  @scala.inline
  def apply[R](
    build: CallbackTo[CommandA0[R]],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilderA0[R]],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilderA0[R]],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilderA0[R]],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilderA0[R]],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilderA0[R]],
    context: js.Any => CallbackTo[CommandBuilderA0[R]],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilderA0[R]],
    fallbackTo: js.Function1[/* error */ js.Error, js.Thenable[R]] => CallbackTo[CommandBuilderA0[R]],
    percentileWindowLength: Double => CallbackTo[CommandBuilderA0[R]],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA0[R]],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilderA0[R]],
    run: js.Function0[js.Thenable[R]] => CallbackTo[CommandBuilderA0[R]],
    statisticalWindowLength: Double => CallbackTo[CommandBuilderA0[R]],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilderA0[R]],
    timeout: Double => CallbackTo[CommandBuilderA0[R]]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Error, js.Thenable[R]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function0[js.Thenable[R]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
}

