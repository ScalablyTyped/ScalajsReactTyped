package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutGeofenceError extends StObject {
  
  /**
    * Contains details associated to the batch error.
    */
  var Error: BatchItemError
  
  /**
    * The geofence associated with the error message.
    */
  var GeofenceId: Id
}
object BatchPutGeofenceError {
  
  inline def apply(Error: BatchItemError, GeofenceId: Id): BatchPutGeofenceError = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutGeofenceError]
  }
  
  extension [Self <: BatchPutGeofenceError](x: Self) {
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
  }
}
