package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrustRequest extends StObject {
  
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[
    typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DeleteAssociatedConditionalForwarder
  ] = js.undefined
  
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.TrustId
}
object DeleteTrustRequest {
  
  inline def apply(TrustId: TrustId): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
  
  extension [Self <: DeleteTrustRequest](x: Self) {
    
    inline def setDeleteAssociatedConditionalForwarder(value: DeleteAssociatedConditionalForwarder): Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", value.asInstanceOf[js.Any])
    
    inline def setDeleteAssociatedConditionalForwarderUndefined: Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
