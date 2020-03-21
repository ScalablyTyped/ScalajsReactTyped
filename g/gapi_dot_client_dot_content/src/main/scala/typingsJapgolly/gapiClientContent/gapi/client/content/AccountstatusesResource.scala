package typingsJapgolly.gapiClientContent.gapi.client.content

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientContent.AnonAlt
import typingsJapgolly.gapiClientContent.AnonKey
import typingsJapgolly.gapiClientContent.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesResource extends js.Object {
  def custombatch(request: AnonAlt): Request_[AccountstatusesCustomBatchResponse]
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[AccountStatus]
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccountstatusesListResponse]
}

object AccountstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAlt => CallbackTo[Request_[AccountstatusesCustomBatchResponse]],
    get: AnonKey => CallbackTo[Request_[AccountStatus]],
    list: AnonMaxResults => CallbackTo[Request_[AccountstatusesListResponse]]
  ): AccountstatusesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custombatch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonAlt) => custombatch(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientContent.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[AccountstatusesResource]
  }
}

