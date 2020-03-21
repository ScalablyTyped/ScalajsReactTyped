package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "Tensor")
@js.native
class Tensor_[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */] protected ()
  extends typingsJapgolly.tensorflowTfjs.mod.Tensor_[R] {
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    dataId: DataId,
    id: Double
  ) = this()
}

