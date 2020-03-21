package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonBearertoken
import typingsJapgolly.gapiClientPartners.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: AnonBearertoken): Request_[CreateLeadResponse]
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonCallback): Request_[ListLeadsResponse]
}

object LeadsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[CreateLeadResponse]],
    list: AnonCallback => CallbackTo[Request_[ListLeadsResponse]]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[LeadsResource]
  }
}

