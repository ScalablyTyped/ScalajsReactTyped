package typingsJapgolly.tensorflowTfjsLayers.exportsLayersMod

import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsJapgolly.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN")
@js.native
class RNN_ protected ()
  extends typingsJapgolly.tensorflowTfjsLayers.recurrentMod.RNN_ {
  def this(args: RNNLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN")
@js.native
object RNN_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

