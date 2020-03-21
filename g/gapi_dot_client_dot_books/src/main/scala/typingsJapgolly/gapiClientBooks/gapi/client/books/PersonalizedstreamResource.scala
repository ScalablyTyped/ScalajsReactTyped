package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonMaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: AnonMaxAllowedMaturityRating): Request_[Discoveryclusters]
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: AnonMaxAllowedMaturityRating => CallbackTo[Request_[Discoveryclusters]]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonMaxAllowedMaturityRating) => get(t0).runNow()))
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
}

