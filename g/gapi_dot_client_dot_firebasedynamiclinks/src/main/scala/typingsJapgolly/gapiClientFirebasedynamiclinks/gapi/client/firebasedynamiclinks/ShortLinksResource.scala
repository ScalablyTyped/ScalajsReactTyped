package typingsJapgolly.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortLinksResource extends js.Object {
  /**
    * Creates a short Dynamic Link given either a valid long Dynamic Link or
    * details such as Dynamic Link domain, Android and iOS app information.
    * The created short Dynamic Link will not expire.
    *
    * Repeated calls with the same long Dynamic Link or Dynamic Link information
    * will produce the same short Dynamic Link.
    *
    * The Dynamic Link domain in the request must be owned by requester's
    * Firebase project.
    */
  def create(request: AnonAccesstoken): Request_[CreateShortDynamicLinkResponse]
}

object ShortLinksResource {
  @scala.inline
  def apply(create: AnonAccesstoken => CallbackTo[Request_[CreateShortDynamicLinkResponse]]): ShortLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAccesstoken) => create(t0).runNow()))
    __obj.asInstanceOf[ShortLinksResource]
  }
}

