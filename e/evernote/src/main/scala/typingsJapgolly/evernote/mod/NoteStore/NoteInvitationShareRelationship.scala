package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonRecipientIdentityId
import typingsJapgolly.evernote.mod.Types.IdentityID
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsJapgolly.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteInvitationShareRelationship")
@js.native
class NoteInvitationShareRelationship () extends js.Object {
  def this(args: AnonRecipientIdentityId) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

