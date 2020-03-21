package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsJapgolly.tensorflowTfjsLayers.modelsMod.SequentialArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "Sequential")
@js.native
class Sequential_ ()
  extends typingsJapgolly.tensorflowTfjsLayers.mod.Sequential_ {
  def this(args: SequentialArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "Sequential")
@js.native
object Sequential_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](
    cls: SerializableConstructor[T],
    config: ConfigDict,
    customObjects: ConfigDict,
    fastWeightInit: Boolean
  ): T = js.native
}

