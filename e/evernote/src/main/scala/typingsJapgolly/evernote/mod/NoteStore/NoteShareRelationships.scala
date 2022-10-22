package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.InvitationRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteShareRelationships")
@js.native
open class NoteShareRelationships () extends StObject {
  def this(args: InvitationRestrictions) = this()
  
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
}
