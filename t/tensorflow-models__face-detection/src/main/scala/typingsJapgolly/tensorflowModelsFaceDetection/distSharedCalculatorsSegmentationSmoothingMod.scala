package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.SegmentationSmoothingConfig
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsSegmentationSmoothingMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/segmentation_smoothing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def smoothSegmentation(prevMask: Tensor2D, newMask: Tensor2D, config: SegmentationSmoothingConfig): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothSegmentation")(prevMask.asInstanceOf[js.Any], newMask.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}
