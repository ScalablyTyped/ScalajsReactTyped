package typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
*/
trait DistributionSerialization extends js.Object

object DistributionSerialization {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = this.cast("normal")
  @scala.inline
  def truncated_normal: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = this.cast("truncated_normal")
  @scala.inline
  def uniform: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = this.cast("uniform")
}

