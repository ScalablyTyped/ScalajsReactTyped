package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonInvitationsToCreateOrUpdate
import typingsJapgolly.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNotebookSharesParameters")
@js.native
class ManageNotebookSharesParameters () extends js.Object {
  def this(args: AnonInvitationsToCreateOrUpdate) = this()
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  var inviteMessage: js.UndefOr[String] = js.native
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.native
}

