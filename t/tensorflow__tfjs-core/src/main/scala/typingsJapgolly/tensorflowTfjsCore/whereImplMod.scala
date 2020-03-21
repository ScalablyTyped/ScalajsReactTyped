package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/where_impl", JSImport.Namespace)
@js.native
object whereImplMod extends js.Object {
  def whereImpl(condShape: js.Array[Double], condVals: TypedArray): Tensor2D = js.native
}

