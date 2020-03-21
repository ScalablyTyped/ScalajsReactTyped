package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilder extends js.Object {
  def build(): Command
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilder
  def circuitBreakerForceClosed(value: Boolean): CommandBuilder
  def circuitBreakerForceOpened(value: Boolean): CommandBuilder
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilder
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilder
  def context(value: js.Any): CommandBuilder
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilder
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]]): CommandBuilder
  def percentileWindowLength(value: Double): CommandBuilder
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilder
  def requestVolumeRejectionThreshold(value: Double): CommandBuilder
  def run(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): CommandBuilder
  def statisticalWindowLength(value: Double): CommandBuilder
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilder
  def timeout(value: Double): CommandBuilder
}

object CommandBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[Command],
    circuitBreakerErrorThresholdPercentage: Double => CallbackTo[CommandBuilder],
    circuitBreakerForceClosed: Boolean => CallbackTo[CommandBuilder],
    circuitBreakerForceOpened: Boolean => CallbackTo[CommandBuilder],
    circuitBreakerRequestVolumeThreshold: Double => CallbackTo[CommandBuilder],
    circuitBreakerSleepWindowInMilliseconds: Double => CallbackTo[CommandBuilder],
    context: js.Any => CallbackTo[CommandBuilder],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CallbackTo[CommandBuilder],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[js.Any]], js.Thenable[js.Any]] => CallbackTo[CommandBuilder],
    percentileWindowLength: Double => CallbackTo[CommandBuilder],
    percentileWindowNumberOfBuckets: Double => CallbackTo[CommandBuilder],
    requestVolumeRejectionThreshold: Double => CallbackTo[CommandBuilder],
    run: js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]] => CallbackTo[CommandBuilder],
    statisticalWindowLength: Double => CallbackTo[CommandBuilder],
    statisticalWindowNumberOfBuckets: Double => CallbackTo[CommandBuilder],
    timeout: Double => CallbackTo[CommandBuilder]
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerErrorThresholdPercentage(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceClosed(t0).runNow()))
    __obj.updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1((t0: scala.Boolean) => circuitBreakerForceOpened(t0).runNow()))
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerRequestVolumeThreshold(t0).runNow()))
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1((t0: scala.Double) => circuitBreakerSleepWindowInMilliseconds(t0).runNow()))
    __obj.updateDynamic("context")(js.Any.fromFunction1((t0: js.Any) => context(t0).runNow()))
    __obj.updateDynamic("errorHandler")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, scala.Boolean]) => errorHandler(t0).runNow()))
    __obj.updateDynamic("fallbackTo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[js.Any]], js.Thenable[js.Any]]) => fallbackTo(t0).runNow()))
    __obj.updateDynamic("percentileWindowLength")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowLength(t0).runNow()))
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => percentileWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1((t0: scala.Double) => requestVolumeRejectionThreshold(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]) => run(t0).runNow()))
    __obj.updateDynamic("statisticalWindowLength")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowLength(t0).runNow()))
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1((t0: scala.Double) => statisticalWindowNumberOfBuckets(t0).runNow()))
    __obj.updateDynamic("timeout")(js.Any.fromFunction1((t0: scala.Double) => timeout(t0).runNow()))
    __obj.asInstanceOf[CommandBuilder]
  }
}

