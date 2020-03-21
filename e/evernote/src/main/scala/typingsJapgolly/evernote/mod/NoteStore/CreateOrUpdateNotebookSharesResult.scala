package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonMatchingShares
import typingsJapgolly.evernote.mod.Types.SharedNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.CreateOrUpdateNotebookSharesResult")
@js.native
class CreateOrUpdateNotebookSharesResult () extends js.Object {
  def this(args: AnonMatchingShares) = this()
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

