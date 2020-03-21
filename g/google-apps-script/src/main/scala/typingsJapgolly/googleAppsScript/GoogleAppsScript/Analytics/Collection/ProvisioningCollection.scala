package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningCollection extends js.Object {
  // Creates an account ticket.
  def createAccountTicket(resource: AccountTicket): AccountTicket
  // Provision account.
  def createAccountTree(resource: AccountTreeRequest): AccountTreeResponse
}

object ProvisioningCollection {
  @scala.inline
  def apply(
    createAccountTicket: AccountTicket => CallbackTo[AccountTicket],
    createAccountTree: AccountTreeRequest => CallbackTo[AccountTreeResponse]
  ): ProvisioningCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAccountTicket")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTicket) => createAccountTicket(t0).runNow()))
    __obj.updateDynamic("createAccountTree")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.AccountTreeRequest) => createAccountTree(t0).runNow()))
    __obj.asInstanceOf[ProvisioningCollection]
  }
}

