package typingsJapgolly.jupyterlabCoreutils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ phase in @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Transform} */
trait phaseinPhaseTransform extends js.Object {
  var compose: js.UndefOr[Transform] = js.undefined
  var fetch: js.UndefOr[Transform] = js.undefined
}

object phaseinPhaseTransform {
  @scala.inline
  def apply(
    compose: /* plugin */ IPlugin => CallbackTo[IPlugin] = null,
    fetch: /* plugin */ IPlugin => CallbackTo[IPlugin] = null
  ): phaseinPhaseTransform = {
    val __obj = js.Dynamic.literal()
    if (compose != null) __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: /* plugin */ typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin) => compose(t0).runNow()))
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: /* plugin */ typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin) => fetch(t0).runNow()))
    __obj.asInstanceOf[phaseinPhaseTransform]
  }
}

