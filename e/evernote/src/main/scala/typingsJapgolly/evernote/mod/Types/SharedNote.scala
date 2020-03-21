package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonRecipientIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.SharedNote")
@js.native
class SharedNote () extends js.Object {
  def this(args: AnonRecipientIdentity) = this()
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentity: js.UndefOr[Identity] = js.native
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  var sharerUserID: js.UndefOr[UserID] = js.native
}

