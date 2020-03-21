package typingsJapgolly.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlaymoviespartner.AnonAccesstoken
import typingsJapgolly.gapiClientPlaymoviespartner.AnonAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: AnonAccesstoken): Request_[Avail]
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AnonAccountId): Request_[ListAvailsResponse]
}

object AvailsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => CallbackTo[Request_[Avail]],
    list: AnonAccountId => CallbackTo[Request_[ListAvailsResponse]]
  ): AvailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlaymoviespartner.AnonAccountId) => list(t0).runNow()))
    __obj.asInstanceOf[AvailsResource]
  }
}

