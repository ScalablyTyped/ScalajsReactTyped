package typingsJapgolly.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents one beacon observed once.
  */
@js.native
trait SchemaObservation extends js.Object {
  /**
    * The ID advertised by the beacon the client has encountered.  If the
    * submitted `advertised_id` type is Eddystone-EID, then the client must be
    * authorized to resolve the given beacon. Otherwise no data will be
    * returned for that beacon. Required.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.native
  /**
    * The array of telemetry bytes received from the beacon. The server is
    * responsible for parsing it. This field may frequently be empty, as with a
    * beacon that transmits telemetry only occasionally.
    */
  var telemetry: js.UndefOr[String] = js.native
  /**
    * Time when the beacon was observed.
    */
  var timestampMs: js.UndefOr[String] = js.native
}

object SchemaObservation {
  @scala.inline
  def apply(advertisedId: SchemaAdvertisedId = null, telemetry: String = null, timestampMs: String = null): SchemaObservation = {
    val __obj = js.Dynamic.literal()
    if (advertisedId != null) __obj.updateDynamic("advertisedId")(advertisedId.asInstanceOf[js.Any])
    if (telemetry != null) __obj.updateDynamic("telemetry")(telemetry.asInstanceOf[js.Any])
    if (timestampMs != null) __obj.updateDynamic("timestampMs")(timestampMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObservation]
  }
}

