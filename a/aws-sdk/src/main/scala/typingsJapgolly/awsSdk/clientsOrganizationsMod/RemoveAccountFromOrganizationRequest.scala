package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAccountFromOrganizationRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the member account that you want to remove from the organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsOrganizationsMod.AccountId
}
object RemoveAccountFromOrganizationRequest {
  
  inline def apply(AccountId: AccountId): RemoveAccountFromOrganizationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAccountFromOrganizationRequest]
  }
  
  extension [Self <: RemoveAccountFromOrganizationRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
