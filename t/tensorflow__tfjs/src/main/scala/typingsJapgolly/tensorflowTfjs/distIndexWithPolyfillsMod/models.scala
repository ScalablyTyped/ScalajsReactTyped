package typingsJapgolly.tensorflowTfjs.distIndexWithPolyfillsMod

import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.ModelAndWeightsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "models")
  @js.native
  val ^ : js.Any = js.native
  
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
}
