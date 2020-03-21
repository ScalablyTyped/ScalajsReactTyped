package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor_format", JSImport.Namespace)
@js.native
object tensorFormatMod extends js.Object {
  def tensorToString(vals: js.Array[String], shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = js.native
  def tensorToString(vals: TypedArray, shape: js.Array[Double], dtype: DataType, verbose: Boolean): String = js.native
}

