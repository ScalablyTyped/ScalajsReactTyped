package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel
import typingsJapgolly.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_models", JSImport.Namespace)
@js.native
object exportsModelsMod extends js.Object {
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[LayersModel] = js.native
  def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
}

