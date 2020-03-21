package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonJoined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.UserProfile")
@js.native
class UserProfile () extends js.Object {
  def this(args: AnonJoined) = this()
  var attributes: js.UndefOr[BusinessUserAttributes] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[UserID] = js.native
  var joined: js.UndefOr[Timestamp] = js.native
  var name: js.UndefOr[String] = js.native
  var photoLastUpdated: js.UndefOr[Timestamp] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var username: js.UndefOr[String] = js.native
}

