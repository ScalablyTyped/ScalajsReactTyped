package typingsJapgolly.vision.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The npm module used for rendering the templates. The module object must contain the compile() function
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
  */
trait NpmModule extends js.Object {
  /**
    * The rendering function. The required function signature depends on the compileMode settings
    */
  var compile: ServerViewCompile
  /**
    * Initializes additional engine state.The config object is the engine configuration object allowing updates to be made.
    * This is useful for engines like Nunjucks that rely on additional state for rendering. next has the signature function(err).
    */
  var prepare: js.UndefOr[
    js.Function2[
      /* config */ EngineConfigurationObject, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Registers a helper for use during template rendering.
    * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
    */
  var registerHelper: js.UndefOr[
    js.Function2[/* name */ String, /* helper */ js.Function1[/* repeated */ js.Any, _], Unit]
  ] = js.undefined
  /**
    * Registers a partial for use during template rendering.
    * The name is the partial path that templates should use to reference the partial and src is the uncompiled template string for the partial.
    */
  var registerPartial: js.UndefOr[js.Function2[/* name */ String, /* src */ String, Unit]] = js.undefined
}

object NpmModule {
  @scala.inline
  def apply(
    compile: ServerViewCompile,
    prepare: (/* config */ EngineConfigurationObject, /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback = null,
    registerHelper: (/* name */ String, /* helper */ js.Function1[/* repeated */ js.Any, js.Any]) => Callback = null,
    registerPartial: (/* name */ String, /* src */ String) => Callback = null
  ): NpmModule = {
    val __obj = js.Dynamic.literal(compile = compile.asInstanceOf[js.Any])
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction2((t0: /* config */ typingsJapgolly.vision.mod.EngineConfigurationObject, t1: /* next */ js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]) => prepare(t0, t1).runNow()))
    if (registerHelper != null) __obj.updateDynamic("registerHelper")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* helper */ js.Function1[/* repeated */ js.Any, js.Any]) => registerHelper(t0, t1).runNow()))
    if (registerPartial != null) __obj.updateDynamic("registerPartial")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* src */ java.lang.String) => registerPartial(t0, t1).runNow()))
    __obj.asInstanceOf[NpmModule]
  }
}

