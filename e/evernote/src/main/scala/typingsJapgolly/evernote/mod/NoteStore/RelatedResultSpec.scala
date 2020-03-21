package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonIncludeContainingNotebooks
import typingsJapgolly.evernote.mod.Types.RelatedContentType
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.RelatedResultSpec")
@js.native
class RelatedResultSpec () extends js.Object {
  def this(args: AnonIncludeContainingNotebooks) = this()
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  var maxExperts: js.UndefOr[Double] = js.native
  var maxNotebooks: js.UndefOr[Double] = js.native
  var maxNotes: js.UndefOr[Double] = js.native
  var maxRelatedContent: js.UndefOr[Double] = js.native
  var maxTags: js.UndefOr[Double] = js.native
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}

