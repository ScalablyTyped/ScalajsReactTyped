package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonChunkHighUSN
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.LinkedNotebook
import typingsJapgolly.evernote.mod.Types.Note
import typingsJapgolly.evernote.mod.Types.Notebook
import typingsJapgolly.evernote.mod.Types.Resource
import typingsJapgolly.evernote.mod.Types.SavedSearch
import typingsJapgolly.evernote.mod.Types.Tag
import typingsJapgolly.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.SyncChunk")
@js.native
class SyncChunk () extends js.Object {
  def this(args: AnonChunkHighUSN) = this()
  var chunkHighUSN: js.UndefOr[Double] = js.native
  var currentTime: js.UndefOr[Timestamp] = js.native
  var expungedLinkedNotebooks: js.UndefOr[js.Array[Guid]] = js.native
  var expungedNotebooks: js.UndefOr[js.Array[Guid]] = js.native
  var expungedNotes: js.UndefOr[js.Array[Guid]] = js.native
  var expungedSearches: js.UndefOr[js.Array[Guid]] = js.native
  var expungedTags: js.UndefOr[js.Array[Guid]] = js.native
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.native
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  var notes: js.UndefOr[js.Array[Note]] = js.native
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  var updateCount: js.UndefOr[Double] = js.native
}

