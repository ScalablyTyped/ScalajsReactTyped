package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditLineItemAssignedTargetingOptionsResponse extends StObject {
  
  /** The list of assigned targeting options that have been successfully created. This list will be absent if empty. */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.undefined
}
object BulkEditLineItemAssignedTargetingOptionsResponse {
  
  inline def apply(): BulkEditLineItemAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditLineItemAssignedTargetingOptionsResponse]
  }
  
  extension [Self <: BulkEditLineItemAssignedTargetingOptionsResponse](x: Self) {
    
    inline def setCreatedAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedTargetingOptionsUndefined: Self = StObject.set(x, "createdAssignedTargetingOptions", js.undefined)
    
    inline def setCreatedAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "createdAssignedTargetingOptions", js.Array(value*))
  }
}
