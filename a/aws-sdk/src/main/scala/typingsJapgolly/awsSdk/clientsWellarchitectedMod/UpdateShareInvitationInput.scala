package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShareInvitationInput extends StObject {
  
  var ShareInvitationAction: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareInvitationAction
  
  /**
    * The ID assigned to the share invitation.
    */
  var ShareInvitationId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareInvitationId
}
object UpdateShareInvitationInput {
  
  inline def apply(ShareInvitationAction: ShareInvitationAction, ShareInvitationId: ShareInvitationId): UpdateShareInvitationInput = {
    val __obj = js.Dynamic.literal(ShareInvitationAction = ShareInvitationAction.asInstanceOf[js.Any], ShareInvitationId = ShareInvitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShareInvitationInput]
  }
  
  extension [Self <: UpdateShareInvitationInput](x: Self) {
    
    inline def setShareInvitationAction(value: ShareInvitationAction): Self = StObject.set(x, "ShareInvitationAction", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationId(value: ShareInvitationId): Self = StObject.set(x, "ShareInvitationId", value.asInstanceOf[js.Any])
  }
}
