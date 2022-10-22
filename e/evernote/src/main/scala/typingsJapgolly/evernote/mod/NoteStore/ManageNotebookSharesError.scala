package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.NotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMUserException
import typingsJapgolly.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNotebookSharesError")
@js.native
open class ManageNotebookSharesError () extends StObject {
  def this(args: NotFoundException) = this()
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}
