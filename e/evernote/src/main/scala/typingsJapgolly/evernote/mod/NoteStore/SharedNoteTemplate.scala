package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonNoteGuid
import typingsJapgolly.evernote.mod.Types.Contact
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.MessageThreadID
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.SharedNoteTemplate")
@js.native
class SharedNoteTemplate () extends js.Object {
  def this(args: AnonNoteGuid) = this()
  var noteGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}

