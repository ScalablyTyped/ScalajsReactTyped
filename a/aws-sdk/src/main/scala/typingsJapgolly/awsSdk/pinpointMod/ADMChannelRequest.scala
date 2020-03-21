package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: string = js.native
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: string = js.native
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object ADMChannelRequest {
  @scala.inline
  def apply(ClientId: string, ClientSecret: string, Enabled: js.UndefOr[Boolean] = js.undefined): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
}

