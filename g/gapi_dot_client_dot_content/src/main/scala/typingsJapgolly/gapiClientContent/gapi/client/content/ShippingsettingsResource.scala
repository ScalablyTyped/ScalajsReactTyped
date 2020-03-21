package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonDryRun
import typingsJapgolly.gapiClientContent.AnonKey
import typingsJapgolly.gapiClientContent.AnonMaxResults
import typingsJapgolly.gapiClientContent.AnonOauthtoken
import typingsJapgolly.gapiClientContent.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[ShippingsettingsCustomBatchResponse]
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[ShippingSettings]
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: AnonQuotaUser): Request_[ShippingsettingsGetSupportedCarriersResponse]
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[ShippingsettingsListResponse]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[ShippingSettings]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[ShippingSettings]
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => CallbackTo[Request_[ShippingsettingsCustomBatchResponse]],
    get: AnonKey => CallbackTo[Request_[ShippingSettings]],
    getsupportedcarriers: AnonQuotaUser => CallbackTo[Request_[ShippingsettingsGetSupportedCarriersResponse]],
    list: AnonMaxResults => CallbackTo[Request_[ShippingsettingsListResponse]],
    patch: AnonOauthtoken => CallbackTo[Request_[ShippingSettings]],
    update: AnonOauthtoken => CallbackTo[Request_[ShippingSettings]]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDryRun) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("getsupportedcarriers")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonQuotaUser) => getsupportedcarriers(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

