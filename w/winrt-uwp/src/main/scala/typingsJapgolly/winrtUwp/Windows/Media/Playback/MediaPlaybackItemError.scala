package typingsJapgolly.winrtUwp.Windows.Media.Playback

import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
trait MediaPlaybackItemError extends StObject {
  
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode
  
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError
}
object MediaPlaybackItemError {
  
  inline def apply(errorCode: MediaPlaybackItemErrorCode, extendedError: WinRTError): MediaPlaybackItemError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemError]
  }
  
  extension [Self <: MediaPlaybackItemError](x: Self) {
    
    inline def setErrorCode(value: MediaPlaybackItemErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
  }
}
