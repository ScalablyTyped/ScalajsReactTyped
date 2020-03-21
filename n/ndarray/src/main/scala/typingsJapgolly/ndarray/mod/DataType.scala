package typingsJapgolly.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ndarray.ndarrayStrings.int8
  - typingsJapgolly.ndarray.ndarrayStrings.int16
  - typingsJapgolly.ndarray.ndarrayStrings.int32
  - typingsJapgolly.ndarray.ndarrayStrings.uint8
  - typingsJapgolly.ndarray.ndarrayStrings.uint16
  - typingsJapgolly.ndarray.ndarrayStrings.uint32
  - typingsJapgolly.ndarray.ndarrayStrings.float32
  - typingsJapgolly.ndarray.ndarrayStrings.float64
  - typingsJapgolly.ndarray.ndarrayStrings.array
  - typingsJapgolly.ndarray.ndarrayStrings.uint8_clamped
  - typingsJapgolly.ndarray.ndarrayStrings.buffer
  - typingsJapgolly.ndarray.ndarrayStrings.generic
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def array: typingsJapgolly.ndarray.ndarrayStrings.array = this.cast("array")
  @scala.inline
  def buffer: typingsJapgolly.ndarray.ndarrayStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def float32: typingsJapgolly.ndarray.ndarrayStrings.float32 = this.cast("float32")
  @scala.inline
  def float64: typingsJapgolly.ndarray.ndarrayStrings.float64 = this.cast("float64")
  @scala.inline
  def generic: typingsJapgolly.ndarray.ndarrayStrings.generic = this.cast("generic")
  @scala.inline
  def int16: typingsJapgolly.ndarray.ndarrayStrings.int16 = this.cast("int16")
  @scala.inline
  def int32: typingsJapgolly.ndarray.ndarrayStrings.int32 = this.cast("int32")
  @scala.inline
  def int8: typingsJapgolly.ndarray.ndarrayStrings.int8 = this.cast("int8")
  @scala.inline
  def uint16: typingsJapgolly.ndarray.ndarrayStrings.uint16 = this.cast("uint16")
  @scala.inline
  def uint32: typingsJapgolly.ndarray.ndarrayStrings.uint32 = this.cast("uint32")
  @scala.inline
  def uint8: typingsJapgolly.ndarray.ndarrayStrings.uint8 = this.cast("uint8")
  @scala.inline
  def uint8_clamped: typingsJapgolly.ndarray.ndarrayStrings.uint8_clamped = this.cast("uint8_clamped")
}

