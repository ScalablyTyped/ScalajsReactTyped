package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMUserException
import typingsJapgolly.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNotebookSharesError")
@js.native
class ManageNotebookSharesError () extends js.Object {
  def this(args: AnonNotFoundException) = this()
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

