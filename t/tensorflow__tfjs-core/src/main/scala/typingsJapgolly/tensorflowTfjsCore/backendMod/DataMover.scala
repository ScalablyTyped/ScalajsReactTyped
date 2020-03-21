package typingsJapgolly.tensorflowTfjsCore.backendMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMover extends js.Object {
  /**
    * To be called by backends whenever they see a dataId that they don't own.
    * Upon calling this method, the mover will fetch the tensor from another
    * backend and register it with the current active backend.
    */
  def moveData(backend: KernelBackend, dataId: DataId): Unit
}

object DataMover {
  @scala.inline
  def apply(moveData: (KernelBackend, DataId) => Callback): DataMover = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moveData")(js.Any.fromFunction2((t0: typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend, t1: typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId) => moveData(t0, t1).runNow()))
    __obj.asInstanceOf[DataMover]
  }
}

