package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.CcAddresses
import typingsJapgolly.evernote.mod.Types.Note
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteEmailParameters")
@js.native
open class NoteEmailParameters () extends StObject {
  def this(args: CcAddresses) = this()
  
  var ccAddresses: js.UndefOr[js.Array[String]] = js.native
  
  var guid: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var note: js.UndefOr[Note] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var toAddresses: js.UndefOr[js.Array[String]] = js.native
}
