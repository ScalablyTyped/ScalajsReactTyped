package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelClassResponse extends js.Object {
  var Channel: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.Channel] = js.native
}

object UpdateChannelClassResponse {
  @scala.inline
  def apply(Channel: Channel = null): UpdateChannelClassResponse = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassResponse]
  }
}

