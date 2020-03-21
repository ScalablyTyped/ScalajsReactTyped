package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonAscending
import typingsJapgolly.evernote.mod.Types.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteFilter")
@js.native
class NoteFilter () extends js.Object {
  def this(args: AnonAscending) = this()
  var ascending: Boolean = js.native
  var emphasized: String = js.native
  var inactive: Boolean = js.native
  var includeAllReadableNotebooks: Boolean = js.native
  var notebookGuid: Guid = js.native
  var order: Double = js.native
  var tagGuids: js.Array[Guid] = js.native
  var timeZone: String = js.native
  var words: String = js.native
}

