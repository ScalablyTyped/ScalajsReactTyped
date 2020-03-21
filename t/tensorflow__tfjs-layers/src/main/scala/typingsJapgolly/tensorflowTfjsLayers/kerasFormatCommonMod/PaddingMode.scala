package typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
*/
trait PaddingMode extends js.Object

object PaddingMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def causal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = this.cast("causal")
  @scala.inline
  def same: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = this.cast("same")
  @scala.inline
  def valid: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = this.cast("valid")
}

