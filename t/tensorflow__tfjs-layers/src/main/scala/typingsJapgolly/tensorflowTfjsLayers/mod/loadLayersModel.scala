package typingsJapgolly.tensorflowTfjsLayers.mod

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
@js.native
object loadLayersModel extends js.Object {
  def apply(pathOrIOHandler: String): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: String, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  def apply(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
}

