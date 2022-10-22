package typingsJapgolly.mediapipeFaceDetection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mediapipe/face_detection", "FaceDetection")
  @js.native
  open class FaceDetection ()
    extends StObject
       with FaceDetectionInterface {
    def this(config: FaceDetectionConfig) = this()
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def initialize(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def onResults(listener: ResultsListener): Unit = js.native
    
    /**
      * Tells the graph to restart before the next frame is sent.
      */
    def reset(): Unit = js.native
    
    /* CompleteClass */
    override def send(inputs: InputMap): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setOptions(options: Options): Unit = js.native
  }
  
  @JSImport("@mediapipe/face_detection", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  trait Detection extends StObject {
    
    var boundingBox: NormalizedRect
    
    var landmarks: NormalizedLandmarkList
  }
  object Detection {
    
    inline def apply(boundingBox: NormalizedRect, landmarks: NormalizedLandmarkList): Detection = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], landmarks = landmarks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detection]
    }
    
    extension [Self <: Detection](x: Self) {
      
      inline def setBoundingBox(value: NormalizedRect): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setLandmarks(value: NormalizedLandmarkList): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
      
      inline def setLandmarksVarargs(value: NormalizedLandmark*): Self = StObject.set(x, "landmarks", js.Array(value*))
    }
  }
  
  type DetectionList = js.Array[Detection]
  
  trait FaceDetectionConfig extends StObject {
    
    var locateFile: js.UndefOr[js.Function2[/* path */ String, /* prefix */ js.UndefOr[String], String]] = js.undefined
  }
  object FaceDetectionConfig {
    
    inline def apply(): FaceDetectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceDetectionConfig]
    }
    
    extension [Self <: FaceDetectionConfig](x: Self) {
      
      inline def setLocateFile(value: (/* path */ String, /* prefix */ js.UndefOr[String]) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
    }
  }
  
  /**
    * Declares the interface of FaceDetection.
    */
  trait FaceDetectionInterface extends StObject {
    
    def close(): js.Promise[Unit]
    
    def initialize(): js.Promise[Unit]
    
    def onResults(listener: ResultsListener): Unit
    
    def send(inputs: InputMap): js.Promise[Unit]
    
    def setOptions(options: Options): Unit
  }
  object FaceDetectionInterface {
    
    inline def apply(
      close: CallbackTo[js.Promise[Unit]],
      initialize: CallbackTo[js.Promise[Unit]],
      onResults: ResultsListener => Callback,
      send: InputMap => js.Promise[Unit],
      setOptions: Options => Callback
    ): FaceDetectionInterface = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, initialize = initialize.toJsFn, onResults = js.Any.fromFunction1((t0: ResultsListener) => onResults(t0).runNow()), send = js.Any.fromFunction1(send), setOptions = js.Any.fromFunction1((t0: Options) => setOptions(t0).runNow()))
      __obj.asInstanceOf[FaceDetectionInterface]
    }
    
    extension [Self <: FaceDetectionInterface](x: Self) {
      
      inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setInitialize(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "initialize", value.toJsFn)
      
      inline def setOnResults(value: ResultsListener => Callback): Self = StObject.set(x, "onResults", js.Any.fromFunction1((t0: ResultsListener) => value(t0).runNow()))
      
      inline def setSend(value: InputMap => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSetOptions(value: Options => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
    }
  }
  
  /**
    * GpuBuffers should all be compatible with Canvas' `drawImage`
    */
  type GpuBuffer = HTMLCanvasElement | HTMLImageElement | ImageBitmap
  
  type InputImage = HTMLVideoElement | HTMLImageElement | HTMLCanvasElement
  
  trait InputMap extends StObject {
    
    var image: InputImage
  }
  object InputMap {
    
    inline def apply(image: InputImage): InputMap = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMap]
    }
    
    extension [Self <: InputMap](x: Self) {
      
      inline def setImage(value: InputImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  type LandmarkConnectionArray = js.Array[js.Tuple2[Double, Double]]
  
  trait NormalizedLandmark extends StObject {
    
    var visibility: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object NormalizedLandmark {
    
    inline def apply(x: Double, y: Double, z: Double): NormalizedLandmark = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedLandmark]
    }
    
    extension [Self <: NormalizedLandmark](x: Self) {
      
      inline def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedLandmarkList = js.Array[NormalizedLandmark]
  
  type NormalizedLandmarkListList = js.Array[NormalizedLandmarkList]
  
  trait NormalizedRect extends StObject {
    
    var height: Double
    
    var rectId: Double
    
    var rotation: Double
    
    var width: Double
    
    var xCenter: Double
    
    var yCenter: Double
  }
  object NormalizedRect {
    
    inline def apply(height: Double, rectId: Double, rotation: Double, width: Double, xCenter: Double, yCenter: Double): NormalizedRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rectId = rectId.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xCenter = xCenter.asInstanceOf[js.Any], yCenter = yCenter.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedRect]
    }
    
    extension [Self <: NormalizedRect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRectId(value: Double): Self = StObject.set(x, "rectId", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXCenter(value: Double): Self = StObject.set(x, "xCenter", value.asInstanceOf[js.Any])
      
      inline def setYCenter(value: Double): Self = StObject.set(x, "yCenter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var minDetectionConfidence: js.UndefOr[Double] = js.undefined
    
    var model: js.UndefOr[String] = js.undefined
    
    var selfieMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMinDetectionConfidence(value: Double): Self = StObject.set(x, "minDetectionConfidence", value.asInstanceOf[js.Any])
      
      inline def setMinDetectionConfidenceUndefined: Self = StObject.set(x, "minDetectionConfidence", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelfieMode(value: Boolean): Self = StObject.set(x, "selfieMode", value.asInstanceOf[js.Any])
      
      inline def setSelfieModeUndefined: Self = StObject.set(x, "selfieMode", js.undefined)
    }
  }
  
  trait Results extends StObject {
    
    var detections: DetectionList
    
    var image: GpuBuffer
  }
  object Results {
    
    inline def apply(detections: DetectionList, image: GpuBuffer): Results = {
      val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setDetections(value: DetectionList): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
      
      inline def setDetectionsVarargs(value: Detection*): Self = StObject.set(x, "detections", js.Array(value*))
      
      inline def setImage(value: GpuBuffer): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
  
  type ResultsListener = js.Function1[/* results */ Results, js.Promise[Unit] | Unit]
}
