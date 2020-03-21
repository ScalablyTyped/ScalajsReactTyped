package typingsJapgolly.stripeV2.stripe

import typingsJapgolly.stripeV2.AnonBankname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeBankTokenResponse extends StripeTokenResponse {
  var bank_account: AnonBankname
}

object StripeBankTokenResponse {
  @scala.inline
  def apply(
    bank_account: AnonBankname,
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean,
    error: StripeError = null
  ): StripeBankTokenResponse = {
    val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenResponse]
  }
}

