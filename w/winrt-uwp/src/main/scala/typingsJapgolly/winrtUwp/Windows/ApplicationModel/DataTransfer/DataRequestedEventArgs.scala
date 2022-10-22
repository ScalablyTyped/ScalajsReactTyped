package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the DataRequested event. The system fires this event when the user invokes the Share UI. */
trait DataRequestedEventArgs extends StObject {
  
  /** Enables you to get the DataRequest object and either give it data or a failure message. */
  var request: DataRequest
}
object DataRequestedEventArgs {
  
  inline def apply(request: DataRequest): DataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequestedEventArgs]
  }
  
  extension [Self <: DataRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: DataRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
