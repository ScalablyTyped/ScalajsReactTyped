package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.Notes
import typingsJapgolly.evernote.mod.Types.Note
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteList")
@js.native
open class NoteList () extends StObject {
  def this(args: Notes) = this()
  
  var notes: js.UndefOr[js.Array[Note]] = js.native
  
  var searchedWords: js.UndefOr[js.Array[String]] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var stoppedWords: js.UndefOr[js.Array[String]] = js.native
  
  var totalNotes: js.UndefOr[Double] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
}
