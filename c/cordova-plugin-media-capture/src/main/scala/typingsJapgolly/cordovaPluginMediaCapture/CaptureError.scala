package typingsJapgolly.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the error code resulting from a failed media capture operation. */
trait CaptureError extends StObject {
  
  /**
    * One of the pre-defined error codes listed below.
    *     CaptureError.CAPTURE_INTERNAL_ERR
    *         The camera or microphone failed to capture image or sound.
    *     CaptureError.CAPTURE_APPLICATION_BUSY
    *         The camera or audio capture application is currently serving another capture request.
    *     CaptureError.CAPTURE_INVALID_ARGUMENT
    *         Invalid use of the API (e.g., the value of limit is less than one).
    *     CaptureError.CAPTURE_NO_MEDIA_FILES
    *         The user exits the camera or audio capture application before capturing anything.
    *     CaptureError.CAPTURE_NOT_SUPPORTED
    *         The requested capture operation is not supported.
    */
  var code: Double
  
  var message: String
}
object CaptureError {
  
  inline def apply(code: Double, message: String): CaptureError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureError]
  }
  
  extension [Self <: CaptureError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
