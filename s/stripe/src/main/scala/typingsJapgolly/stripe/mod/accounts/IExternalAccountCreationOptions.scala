package typingsJapgolly.stripe.mod.accounts

import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExternalAccountCreationOptions extends IDataOptionsWithMetadata {
  /**
    * Only applicable on accounts (not customers or recipients). If you set this to true (or if this is the first external account being added
    * in this currency) this card will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  /**
    * When adding a card to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card details (with the options shown
    * below). Stripe will automatically validate the card.
    */
  var external_account: String
}

object IExternalAccountCreationOptions {
  @scala.inline
  def apply(
    external_account: String,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IExternalAccountCreationOptions = {
    val __obj = js.Dynamic.literal(external_account = external_account.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalAccountCreationOptions]
  }
}

