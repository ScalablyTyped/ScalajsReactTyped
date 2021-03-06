package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonPrivilege
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsJapgolly.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.MemberShareRelationship")
@js.native
class MemberShareRelationship () extends js.Object {
  def this(args: AnonPrivilege) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientUserId: js.UndefOr[UserID] = js.native
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

