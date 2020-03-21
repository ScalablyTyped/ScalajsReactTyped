package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The Amazon QuickSight user.
    */
  var User: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.User] = js.native
}

object UpdateUserResponse {
  @scala.inline
  def apply(RequestId: String = null, Status: Int | scala.Double = null, User: User = null): UpdateUserResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

