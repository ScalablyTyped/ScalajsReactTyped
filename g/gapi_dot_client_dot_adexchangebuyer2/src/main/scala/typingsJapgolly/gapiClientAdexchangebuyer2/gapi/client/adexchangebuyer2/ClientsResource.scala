package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccesstoken
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonCallback
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsResource extends js.Object {
  var invitations: InvitationsResource
  var users: UsersResource
  /** Creates a new client buyer. */
  def create(request: AnonCallback): Request_[Client]
  /** Gets a client buyer with a given client account ID. */
  def get(request: AnonAccesstoken): Request_[Client]
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: AnonFields): Request_[ListClientsResponse]
  /** Updates an existing client buyer. */
  def update(request: AnonAccesstoken): Request_[Client]
}

object ClientsResource {
  @scala.inline
  def apply(
    create: AnonCallback => CallbackTo[Request_[Client]],
    get: AnonAccesstoken => CallbackTo[Request_[Client]],
    invitations: InvitationsResource,
    list: AnonFields => CallbackTo[Request_[ListClientsResponse]],
    update: AnonAccesstoken => CallbackTo[Request_[Client]],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(invitations = invitations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonCallback) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAccesstoken) => update(t0).runNow()))
    __obj.asInstanceOf[ClientsResource]
  }
}

