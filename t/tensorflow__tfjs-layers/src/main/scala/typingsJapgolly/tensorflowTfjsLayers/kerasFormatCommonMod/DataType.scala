package typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def bool: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complex64: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = this.cast("complex64")
  @scala.inline
  def float32: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = this.cast("float32")
  @scala.inline
  def int32: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = this.cast("int32")
  @scala.inline
  def string: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = this.cast("string")
}

