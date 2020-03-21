package typingsJapgolly.stripejs.sourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stripejs.customerMod.Customer
import typingsJapgolly.stripejs.stripejsStrings.code_verification
import typingsJapgolly.stripejs.stripejsStrings.none
import typingsJapgolly.stripejs.stripejsStrings.receiver
import typingsJapgolly.stripejs.stripejsStrings.redirect
import typingsJapgolly.stripejs.stripejsStrings.reusable
import typingsJapgolly.stripejs.stripejsStrings.single_use
import typingsJapgolly.stripejs.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceData extends js.Object {
  /**
    * This is the amount for which the source will be chargeable once ready
    */
  var amount: Double
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none
  /**
    * Information about a mandate possiblity attached to a source object
    * (generally for bank debits) as well as its acceptance status
    */
  var mandate: js.UndefOr[Mandate] = js.undefined
  /**
    * Extra data you want to add to the source object
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: js.UndefOr[Customer] = js.undefined
  /**
    * Can be set only if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.undefined
  /**
    * Required if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.undefined
  /**
    * An arbitrary string to be displayed on your customer’s statement
    * @example if your website is RunClub and the item you’re charging for is a race ticket,
    * you may want to specify a statement_descriptor of RunClub 5K race ticket.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  var three_d_secure_2_eap: js.UndefOr[js.Any] = js.undefined
  /**
    * When passed, token properties will override source parameters
    */
  var token: js.UndefOr[Token] = js.undefined
  /**
    * The type of the source to create
    */
  var `type`: paymentOptions
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable | single_use
}

object SourceData {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    flow: redirect | receiver | code_verification | none,
    `type`: paymentOptions,
    usage: reusable | single_use,
    mandate: Mandate = null,
    metadata: StringDictionary[String] = null,
    owner: Customer = null,
    receiver: Receiver = null,
    redirect: Redirect = null,
    statement_descriptor: String = null,
    three_d_secure_2_eap: js.Any = null,
    token: Token = null
  ): SourceData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (three_d_secure_2_eap != null) __obj.updateDynamic("three_d_secure_2_eap")(three_d_secure_2_eap.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
}

