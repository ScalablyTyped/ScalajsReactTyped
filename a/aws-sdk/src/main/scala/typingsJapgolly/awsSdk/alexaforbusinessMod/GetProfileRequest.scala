package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileRequest extends js.Object {
  /**
    * The ARN of the room profile for which to request details. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}

object GetProfileRequest {
  @scala.inline
  def apply(ProfileArn: Arn = null): GetProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileRequest]
  }
}

