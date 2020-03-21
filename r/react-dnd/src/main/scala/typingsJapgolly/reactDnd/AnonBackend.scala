package typingsJapgolly.reactDnd

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dndCore.interfacesMod.Backend
import typingsJapgolly.dndCore.interfacesMod.BackendFactory
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackend[BackendContext, BackendOptions] extends DndProviderProps[BackendContext, BackendOptions] {
  var backend: BackendFactory
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[BackendOptions] = js.undefined
}

object AnonBackend {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => CallbackTo[Backend],
    context: BackendContext = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    options: BackendOptions = null
  ): AnonBackend[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backend")(js.Any.fromFunction3((t0: /* manager */ typingsJapgolly.dndCore.interfacesMod.DragDropManager, t1: /* globalContext */ js.UndefOr[js.Any], t2: /* configuration */ js.UndefOr[js.Any]) => backend(t0, t1, t2).runNow()))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackend[BackendContext, BackendOptions]]
  }
}

