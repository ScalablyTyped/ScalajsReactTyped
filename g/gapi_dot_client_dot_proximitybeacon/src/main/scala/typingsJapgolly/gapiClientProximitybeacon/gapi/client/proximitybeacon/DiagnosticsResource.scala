package typingsJapgolly.gapiClientProximitybeacon.gapi.client.proximitybeacon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientProximitybeacon.AnonAlertFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsResource extends js.Object {
  /**
    * List the diagnostics for a single beacon. You can also list diagnostics for
    * all the beacons owned by your Google Developers Console project by using
    * the beacon name `beacons/-`.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: AnonAlertFilter): Request_[ListDiagnosticsResponse]
}

object DiagnosticsResource {
  @scala.inline
  def apply(list: AnonAlertFilter => CallbackTo[Request_[ListDiagnosticsResponse]]): DiagnosticsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonAlertFilter) => list(t0).runNow()))
    __obj.asInstanceOf[DiagnosticsResource]
  }
}

