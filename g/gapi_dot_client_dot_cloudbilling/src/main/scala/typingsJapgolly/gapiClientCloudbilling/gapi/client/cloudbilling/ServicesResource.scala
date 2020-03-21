package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudbilling.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: AnonBearertoken): Request_[ListServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(list: AnonBearertoken => CallbackTo[Request_[ListServicesResponse]], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(skus = skus.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudbilling.AnonBearertoken) => list(t0).runNow()))
    __obj.asInstanceOf[ServicesResource]
  }
}

