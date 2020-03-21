package typingsJapgolly.stripe.mod.accounts

import typingsJapgolly.stripe.AnonAccountholdername
import typingsJapgolly.stripe.AnonBranding
import typingsJapgolly.stripe.AnonDate
import typingsJapgolly.stripe.AnonMcc
import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import typingsJapgolly.stripe.stripeStrings.company
import typingsJapgolly.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountUpdateOptions
  extends IDataOptionsWithMetadata
     with IAccountShared {
  /**
    * An account token, used to securely provide details to the account.
    */
  var account_token: js.UndefOr[String] = js.undefined
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompanyCreateUpdateOptions] = js.undefined
  /**
    * A card or bank account to attach to the account. You can provide either a
    * token, like the ones returned by Stripe.js, or a dictionary as documented in
    * the external_account parameter for either card or bank account creation.
    *
    * This will create a new external account object, make it the new default
    * external account for its currency, and delete the old default if one exists. If
    * you want to add additional external accounts instead of replacing the
    * existing default for this currency, use the bank account or card creation
    * API.
    */
  var external_account: js.UndefOr[AnonAccountholdername] = js.undefined
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividualCreateUpdateOptions] = js.undefined
}

object IAccountUpdateOptions {
  @scala.inline
  def apply(
    account_token: String = null,
    business_profile: AnonMcc = null,
    business_type: individual | company = null,
    company: ICompanyCreateUpdateOptions = null,
    default_currency: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    external_account: AnonAccountholdername = null,
    include: js.Array[String] = null,
    individual: IIndividualCreateUpdateOptions = null,
    metadata: IOptionsMetadata = null,
    product_description: String = null,
    requested_capabilities: js.Array[String] = null,
    settings: AnonBranding = null,
    tos_acceptance: AnonDate = null
  ): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (account_token != null) __obj.updateDynamic("account_token")(account_token.asInstanceOf[js.Any])
    if (business_profile != null) __obj.updateDynamic("business_profile")(business_profile.asInstanceOf[js.Any])
    if (business_type != null) __obj.updateDynamic("business_type")(business_type.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (default_currency != null) __obj.updateDynamic("default_currency")(default_currency.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (external_account != null) __obj.updateDynamic("external_account")(external_account.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (individual != null) __obj.updateDynamic("individual")(individual.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (product_description != null) __obj.updateDynamic("product_description")(product_description.asInstanceOf[js.Any])
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tos_acceptance != null) __obj.updateDynamic("tos_acceptance")(tos_acceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
}

