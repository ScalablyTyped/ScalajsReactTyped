package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.NotebookCounts
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteCollectionCounts")
@js.native
open class NoteCollectionCounts () extends StObject {
  def this(args: NotebookCounts) = this()
  
  var notebookCounts: js.UndefOr[Record[Guid, Double]] = js.native
  
  var tagCounts: js.UndefOr[Record[Guid, Double]] = js.native
  
  var trashCount: js.UndefOr[Double] = js.native
}
