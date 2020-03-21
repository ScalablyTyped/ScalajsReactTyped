package typingsJapgolly.eventHooksWebpackPlugin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var additionalPass: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeRun: js.UndefOr[js.Function0[Unit]] = js.undefined
  var compilation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var compile: js.UndefOr[js.Function0[Unit]] = js.undefined
  var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  var emit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var entryOption: js.UndefOr[js.Function0[Unit]] = js.undefined
  var environment: js.UndefOr[js.Function0[Unit]] = js.undefined
  var failed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var invalid: js.UndefOr[js.Function0[Unit]] = js.undefined
  var make: js.UndefOr[js.Function0[Unit]] = js.undefined
  var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
  var run: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var watchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var watchRun: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalPass: js.UndefOr[Callback] = js.undefined,
    afterCompile: js.UndefOr[Callback] = js.undefined,
    afterEmit: js.UndefOr[Callback] = js.undefined,
    afterEnvironment: js.UndefOr[Callback] = js.undefined,
    afterPlugins: js.UndefOr[Callback] = js.undefined,
    afterResolvers: js.UndefOr[Callback] = js.undefined,
    beforeCompile: js.UndefOr[Callback] = js.undefined,
    beforeRun: js.UndefOr[Callback] = js.undefined,
    compilation: js.UndefOr[Callback] = js.undefined,
    compile: js.UndefOr[Callback] = js.undefined,
    contextModuleFactory: js.UndefOr[Callback] = js.undefined,
    done: js.UndefOr[Callback] = js.undefined,
    emit: js.UndefOr[Callback] = js.undefined,
    entryOption: js.UndefOr[Callback] = js.undefined,
    environment: js.UndefOr[Callback] = js.undefined,
    failed: js.UndefOr[Callback] = js.undefined,
    invalid: js.UndefOr[Callback] = js.undefined,
    make: js.UndefOr[Callback] = js.undefined,
    normalModuleFactory: js.UndefOr[Callback] = js.undefined,
    run: js.UndefOr[Callback] = js.undefined,
    shouldEmit: js.UndefOr[Callback] = js.undefined,
    thisCompilation: js.UndefOr[Callback] = js.undefined,
    watchClose: js.UndefOr[Callback] = js.undefined,
    watchRun: js.UndefOr[Callback] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    additionalPass.foreach(p => __obj.updateDynamic("additionalPass")(p.toJsFn))
    afterCompile.foreach(p => __obj.updateDynamic("afterCompile")(p.toJsFn))
    afterEmit.foreach(p => __obj.updateDynamic("afterEmit")(p.toJsFn))
    afterEnvironment.foreach(p => __obj.updateDynamic("afterEnvironment")(p.toJsFn))
    afterPlugins.foreach(p => __obj.updateDynamic("afterPlugins")(p.toJsFn))
    afterResolvers.foreach(p => __obj.updateDynamic("afterResolvers")(p.toJsFn))
    beforeCompile.foreach(p => __obj.updateDynamic("beforeCompile")(p.toJsFn))
    beforeRun.foreach(p => __obj.updateDynamic("beforeRun")(p.toJsFn))
    compilation.foreach(p => __obj.updateDynamic("compilation")(p.toJsFn))
    compile.foreach(p => __obj.updateDynamic("compile")(p.toJsFn))
    contextModuleFactory.foreach(p => __obj.updateDynamic("contextModuleFactory")(p.toJsFn))
    done.foreach(p => __obj.updateDynamic("done")(p.toJsFn))
    emit.foreach(p => __obj.updateDynamic("emit")(p.toJsFn))
    entryOption.foreach(p => __obj.updateDynamic("entryOption")(p.toJsFn))
    environment.foreach(p => __obj.updateDynamic("environment")(p.toJsFn))
    failed.foreach(p => __obj.updateDynamic("failed")(p.toJsFn))
    invalid.foreach(p => __obj.updateDynamic("invalid")(p.toJsFn))
    make.foreach(p => __obj.updateDynamic("make")(p.toJsFn))
    normalModuleFactory.foreach(p => __obj.updateDynamic("normalModuleFactory")(p.toJsFn))
    run.foreach(p => __obj.updateDynamic("run")(p.toJsFn))
    shouldEmit.foreach(p => __obj.updateDynamic("shouldEmit")(p.toJsFn))
    thisCompilation.foreach(p => __obj.updateDynamic("thisCompilation")(p.toJsFn))
    watchClose.foreach(p => __obj.updateDynamic("watchClose")(p.toJsFn))
    watchRun.foreach(p => __obj.updateDynamic("watchRun")(p.toJsFn))
    __obj.asInstanceOf[Options]
  }
}

