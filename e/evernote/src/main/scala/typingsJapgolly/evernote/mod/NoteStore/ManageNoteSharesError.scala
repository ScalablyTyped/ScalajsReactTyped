package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.AnonIdentityID
import typingsJapgolly.evernote.mod.Errors.EDAMNotFoundException
import typingsJapgolly.evernote.mod.Errors.EDAMUserException
import typingsJapgolly.evernote.mod.Types.IdentityID
import typingsJapgolly.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNoteSharesError")
@js.native
class ManageNoteSharesError () extends js.Object {
  def this(args: AnonIdentityID) = this()
  var identityID: js.UndefOr[IdentityID] = js.native
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userID: js.UndefOr[UserID] = js.native
}

