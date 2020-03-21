package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonAlt
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: AnonBearertoken): Request_[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: AnonBearertoken): Request_[ClientUser]
}

object UsersResource {
  @scala.inline
  def apply(
    get: AnonBearertoken => CallbackTo[Request_[ClientUser]],
    list: AnonAlt => CallbackTo[Request_[ListClientUsersResponse]],
    update: AnonBearertoken => CallbackTo[Request_[ClientUser]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonBearertoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonBearertoken) => update(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

