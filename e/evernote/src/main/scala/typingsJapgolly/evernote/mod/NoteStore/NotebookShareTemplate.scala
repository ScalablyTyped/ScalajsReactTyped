package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonNotebookGuid
import typingsJapgolly.evernote.mod.Types.Contact
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.MessageThreadID
import typingsJapgolly.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NotebookShareTemplate")
@js.native
class NotebookShareTemplate () extends js.Object {
  def this(args: AnonNotebookGuid) = this()
  var notebookGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}

