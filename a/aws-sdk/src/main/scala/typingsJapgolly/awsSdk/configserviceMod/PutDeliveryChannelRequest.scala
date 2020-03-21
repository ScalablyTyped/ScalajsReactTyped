package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDeliveryChannelRequest extends js.Object {
  /**
    * The configuration delivery channel object that delivers the configuration information to an Amazon S3 bucket and to an Amazon SNS topic.
    */
  var DeliveryChannel: typingsJapgolly.awsSdk.configserviceMod.DeliveryChannel = js.native
}

object PutDeliveryChannelRequest {
  @scala.inline
  def apply(DeliveryChannel: DeliveryChannel): PutDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannel = DeliveryChannel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutDeliveryChannelRequest]
  }
}

