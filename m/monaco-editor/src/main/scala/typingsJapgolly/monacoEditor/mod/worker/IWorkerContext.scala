package typingsJapgolly.monacoEditor.mod.worker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkerContext[H] extends js.Object {
  /**
    * A proxy to the main thread host object.
    */
  var host: H
  /**
    * Get all available mirror models in this worker.
    */
  def getMirrorModels(): js.Array[IMirrorModel]
}

object IWorkerContext {
  @scala.inline
  def apply[H](getMirrorModels: CallbackTo[js.Array[IMirrorModel]], host: H): IWorkerContext[H] = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.updateDynamic("getMirrorModels")(getMirrorModels.toJsFn)
    __obj.asInstanceOf[IWorkerContext[H]]
  }
}

