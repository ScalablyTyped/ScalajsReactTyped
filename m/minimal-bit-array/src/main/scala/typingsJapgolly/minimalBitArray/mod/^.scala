package typingsJapgolly.minimalBitArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minimal-bit-array", JSImport.Namespace)
@js.native
class ^ protected () extends BitArray {
  def this(length: Double) = this()
  /* CompleteClass */
  override var bits: scala.scalajs.js.typedarray.Uint32Array = js.native
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override def get(index: Double): Boolean = js.native
  /* CompleteClass */
  override def set(index: Double, value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def toJSON(): BitArrayJSON = js.native
}

@JSImport("minimal-bit-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromJSON(bitArrayJSON: BitArrayJSON): BitArray = js.native
}

