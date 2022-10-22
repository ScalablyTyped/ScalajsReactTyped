package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsDetectorResultMod {
  
  trait detectorResult extends StObject {
    
    var boxes: Tensor2D
    
    var logits: Tensor1D
  }
  object detectorResult {
    
    @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/detector_result", "detectorResult")
    @js.native
    def apply(detectionResult: Tensor3D): detectorResult = js.native
    
    extension [Self <: detectorResult](x: Self) {
      
      inline def setBoxes(value: Tensor2D): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
      
      inline def setLogits(value: Tensor1D): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    }
  }
}
