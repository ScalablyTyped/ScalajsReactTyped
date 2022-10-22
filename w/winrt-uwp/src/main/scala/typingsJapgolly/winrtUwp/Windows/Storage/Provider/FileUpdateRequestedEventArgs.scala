package typingsJapgolly.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a FileUpdateRequested event. */
trait FileUpdateRequestedEventArgs extends StObject {
  
  /** Gets the details of the requested file update. */
  var request: FileUpdateRequest
}
object FileUpdateRequestedEventArgs {
  
  inline def apply(request: FileUpdateRequest): FileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpdateRequestedEventArgs]
  }
  
  extension [Self <: FileUpdateRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: FileUpdateRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
