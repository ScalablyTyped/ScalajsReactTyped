package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor_util", JSImport.Namespace)
@js.native
object tensorUtilMod extends js.Object {
  def assertTypesMatch(a: Tensor[Rank], b: Tensor[Rank]): Unit = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[Rank]] = js.native
  def isTensorInList(tensor: Tensor[Rank], tensorList: js.Array[Tensor[Rank]]): Boolean = js.native
  def makeTypesMatch[T /* <: Tensor[Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}

