package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.DisplayName
import typingsJapgolly.evernote.mod.Types.UserID
import typingsJapgolly.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.InvitationShareRelationship")
@js.native
open class InvitationShareRelationship () extends StObject {
  def this(args: DisplayName) = this()
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.native
  
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
