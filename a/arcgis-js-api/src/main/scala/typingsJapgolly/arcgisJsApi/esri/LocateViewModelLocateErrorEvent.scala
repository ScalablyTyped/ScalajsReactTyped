package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateViewModelLocateErrorEvent extends StObject {
  
  var error: Error
}
object LocateViewModelLocateErrorEvent {
  
  inline def apply(error: Error): LocateViewModelLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateViewModelLocateErrorEvent]
  }
  
  extension [Self <: LocateViewModelLocateErrorEvent](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
