package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.NoteGuid
import typingsJapgolly.evernote.mod.Types.Contact
import typingsJapgolly.evernote.mod.Types.Guid
import typingsJapgolly.evernote.mod.Types.MessageThreadID
import typingsJapgolly.evernote.mod.Types.SharedNotePrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.SharedNoteTemplate")
@js.native
open class SharedNoteTemplate () extends StObject {
  def this(args: NoteGuid) = this()
  
  var noteGuid: js.UndefOr[Guid] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}
