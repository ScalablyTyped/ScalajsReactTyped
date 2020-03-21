package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonDryRun
import typingsJapgolly.gapiClientContent.AnonKey
import typingsJapgolly.gapiClientContent.AnonMaxResults
import typingsJapgolly.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccounttaxCustomBatchResponse]
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[AccountTax]
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccounttaxListResponse]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[AccountTax]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[AccountTax]
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => CallbackTo[Request_[AccounttaxCustomBatchResponse]],
    get: AnonKey => CallbackTo[Request_[AccountTax]],
    list: AnonMaxResults => CallbackTo[Request_[AccounttaxListResponse]],
    patch: AnonOauthtoken => CallbackTo[Request_[AccountTax]],
    update: AnonOauthtoken => CallbackTo[Request_[AccountTax]]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDryRun) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[AccounttaxResource]
  }
}

