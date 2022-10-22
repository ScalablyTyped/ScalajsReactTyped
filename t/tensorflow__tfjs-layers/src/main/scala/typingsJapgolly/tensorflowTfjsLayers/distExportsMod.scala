package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallbackConstructor
import typingsJapgolly.tensorflowTfjsLayers.distEngineContainerMod.ContainerArgs
import typingsJapgolly.tensorflowTfjsLayers.distEngineInputLayerMod.InputConfig
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor
import typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.Sequential
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.SequentialArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def input(config: InputConfig): SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[SymbolicTensor]
  
  inline def loadLayersModel(pathOrIOHandler: String): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayersModel]]
  
  inline def model(args: ContainerArgs): LayersModel = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(args.asInstanceOf[js.Any]).asInstanceOf[LayersModel]
  
  inline def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallbackConstructor")(verbosityLevel.asInstanceOf[js.Any], callbackConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sequential(): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")().asInstanceOf[Sequential]
  inline def sequential(config: SequentialArgs): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")(config.asInstanceOf[js.Any]).asInstanceOf[Sequential]
}
