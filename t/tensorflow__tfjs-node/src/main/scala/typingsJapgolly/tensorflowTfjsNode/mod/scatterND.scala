package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "scatterND")
@js.native
object scatterND extends js.Object {
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    indices: TensorLike,
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank */](
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
}

