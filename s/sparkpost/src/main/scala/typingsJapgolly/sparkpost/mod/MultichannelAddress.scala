package typingsJapgolly.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultichannelAddress extends js.Object {
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var app_id: String
  /** The communication channel used to reach recipient. Valid values are “email”, “gcm”, “apns”. */
  var channel: String
  /** Valid email address. Required if channel is “email”. */
  var email: String
  /** Email address to display in the “To” header instead of address.email (for BCC). Used when channel is “email” */
  var header_to: String
  /** User-friendly name for the email address. Used when channel is “email” */
  var name: String
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var token: String
}

object MultichannelAddress {
  @scala.inline
  def apply(app_id: String, channel: String, email: String, header_to: String, name: String, token: String): MultichannelAddress = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], header_to = header_to.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultichannelAddress]
  }
}

