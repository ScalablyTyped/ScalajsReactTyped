package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred with a MediaSource . */
trait MediaSourceError extends StObject {
  
  /** Gets the extended error code for the MediaSourceError . */
  var extendedError: WinRTError
}
object MediaSourceError {
  
  inline def apply(extendedError: WinRTError): MediaSourceError = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceError]
  }
  
  extension [Self <: MediaSourceError](x: Self) {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
  }
}
