package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typingsJapgolly.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.SupportedModels
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short
import typingsJapgolly.tensorflowTfjsConverter.mod.GraphModel
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow-models/face-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-detection", "MediaPipeFaceDetectorMediaPipe")
  @js.native
  open class MediaPipeFaceDetectorMediaPipe protected ()
    extends typingsJapgolly.tensorflowModelsFaceDetection.distMediapipeDetectorMod.MediaPipeFaceDetectorMediaPipe {
    def this(config: MediaPipeFaceDetectorMediaPipeModelConfig) = this()
  }
  
  @JSImport("@tensorflow-models/face-detection", "MediaPipeFaceDetectorTfjs")
  @js.native
  open class MediaPipeFaceDetectorTfjs protected ()
    extends typingsJapgolly.tensorflowModelsFaceDetection.distTfjsDetectorMod.MediaPipeFaceDetectorTfjs {
    def this(detectorModelType: short | full, detectorModel: GraphModel[String | IOHandler], maxFaces: Double) = this()
  }
  
  @JSImport("@tensorflow-models/face-detection", "SupportedModels")
  @js.native
  object SupportedModels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.SupportedModels & String
      ] = js.native
    
    /* "MediaPipeFaceDetector" */ val MediaPipeFaceDetector: typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.SupportedModels.MediaPipeFaceDetector & String = js.native
  }
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorTfjsModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
}
