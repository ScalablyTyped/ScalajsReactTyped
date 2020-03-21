package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneMessage extends js.Object {
  /**
    * The message about the Availability Zone or Local Zone.
    */
  var Message: js.UndefOr[String] = js.native
}

object AvailabilityZoneMessage {
  @scala.inline
  def apply(Message: String = null): AvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZoneMessage]
  }
}

