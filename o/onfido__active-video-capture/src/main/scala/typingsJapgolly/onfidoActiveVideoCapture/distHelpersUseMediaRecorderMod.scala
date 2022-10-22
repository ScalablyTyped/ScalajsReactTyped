package typingsJapgolly.onfidoActiveVideoCapture

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseMediaRecorderMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useMediaRecorder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMediaRecorder(): MediaRecorderHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaRecorder")().asInstanceOf[MediaRecorderHook]
  inline def useMediaRecorder(stream: MediaStream): MediaRecorderHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaRecorder")(stream.asInstanceOf[js.Any]).asInstanceOf[MediaRecorderHook]
  
  trait MediaRecorderHook extends StObject {
    
    def startCapture(): Unit
    
    def stopCapture(): js.Promise[Blob | Null]
  }
  object MediaRecorderHook {
    
    inline def apply(startCapture: Callback, stopCapture: CallbackTo[js.Promise[Blob | Null]]): MediaRecorderHook = {
      val __obj = js.Dynamic.literal(startCapture = startCapture.toJsFn, stopCapture = stopCapture.toJsFn)
      __obj.asInstanceOf[MediaRecorderHook]
    }
    
    extension [Self <: MediaRecorderHook](x: Self) {
      
      inline def setStartCapture(value: Callback): Self = StObject.set(x, "startCapture", value.toJsFn)
      
      inline def setStopCapture(value: CallbackTo[js.Promise[Blob | Null]]): Self = StObject.set(x, "stopCapture", value.toJsFn)
    }
  }
}
