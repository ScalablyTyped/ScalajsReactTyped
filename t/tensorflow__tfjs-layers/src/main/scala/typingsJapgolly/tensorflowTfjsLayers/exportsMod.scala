package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsLayers.baseCallbacksMod.BaseCallbackConstructor
import typingsJapgolly.tensorflowTfjsLayers.containerMod.ContainerArgs
import typingsJapgolly.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typingsJapgolly.tensorflowTfjsLayers.modelsMod.Sequential
import typingsJapgolly.tensorflowTfjsLayers.modelsMod.SequentialArgs
import typingsJapgolly.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import typingsJapgolly.tensorflowTfjsLayers.trainingMod.LayersModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  def input(config: InputConfig): SymbolicTensor = js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = js.native
  def model(args: ContainerArgs): LayersModel = js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  def sequential(): Sequential = js.native
  def sequential(config: SequentialArgs): Sequential = js.native
}

