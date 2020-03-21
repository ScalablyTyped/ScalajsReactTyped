package typingsJapgolly.three.mod

import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Float64BufferAttribute")
@js.native
class Float64BufferAttribute protected ()
  extends typingsJapgolly.three.bufferAttributeMod.Float64BufferAttribute {
  def this(array: scala.scalajs.js.typedarray.ArrayBuffer, itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: js.Iterable[Double], itemSize: Double) = this()
  def this(array: scala.scalajs.js.typedarray.ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: js.Iterable[Double], itemSize: Double, normalized: Boolean) = this()
}

