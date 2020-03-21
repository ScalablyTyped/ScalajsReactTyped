package typingsJapgolly.tensorflowTfjsCore.opsMod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Scalar
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "sparseToDense")
@js.native
object sparseToDense extends js.Object {
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  def apply[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
}

