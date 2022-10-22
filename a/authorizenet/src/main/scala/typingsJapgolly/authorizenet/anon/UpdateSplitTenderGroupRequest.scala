package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSplitTenderGroupRequest extends StObject {
  
  var updateSplitTenderGroupRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest
}
object UpdateSplitTenderGroupRequest {
  
  inline def apply(
    updateSplitTenderGroupRequest: typingsJapgolly.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest
  ): UpdateSplitTenderGroupRequest = {
    val __obj = js.Dynamic.literal(updateSplitTenderGroupRequest = updateSplitTenderGroupRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSplitTenderGroupRequest]
  }
  
  extension [Self <: UpdateSplitTenderGroupRequest](x: Self) {
    
    inline def setUpdateSplitTenderGroupRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest): Self = StObject.set(x, "updateSplitTenderGroupRequest", value.asInstanceOf[js.Any])
  }
}
