package typingsJapgolly.stripeV3.stripe.paymentMethod

import typingsJapgolly.stripeV3.stripeV3Strings.abn_amro
import typingsJapgolly.stripeV3.stripeV3Strings.asn_bank
import typingsJapgolly.stripeV3.stripeV3Strings.bunq
import typingsJapgolly.stripeV3.stripeV3Strings.handelsbanken
import typingsJapgolly.stripeV3.stripeV3Strings.ing
import typingsJapgolly.stripeV3.stripeV3Strings.knab
import typingsJapgolly.stripeV3.stripeV3Strings.moneyou
import typingsJapgolly.stripeV3.stripeV3Strings.rabobank
import typingsJapgolly.stripeV3.stripeV3Strings.regiobank
import typingsJapgolly.stripeV3.stripeV3Strings.sns_bank
import typingsJapgolly.stripeV3.stripeV3Strings.triodos_bank
import typingsJapgolly.stripeV3.stripeV3Strings.van_lanschot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdealDetails extends js.Object {
  var bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot
  var bic: String
  var iban_last4: String
  var verified_name: String
}

object IdealDetails {
  @scala.inline
  def apply(
    bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot,
    bic: String,
    iban_last4: String,
    verified_name: String
  ): IdealDetails = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdealDetails]
  }
}

