package typingsJapgolly.tensorflowTfjsLayers.modelsMod

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel
import typingsJapgolly.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "modelFromJSON")
@js.native
object modelFromJSON extends js.Object {
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def apply(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

