package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonInvitationRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteShareRelationships")
@js.native
class NoteShareRelationships () extends js.Object {
  def this(args: AnonInvitationRestrictions) = this()
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
}

