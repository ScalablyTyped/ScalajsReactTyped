package typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
*/
trait Distribution extends js.Object

object Distribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncatedNormal: truncatedNormal_ = this.cast("truncatedNormal")
  @scala.inline
  def uniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

