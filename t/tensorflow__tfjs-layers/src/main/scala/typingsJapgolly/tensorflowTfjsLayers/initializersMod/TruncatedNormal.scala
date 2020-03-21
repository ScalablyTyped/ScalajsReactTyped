package typingsJapgolly.tensorflowTfjsLayers.initializersMod

import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`0.05`
import typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
@js.native
class TruncatedNormal protected () extends Initializer {
  def this(args: TruncatedNormalArgs) = this()
  val DEFAULT_MEAN: `0` = js.native
  val DEFAULT_STDDEV: `0.05` = js.native
  var mean: js.Any = js.native
  var seed: js.Any = js.native
  var stddev: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
@js.native
object TruncatedNormal extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

