package typingsJapgolly.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlacklistReportsRequest extends js.Object {
  /**
    * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated IP addresses that you use to send email using Amazon Pinpoint or Amazon SES.
    */
  var BlacklistItemNames: typingsJapgolly.awsSdk.pinpointemailMod.BlacklistItemNames = js.native
}

object GetBlacklistReportsRequest {
  @scala.inline
  def apply(BlacklistItemNames: BlacklistItemNames): GetBlacklistReportsRequest = {
    val __obj = js.Dynamic.literal(BlacklistItemNames = BlacklistItemNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBlacklistReportsRequest]
  }
}

