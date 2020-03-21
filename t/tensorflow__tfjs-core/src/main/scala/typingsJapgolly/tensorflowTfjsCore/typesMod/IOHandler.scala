package typingsJapgolly.tensorflowTfjsCore.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOHandler extends js.Object {
  var load: js.UndefOr[LoadHandler] = js.undefined
  var save: js.UndefOr[SaveHandler] = js.undefined
}

object IOHandler {
  @scala.inline
  def apply(
    load: js.UndefOr[CallbackTo[js.Promise[ModelArtifacts]]] = js.undefined,
    save: /* modelArtifact */ ModelArtifacts => CallbackTo[js.Promise[SaveResult]] = null
  ): IOHandler = {
    val __obj = js.Dynamic.literal()
    load.foreach(p => __obj.updateDynamic("load")(p.toJsFn))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* modelArtifact */ typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts) => save(t0).runNow()))
    __obj.asInstanceOf[IOHandler]
  }
}

