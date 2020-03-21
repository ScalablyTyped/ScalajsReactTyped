package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkProfileResponse extends js.Object {
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
}

object CreateNetworkProfileResponse {
  @scala.inline
  def apply(NetworkProfileArn: Arn = null): CreateNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkProfileResponse]
  }
}

