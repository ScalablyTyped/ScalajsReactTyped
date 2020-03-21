package typingsJapgolly.tensorflowTfjsLayers.poolingMod

import typingsJapgolly.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.Layer
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling1D")
@js.native
abstract class GlobalPooling1D protected () extends Layer {
  def this(args: LayerArgs) = this()
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

