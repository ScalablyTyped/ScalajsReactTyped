package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccesstoken
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccountId
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: AnonAccesstoken): Request_[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: AnonAccountId): Request_[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUserInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[ClientUserInvitation]],
    get: AnonAccountId => CallbackTo[Request_[ClientUserInvitation]],
    list: AnonAlt => CallbackTo[Request_[ListClientUserInvitationsResponse]]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccountId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[InvitationsResource]
  }
}

