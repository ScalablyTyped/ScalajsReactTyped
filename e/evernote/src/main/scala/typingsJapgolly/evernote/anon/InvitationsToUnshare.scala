package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typingsJapgolly.evernote.mod.NoteStore.NoteMemberShareRelationship
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvitationsToUnshare extends StObject {
  
  var invitationsToUnshare: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.IdentityID]] = js.undefined
  
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.undefined
  
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.undefined
  
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.undefined
  
  var noteGuid: js.UndefOr[String] = js.undefined
}
object InvitationsToUnshare {
  
  inline def apply(): InvitationsToUnshare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToUnshare]
  }
  
  extension [Self <: InvitationsToUnshare](x: Self) {
    
    inline def setInvitationsToUnshare(value: js.Array[typingsJapgolly.evernote.mod.Types.IdentityID]): Self = StObject.set(x, "invitationsToUnshare", value.asInstanceOf[js.Any])
    
    inline def setInvitationsToUnshareUndefined: Self = StObject.set(x, "invitationsToUnshare", js.undefined)
    
    inline def setInvitationsToUnshareVarargs(value: typingsJapgolly.evernote.mod.Types.IdentityID*): Self = StObject.set(x, "invitationsToUnshare", js.Array(value*))
    
    inline def setInvitationsToUpdate(value: js.Array[NoteInvitationShareRelationship]): Self = StObject.set(x, "invitationsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setInvitationsToUpdateUndefined: Self = StObject.set(x, "invitationsToUpdate", js.undefined)
    
    inline def setInvitationsToUpdateVarargs(value: NoteInvitationShareRelationship*): Self = StObject.set(x, "invitationsToUpdate", js.Array(value*))
    
    inline def setMembershipsToUnshare(value: js.Array[UserID]): Self = StObject.set(x, "membershipsToUnshare", value.asInstanceOf[js.Any])
    
    inline def setMembershipsToUnshareUndefined: Self = StObject.set(x, "membershipsToUnshare", js.undefined)
    
    inline def setMembershipsToUnshareVarargs(value: UserID*): Self = StObject.set(x, "membershipsToUnshare", js.Array(value*))
    
    inline def setMembershipsToUpdate(value: js.Array[NoteMemberShareRelationship]): Self = StObject.set(x, "membershipsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setMembershipsToUpdateUndefined: Self = StObject.set(x, "membershipsToUpdate", js.undefined)
    
    inline def setMembershipsToUpdateVarargs(value: NoteMemberShareRelationship*): Self = StObject.set(x, "membershipsToUpdate", js.Array(value*))
    
    inline def setNoteGuid(value: String): Self = StObject.set(x, "noteGuid", value.asInstanceOf[js.Any])
    
    inline def setNoteGuidUndefined: Self = StObject.set(x, "noteGuid", js.undefined)
  }
}
