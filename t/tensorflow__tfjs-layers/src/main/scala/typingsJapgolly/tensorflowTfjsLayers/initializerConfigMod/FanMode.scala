package typingsJapgolly.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
*/
trait FanMode extends js.Object

object FanMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fanAvg: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = this.cast("fanAvg")
  @scala.inline
  def fanIn: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = this.cast("fanIn")
  @scala.inline
  def fanOut: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = this.cast("fanOut")
}

