package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typingsJapgolly.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "models")
@js.native
object models extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}

