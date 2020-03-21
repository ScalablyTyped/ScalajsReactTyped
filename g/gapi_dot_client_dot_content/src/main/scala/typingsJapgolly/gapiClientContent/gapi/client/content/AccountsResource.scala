package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonAccountId
import typingsJapgolly.gapiClientContent.AnonAlt
import typingsJapgolly.gapiClientContent.AnonDryRun
import typingsJapgolly.gapiClientContent.AnonFields
import typingsJapgolly.gapiClientContent.AnonKey
import typingsJapgolly.gapiClientContent.AnonMaxResults
import typingsJapgolly.gapiClientContent.AnonMerchantId
import typingsJapgolly.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: AnonAlt): Request_[AccountsAuthInfoResponse]
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AnonAccountId): Request_[AccountsClaimWebsiteResponse]
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: AnonFields): Request_[Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: AnonAlt => CallbackTo[Request_[AccountsAuthInfoResponse]],
    claimwebsite: AnonAccountId => CallbackTo[Request_[AccountsClaimWebsiteResponse]],
    custombatch: AnonDryRun => CallbackTo[Request_[AccountsCustomBatchResponse]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Account]],
    insert: AnonMerchantId => CallbackTo[Request_[Account]],
    list: AnonMaxResults => CallbackTo[Request_[AccountsListResponse]],
    patch: AnonOauthtoken => CallbackTo[Request_[Account]],
    update: AnonOauthtoken => CallbackTo[Request_[Account]]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authinfo")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAlt) => authinfo(t0).runNow()))
    __obj.updateDynamic("claimwebsite")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAccountId) => claimwebsite(t0).runNow()))
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonDryRun) => custombatch(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMerchantId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

