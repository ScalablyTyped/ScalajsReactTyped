package typingsJapgolly.tensorflowTfjsLayers.advancedActivationsMod

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`1`
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU")
@js.native
class ThresholdedReLU () extends Layer {
  def this(args: ThresholdedReLULayerArgs) = this()
  val DEFAULT_THETA: `1` = js.native
  val theta: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU")
@js.native
object ThresholdedReLU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

