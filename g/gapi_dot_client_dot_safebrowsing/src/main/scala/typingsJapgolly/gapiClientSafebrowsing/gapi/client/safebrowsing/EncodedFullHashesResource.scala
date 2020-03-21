package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSafebrowsing.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedFullHashesResource extends js.Object {
  def get(request: AnonAccesstoken): Request_[FindFullHashesResponse]
}

object EncodedFullHashesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => CallbackTo[Request_[FindFullHashesResponse]]): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSafebrowsing.AnonAccesstoken) => get(t0).runNow()))
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
}

