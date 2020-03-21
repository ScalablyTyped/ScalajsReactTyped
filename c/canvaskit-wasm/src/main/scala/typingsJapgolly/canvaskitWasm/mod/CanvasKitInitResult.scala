package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasKitInitResult extends js.Object {
  def ready(): js.Promise[CanvasKit]
}

object CanvasKitInitResult {
  @scala.inline
  def apply(ready: CallbackTo[js.Promise[CanvasKit]]): CanvasKitInitResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.asInstanceOf[CanvasKitInitResult]
  }
}

