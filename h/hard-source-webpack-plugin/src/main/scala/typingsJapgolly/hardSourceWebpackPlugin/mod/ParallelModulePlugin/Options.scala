package typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fork: js.UndefOr[
    js.Function3[/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String, Unit]
  ] = js.undefined
  var minModules: js.UndefOr[Double] = js.undefined
  var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fork: (/* fork */ forkFn, /* compiler */ Compiler_, /* webpackBin */ String) => Callback = null,
    minModules: Int | Double = null,
    numWorkers: Double | js.Function0[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fork != null) __obj.updateDynamic("fork")(js.Any.fromFunction3((t0: /* fork */ typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin.forkFn, t1: /* compiler */ typingsJapgolly.webpack.mod.Compiler_, t2: /* webpackBin */ java.lang.String) => fork(t0, t1, t2).runNow()))
    if (minModules != null) __obj.updateDynamic("minModules")(minModules.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

