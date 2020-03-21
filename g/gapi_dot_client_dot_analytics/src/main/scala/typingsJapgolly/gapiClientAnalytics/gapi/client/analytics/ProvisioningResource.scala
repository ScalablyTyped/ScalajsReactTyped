package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResource extends js.Object {
  /** Creates an account ticket. */
  def createAccountTicket(request: AnonFieldsKey): Request_[AccountTicket]
}

object ProvisioningResource {
  @scala.inline
  def apply(createAccountTicket: AnonFieldsKey => CallbackTo[Request_[AccountTicket]]): ProvisioningResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAccountTicket")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFieldsKey) => createAccountTicket(t0).runNow()))
    __obj.asInstanceOf[ProvisioningResource]
  }
}

