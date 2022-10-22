package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSecurityKeyResponse extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.AssociationId] = js.undefined
}
object AssociateSecurityKeyResponse {
  
  inline def apply(): AssociateSecurityKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSecurityKeyResponse]
  }
  
  extension [Self <: AssociateSecurityKeyResponse](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
  }
}
