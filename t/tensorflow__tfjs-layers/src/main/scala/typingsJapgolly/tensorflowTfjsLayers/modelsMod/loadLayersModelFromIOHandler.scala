package typingsJapgolly.tensorflowTfjsLayers.modelsMod

import typingsJapgolly.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/models", "loadLayersModelFromIOHandler")
@js.native
object loadLayersModelFromIOHandler extends js.Object {
  def apply(handler: IOHandler): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict): js.Promise[LayersModel] = js.native
  def apply(handler: IOHandler, customObjects: ConfigDict, options: LoadOptions): js.Promise[LayersModel] = js.native
}

