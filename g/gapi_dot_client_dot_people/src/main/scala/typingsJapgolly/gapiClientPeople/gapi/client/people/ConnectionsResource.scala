package typingsJapgolly.gapiClientPeople.gapi.client.people

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPeople.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionsResource extends js.Object {
  /**
    * Provides a list of the authenticated user's contacts merged with any
    * connected profiles.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def list(request: AnonOauthtoken): Request_[ListConnectionsResponse]
}

object ConnectionsResource {
  @scala.inline
  def apply(list: AnonOauthtoken => CallbackTo[Request_[ListConnectionsResponse]]): ConnectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPeople.AnonOauthtoken) => list(t0).runNow()))
    __obj.asInstanceOf[ConnectionsResource]
  }
}

