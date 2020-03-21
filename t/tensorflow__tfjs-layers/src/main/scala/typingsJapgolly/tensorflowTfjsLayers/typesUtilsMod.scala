package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", JSImport.Namespace)
@js.native
object typesUtilsMod extends js.Object {
  def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = js.native
  def getExactlyOneTensor(xs: js.Array[Tensor_[Rank]]): Tensor_[Rank] = js.native
  def getExactlyOneTensor(xs: Tensor_[Rank]): Tensor_[Rank] = js.native
  def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = js.native
  def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = js.native
}

