package typingsJapgolly.tensorflowTfjsLayers.advancedActivationsMod

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`1`
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
@js.native
class ELU () extends Layer {
  def this(args: ELULayerArgs) = this()
  val DEFAULT_ALPHA: `1` = js.native
  val alpha: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
@js.native
object ELU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

