package typingsJapgolly.winrtUwp.Windows.Media.Playback

import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for MediaFailed events. */
trait MediaPlayerFailedEventArgs extends StObject {
  
  /** Gets the MediaPlayerError value for the error that triggered the event. */
  var error: MediaPlayerError
  
  /** Gets a string describing the error that occurred. */
  var errorMessage: String
  
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  var extendedErrorCode: WinRTError
}
object MediaPlayerFailedEventArgs {
  
  inline def apply(error: MediaPlayerError, errorMessage: String, extendedErrorCode: WinRTError): MediaPlayerFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerFailedEventArgs]
  }
  
  extension [Self <: MediaPlayerFailedEventArgs](x: Self) {
    
    inline def setError(value: MediaPlayerError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setExtendedErrorCode(value: WinRTError): Self = StObject.set(x, "extendedErrorCode", value.asInstanceOf[js.Any])
  }
}
