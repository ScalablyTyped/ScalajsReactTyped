package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.IdentityID
import typingsJapgolly.evernote.mod.Errors.EDAMNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMUserException
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesError")
@js.native
open class ManageNoteSharesError () extends StObject {
  def this(args: IdentityID) = this()
  
  var identityID: js.UndefOr[typingsJapgolly.evernote.mod.Types.IdentityID] = js.native
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userID: js.UndefOr[UserID] = js.native
}
