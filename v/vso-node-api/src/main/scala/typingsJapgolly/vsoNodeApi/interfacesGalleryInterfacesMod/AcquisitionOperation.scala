package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquisitionOperation extends StObject {
  
  /**
    * State of the the AcquisitionOperation for the current user
    */
  var operationState: AcquisitionOperationState
  
  /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
  var operationType: AcquisitionOperationType
  
  /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
  var reason: String
}
object AcquisitionOperation {
  
  inline def apply(operationState: AcquisitionOperationState, operationType: AcquisitionOperationType, reason: String): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperation]
  }
  
  extension [Self <: AcquisitionOperation](x: Self) {
    
    inline def setOperationState(value: AcquisitionOperationState): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: AcquisitionOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
