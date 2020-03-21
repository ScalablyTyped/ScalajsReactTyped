package typingsJapgolly.tensorflowTfjsLayers.callbacksMod

import typingsJapgolly.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "Callback")
@js.native
abstract class Callback () extends BaseCallback {
  /** Instance of `keras.models.Model`. Reference of the model being trained. */
  var model: LayersModel = js.native
}

