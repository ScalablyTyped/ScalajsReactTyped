package typingsJapgolly.tensorflowTfjsCore.backendMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.AnonUnreliable
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit
  def memory(): AnonUnreliable
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit
  /** Returns number of data ids currently in the storage. */
  def numDataIds(): Double
  def read(dataId: DataId): js.Promise[BackendValues]
  def readSync(dataId: DataId): BackendValues
  def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId
}

object TensorStorage {
  @scala.inline
  def apply(
    disposeData: DataId => Callback,
    memory: CallbackTo[AnonUnreliable],
    move: (DataId, BackendValues, js.Array[Double], DataType) => Callback,
    numDataIds: CallbackTo[Double],
    read: DataId => CallbackTo[js.Promise[BackendValues]],
    readSync: DataId => CallbackTo[BackendValues],
    write: (BackendValues, js.Array[Double], DataType) => CallbackTo[DataId]
  ): TensorStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disposeData")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId) => disposeData(t0).runNow()))
    __obj.updateDynamic("memory")(memory.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction4((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId, t1: typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues, t2: js.Array[scala.Double], t3: typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType) => move(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("numDataIds")(numDataIds.toJsFn)
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId) => read(t0).runNow()))
    __obj.updateDynamic("readSync")(js.Any.fromFunction1((t0: typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId) => readSync(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction3((t0: typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues, t1: js.Array[scala.Double], t2: typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType) => write(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TensorStorage]
  }
}

