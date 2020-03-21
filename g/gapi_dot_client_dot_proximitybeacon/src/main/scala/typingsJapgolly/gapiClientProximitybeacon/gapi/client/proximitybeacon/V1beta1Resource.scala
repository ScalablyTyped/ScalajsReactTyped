package typingsJapgolly.gapiClientProximitybeacon.gapi.client.proximitybeacon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientProximitybeacon.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1beta1Resource extends js.Object {
  /**
    * Gets the Proximity Beacon API's current public key and associated
    * parameters used to initiate the Diffie-Hellman key exchange required to
    * register a beacon that broadcasts the Eddystone-EID format. This key
    * changes periodically; clients may cache it and re-use the same public key
    * to provision and register multiple beacons. However, clients should be
    * prepared to refresh this key when they encounter an error registering an
    * Eddystone-EID beacon.
    */
  def getEidparams(request: AnonAccesstoken): Request_[EphemeralIdRegistrationParams]
}

object V1beta1Resource {
  @scala.inline
  def apply(getEidparams: AnonAccesstoken => CallbackTo[Request_[EphemeralIdRegistrationParams]]): V1beta1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEidparams")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonAccesstoken) => getEidparams(t0).runNow()))
    __obj.asInstanceOf[V1beta1Resource]
  }
}

