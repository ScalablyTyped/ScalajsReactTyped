package typingsJapgolly.pythonStruct

import typingsJapgolly.long.mod.Long
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-struct", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def pack(format: String, data: DataType*): Buffer = js.native
  def pack(format: String, data: js.Array[DataType]): Buffer = js.native
  def sizeOf(format: String): Double = js.native
  def unpack(format: String, data: Buffer): js.Array[DataType] = js.native
  def unpack(format: String, data: Buffer, checkBounds: Boolean): js.Array[DataType] = js.native
  def unpackFrom(format: String, data: Buffer, checkBounds: js.UndefOr[scala.Nothing], position: Double): DataType = js.native
  def unpackFrom(format: String, data: Buffer, checkBounds: Boolean, position: Double): DataType = js.native
  type DataType = Double | Long | String | Boolean
}

