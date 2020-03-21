package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonBlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.Identity")
@js.native
class Identity () extends js.Object {
  def this(args: AnonBlocked) = this()
  var blocked: js.UndefOr[Boolean] = js.native
  var contact: js.UndefOr[Contact] = js.native
  var deactivated: js.UndefOr[Boolean] = js.native
  var eventId: js.UndefOr[MessageEventID] = js.native
  var id: js.UndefOr[IdentityID] = js.native
  var sameBusiness: js.UndefOr[Boolean] = js.native
  var userConnected: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[UserID] = js.native
}

