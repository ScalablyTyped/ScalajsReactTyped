package typingsJapgolly.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsDecommission extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon that should be decommissioned. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the
    * beacon and N is a code for the beacon's type. Possible values are `3` for
    * Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for
    * AltBeacon. For Eddystone-EID beacons, you may use either the current EID
    * of the beacon's "stable" UID. Required.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * The project id of the beacon to decommission. If the project id is not
    * specified then the project making the request is used. The project id
    * must match the project that owns the beacon. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

