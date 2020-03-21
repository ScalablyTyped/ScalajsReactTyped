package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.AnonAccountnumber
import typingsJapgolly.stripe.AnonBrand
import typingsJapgolly.stripe.stripeStrings.ach_credit_transfer
import typingsJapgolly.stripe.stripeStrings.ach_debit
import typingsJapgolly.stripe.stripeStrings.alipay
import typingsJapgolly.stripe.stripeStrings.bancontact
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.card_present
import typingsJapgolly.stripe.stripeStrings.eps
import typingsJapgolly.stripe.stripeStrings.giropay
import typingsJapgolly.stripe.stripeStrings.ideal
import typingsJapgolly.stripe.stripeStrings.klarna
import typingsJapgolly.stripe.stripeStrings.p24
import typingsJapgolly.stripe.stripeStrings.sofort
import typingsJapgolly.stripe.stripeStrings.stripe_account
import typingsJapgolly.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IAchDebitPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IAlipayPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IBancontactPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.ICardPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.ICardPresentPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IEpsPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IGiropayPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IIdealPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IKlarnaPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IP24PaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.ISofortPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IStripeAccountPaymentMethodDetails
  - typingsJapgolly.stripe.mod.charges.IWechatPaymentMethodDetails
*/
trait IPaymentMethodDetails extends js.Object

object IPaymentMethodDetails {
  @scala.inline
  def IIdealPaymentMethodDetails(`type`: ideal): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: AnonAccountnumber, `type`: ach_credit_transfer): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAlipayPaymentMethodDetails(`type`: alipay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IEpsPaymentMethodDetails(`type`: eps): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IGiropayPaymentMethodDetails(`type`: giropay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IKlarnaPaymentMethodDetails(`type`: klarna): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IBancontactPaymentMethodDetails(`type`: bancontact): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IStripeAccountPaymentMethodDetails(`type`: stripe_account): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IWechatPaymentMethodDetails(`type`: wechat): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ISofortPaymentMethodDetails(`type`: sofort): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IP24PaymentMethodDetails(`type`: p24): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ICardPaymentMethodDetails(card: AnonBrand, `type`: card): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchDebitPaymentMethodDetails(`type`: ach_debit): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ICardPresentPaymentMethodDetails(`type`: card_present): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
}

