package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "unsortedSegmentSum")
@js.native
object unsortedSegmentSum extends js.Object {
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
}

