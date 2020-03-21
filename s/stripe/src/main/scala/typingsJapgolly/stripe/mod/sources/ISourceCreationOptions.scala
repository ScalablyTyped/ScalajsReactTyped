package typingsJapgolly.stripe.mod.sources

import typingsJapgolly.stripe.AnonAcceptance
import typingsJapgolly.stripe.AnonAddressEmail
import typingsJapgolly.stripe.AnonBank
import typingsJapgolly.stripe.AnonIban
import typingsJapgolly.stripe.AnonRefundattributesmethod
import typingsJapgolly.stripe.AnonReturnurlString
import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.stripeStrings.ach_credit_transfer
import typingsJapgolly.stripe.stripeStrings.ach_debit
import typingsJapgolly.stripe.stripeStrings.alipay
import typingsJapgolly.stripe.stripeStrings.bancontact
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.card_present
import typingsJapgolly.stripe.stripeStrings.code_verification
import typingsJapgolly.stripe.stripeStrings.eps
import typingsJapgolly.stripe.stripeStrings.giropay
import typingsJapgolly.stripe.stripeStrings.ideal
import typingsJapgolly.stripe.stripeStrings.multibanco
import typingsJapgolly.stripe.stripeStrings.none
import typingsJapgolly.stripe.stripeStrings.p24
import typingsJapgolly.stripe.stripeStrings.receiver
import typingsJapgolly.stripe.stripeStrings.redirect
import typingsJapgolly.stripe.stripeStrings.reusable
import typingsJapgolly.stripe.stripeStrings.sepa_debit
import typingsJapgolly.stripe.stripeStrings.single_use
import typingsJapgolly.stripe.stripeStrings.sofort
import typingsJapgolly.stripe.stripeStrings.three_d_secure
import typingsJapgolly.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions extends IDataOptionsWithMetadata {
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.undefined
  var ideal: js.UndefOr[AnonBank] = js.undefined
  var mandate: js.UndefOr[AnonAcceptance] = js.undefined
  @JSName("metadata")
  var metadata_ISourceCreationOptions: js.UndefOr[IMetadata] = js.undefined
  var owner: js.UndefOr[AnonAddressEmail] = js.undefined
  var receiver: js.UndefOr[AnonRefundattributesmethod] = js.undefined
  var redirect: js.UndefOr[AnonReturnurlString] = js.undefined
  var sepa_debit: js.UndefOr[AnonIban] = js.undefined
  var statement_descriptor: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
  var usage: js.UndefOr[reusable | single_use] = js.undefined
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    amount: Int | Double = null,
    currency: String = null,
    expand: js.Array[String] = null,
    flow: redirect | receiver | code_verification | none = null,
    ideal: AnonBank = null,
    include: js.Array[String] = null,
    mandate: AnonAcceptance = null,
    metadata: IMetadata = null,
    owner: AnonAddressEmail = null,
    receiver: AnonRefundattributesmethod = null,
    redirect: AnonReturnurlString = null,
    sepa_debit: AnonIban = null,
    statement_descriptor: String = null,
    token: String = null,
    usage: reusable | single_use = null
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (flow != null) __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCreationOptions]
  }
}

