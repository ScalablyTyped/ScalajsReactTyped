package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.TensorBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/tile_impl", JSImport.Namespace)
@js.native
object tileImplMod extends js.Object {
  def tile[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = js.native
}

