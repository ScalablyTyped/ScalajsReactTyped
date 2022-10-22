package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsRequest extends StObject {
  
  /**
    * A list of account IDs of the Amazon Web Services accounts that sent invitations to the current member account that you want to decline invitations from.
    */
  var AccountIds: typingsJapgolly.awsSdk.clientsGuarddutyMod.AccountIds
}
object DeclineInvitationsRequest {
  
  inline def apply(AccountIds: AccountIds): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  
  extension [Self <: DeclineInvitationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
