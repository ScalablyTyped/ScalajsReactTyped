package typingsJapgolly.tensorflowTfjsLayers.inputLayerMod

import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/input_layer", "InputLayer")
@js.native
class InputLayer protected () extends Layer {
  def this(args: InputLayerArgs) = this()
  var sparse: Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/engine/input_layer", "InputLayer")
@js.native
object InputLayer extends js.Object {
  /** @nocollapse */
  val className: typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.InputLayer = js.native
}

