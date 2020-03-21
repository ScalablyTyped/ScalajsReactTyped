package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: AnonAlt): Request_[FindFullHashesResponse]
}

object FullHashesResource {
  @scala.inline
  def apply(find: AnonAlt => CallbackTo[Request_[FindFullHashesResponse]]): FullHashesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSafebrowsing.AnonAlt) => find(t0).runNow()))
    __obj.asInstanceOf[FullHashesResource]
  }
}

