package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonBusinessId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.BusinessInvitation")
@js.native
class BusinessInvitation () extends js.Object {
  def this(args: AnonBusinessId) = this()
  var businessId: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var email: js.UndefOr[String] = js.native
  var fromWorkChat: js.UndefOr[Boolean] = js.native
  var requesterId: js.UndefOr[UserID] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var status: js.UndefOr[BusinessInvitationStatus] = js.native
}

