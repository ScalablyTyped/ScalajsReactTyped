package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: AnonCallback): Request_[ListAuthorizedDomainsResponse]
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: AnonCallback => CallbackTo[Request_[ListAuthorizedDomainsResponse]]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
}

