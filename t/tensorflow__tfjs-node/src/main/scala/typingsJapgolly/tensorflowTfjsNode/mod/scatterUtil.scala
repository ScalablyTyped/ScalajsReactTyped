package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "scatter_util")
@js.native
object scatterUtil extends js.Object {
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  def validateInput(
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
}

