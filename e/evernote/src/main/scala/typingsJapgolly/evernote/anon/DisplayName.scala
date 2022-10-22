package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typingsJapgolly.evernote.mod.Types.UserID
import typingsJapgolly.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.undefined
  
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.undefined
  
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}
object DisplayName {
  
  inline def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  
  extension [Self <: DisplayName](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPrivilege(value: ShareRelationshipPrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    inline def setRecipientUserIdentity(value: UserIdentity): Self = StObject.set(x, "recipientUserIdentity", value.asInstanceOf[js.Any])
    
    inline def setRecipientUserIdentityUndefined: Self = StObject.set(x, "recipientUserIdentity", js.undefined)
    
    inline def setSharerUserId(value: UserID): Self = StObject.set(x, "sharerUserId", value.asInstanceOf[js.Any])
    
    inline def setSharerUserIdUndefined: Self = StObject.set(x, "sharerUserId", js.undefined)
  }
}
