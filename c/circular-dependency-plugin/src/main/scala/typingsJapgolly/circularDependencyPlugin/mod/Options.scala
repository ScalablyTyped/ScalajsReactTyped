package typingsJapgolly.circularDependencyPlugin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.circularDependencyPlugin.AnonCompilation
import typingsJapgolly.circularDependencyPlugin.AnonCompilationCompilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowAsyncCycles: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.RegExp] = js.undefined
  var failOnError: js.UndefOr[Boolean] = js.undefined
  var onDetected: js.UndefOr[js.Function1[/* x */ AnonCompilation, Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* x */ AnonCompilationCompilation, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* x */ AnonCompilationCompilation, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowAsyncCycles: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    exclude: js.RegExp = null,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    onDetected: /* x */ AnonCompilation => Callback = null,
    onEnd: /* x */ AnonCompilationCompilation => Callback = null,
    onStart: /* x */ AnonCompilationCompilation => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAsyncCycles)) __obj.updateDynamic("allowAsyncCycles")(allowAsyncCycles.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.asInstanceOf[js.Any])
    if (onDetected != null) __obj.updateDynamic("onDetected")(js.Any.fromFunction1((t0: /* x */ typingsJapgolly.circularDependencyPlugin.AnonCompilation) => onDetected(t0).runNow()))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* x */ typingsJapgolly.circularDependencyPlugin.AnonCompilationCompilation) => onEnd(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* x */ typingsJapgolly.circularDependencyPlugin.AnonCompilationCompilation) => onStart(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

