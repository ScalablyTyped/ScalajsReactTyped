package typingsJapgolly.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
  - typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
*/
trait NumericDataType extends js.Object

object NumericDataType {
  @scala.inline
  def bool: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32 = this.cast("int32")
}

