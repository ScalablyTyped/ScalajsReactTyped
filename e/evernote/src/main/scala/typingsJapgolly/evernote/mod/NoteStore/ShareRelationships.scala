package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.Invitations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ShareRelationships")
@js.native
open class ShareRelationships () extends StObject {
  def this(args: Invitations) = this()
  
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
}
