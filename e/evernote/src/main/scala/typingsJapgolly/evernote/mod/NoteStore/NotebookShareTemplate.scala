package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.NotebookGuid
import typingsJapgolly.evernote.mod.Types.Contact
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.MessageThreadID
import typingsJapgolly.evernote.mod.Types.SharedNotebookPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NotebookShareTemplate")
@js.native
open class NotebookShareTemplate () extends StObject {
  def this(args: NotebookGuid) = this()
  
  var notebookGuid: js.UndefOr[Guid] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}
