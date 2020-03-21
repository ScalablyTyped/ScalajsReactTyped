package typingsJapgolly.tensorflowTfjsLayers.coreMod

import typingsJapgolly.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense")
@js.native
class Dense protected () extends Layer {
  def this(args: DenseLayerArgs) = this()
  val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
  val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
  var activation: js.Any = js.native
  var bias: js.Any = js.native
  val biasConstraint: js.UndefOr[js.Any] = js.native
  var biasInitializer: js.Any = js.native
  val biasRegularizer: js.UndefOr[js.Any] = js.native
  var kernel: js.Any = js.native
  val kernelConstraint: js.UndefOr[js.Any] = js.native
  var kernelInitializer: js.Any = js.native
  val kernelRegularizer: js.UndefOr[js.Any] = js.native
  var units: js.Any = js.native
  var useBias: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dense")
@js.native
object Dense extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

