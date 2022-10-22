package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.EstimationConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.ModelConfig
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.mediapipe
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.tfjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeTypesMod {
  
  type MediaPipeFaceDetectorEstimationConfig = EstimationConfig
  
  type MediaPipeFaceDetectorMediaPipeEstimationConfig = MediaPipeFaceDetectorEstimationConfig
  
  trait MediaPipeFaceDetectorMediaPipeModelConfig
    extends StObject
       with MediaPipeFaceDetectorModelConfig {
    
    @JSName("runtime")
    var runtime_MediaPipeFaceDetectorMediaPipeModelConfig: mediapipe
    
    var solutionPath: js.UndefOr[String] = js.undefined
  }
  object MediaPipeFaceDetectorMediaPipeModelConfig {
    
    inline def apply(): MediaPipeFaceDetectorMediaPipeModelConfig = {
      val __obj = js.Dynamic.literal(runtime = "mediapipe")
      __obj.asInstanceOf[MediaPipeFaceDetectorMediaPipeModelConfig]
    }
    
    extension [Self <: MediaPipeFaceDetectorMediaPipeModelConfig](x: Self) {
      
      inline def setRuntime(value: mediapipe): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSolutionPath(value: String): Self = StObject.set(x, "solutionPath", value.asInstanceOf[js.Any])
      
      inline def setSolutionPathUndefined: Self = StObject.set(x, "solutionPath", js.undefined)
    }
  }
  
  trait MediaPipeFaceDetectorModelConfig
    extends StObject
       with ModelConfig {
    
    var modelType: js.UndefOr[MediaPipeFaceDetectorModelType] = js.undefined
    
    var runtime: mediapipe | tfjs
  }
  object MediaPipeFaceDetectorModelConfig {
    
    inline def apply(runtime: mediapipe | tfjs): MediaPipeFaceDetectorModelConfig = {
      val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaPipeFaceDetectorModelConfig]
    }
    
    extension [Self <: MediaPipeFaceDetectorModelConfig](x: Self) {
      
      inline def setModelType(value: MediaPipeFaceDetectorModelType): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
      
      inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
      
      inline def setRuntime(value: mediapipe | tfjs): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short
    - typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full
  */
  trait MediaPipeFaceDetectorModelType extends StObject
  object MediaPipeFaceDetectorModelType {
    
    inline def full: typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full = "full".asInstanceOf[typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full]
    
    inline def short: typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short = "short".asInstanceOf[typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short]
  }
}
