package typingsJapgolly.tensorflowModelsFaceDetection

import typingsJapgolly.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typingsJapgolly.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typingsJapgolly.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typingsJapgolly.tensorflowModelsFaceDetection.distTypesMod.FaceDetectorInput
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full
import typingsJapgolly.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short
import typingsJapgolly.tensorflowTfjsConverter.mod.GraphModel
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTfjsDetectorMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/detector", "MediaPipeFaceDetectorTfjs")
  @js.native
  open class MediaPipeFaceDetectorTfjs protected ()
    extends StObject
       with FaceDetector {
    def this(detectorModelType: short | full, detectorModel: GraphModel[String | IOHandler], maxFaces: Double) = this()
    
    /* private */ val anchorTensor: Any = js.native
    
    /* private */ val anchors: Any = js.native
    
    def detectFaces(image: FaceDetectorInput): js.Promise[js.Array[Detection]] = js.native
    def detectFaces(image: FaceDetectorInput, flipHorizontal: Boolean): js.Promise[js.Array[Detection]] = js.native
    
    /* private */ val detectorModel: Any = js.native
    
    /* private */ val imageToTensorConfig: Any = js.native
    
    /* private */ val maxFaces: Any = js.native
    
    /* private */ val tensorsToDetectionConfig: Any = js.native
  }
  
  inline def load(modelConfig: MediaPipeFaceDetectorTfjsModelConfig): js.Promise[MediaPipeFaceDetectorTfjs] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaPipeFaceDetectorTfjs]]
}
