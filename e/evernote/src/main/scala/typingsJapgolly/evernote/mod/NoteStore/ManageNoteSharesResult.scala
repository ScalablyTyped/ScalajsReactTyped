package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesResult")
@js.native
open class ManageNoteSharesResult () extends StObject {
  def this(args: Errors) = this()
  
  var errors: js.UndefOr[js.Array[ManageNoteSharesError]] = js.native
}
