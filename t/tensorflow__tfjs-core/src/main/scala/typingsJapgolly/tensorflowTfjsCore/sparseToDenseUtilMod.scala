package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/sparse_to_dense_util", JSImport.Namespace)
@js.native
object sparseToDenseUtilMod extends js.Object {
  def validateInput(
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: js.Array[Double],
    defaultValues: Tensor[Rank]
  ): Unit = js.native
}

