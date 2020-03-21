package typingsJapgolly.webpackServe.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpackServe.AnonCompiler
import typingsJapgolly.webpackServe.AnonCompilerStats
import typingsJapgolly.webpackServe.AnonOptions
import typingsJapgolly.webpackServe.AnonStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
trait OnOptions extends js.Object {
  var `build-finished`: js.UndefOr[js.Function1[/* args */ AnonStats, Unit]] = js.undefined
  var `build-started`: js.UndefOr[js.Function1[/* args */ AnonCompiler, Unit]] = js.undefined
  var `compiler-error`: js.UndefOr[js.Function1[/* args */ AnonCompilerStats, Unit]] = js.undefined
  var `compiler-warning`: js.UndefOr[js.Function1[/* args */ AnonCompilerStats, Unit]] = js.undefined
  var listening: js.UndefOr[js.Function1[/* args */ AnonOptions, Unit]] = js.undefined
}

object OnOptions {
  @scala.inline
  def apply(
    `build-finished`: /* args */ AnonStats => Callback = null,
    `build-started`: /* args */ AnonCompiler => Callback = null,
    `compiler-error`: /* args */ AnonCompilerStats => Callback = null,
    `compiler-warning`: /* args */ AnonCompilerStats => Callback = null,
    listening: /* args */ AnonOptions => Callback = null
  ): OnOptions = {
    val __obj = js.Dynamic.literal()
    if (`build-finished` != null) __obj.updateDynamic("build-finished")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.AnonStats) => `build-finished`(t0).runNow()))
    if (`build-started` != null) __obj.updateDynamic("build-started")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.AnonCompiler) => `build-started`(t0).runNow()))
    if (`compiler-error` != null) __obj.updateDynamic("compiler-error")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.AnonCompilerStats) => `compiler-error`(t0).runNow()))
    if (`compiler-warning` != null) __obj.updateDynamic("compiler-warning")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.AnonCompilerStats) => `compiler-warning`(t0).runNow()))
    if (listening != null) __obj.updateDynamic("listening")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.AnonOptions) => listening(t0).runNow()))
    __obj.asInstanceOf[OnOptions]
  }
}

