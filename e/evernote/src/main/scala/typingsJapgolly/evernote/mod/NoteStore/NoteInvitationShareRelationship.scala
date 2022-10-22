package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.RecipientIdentityId
import typingsJapgolly.evernote.mod.Types.IdentityID
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteInvitationShareRelationship")
@js.native
open class NoteInvitationShareRelationship () extends StObject {
  def this(args: RecipientIdentityId) = this()
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
