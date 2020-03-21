package typingsJapgolly.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconInfo extends js.Object {
  /** The ID advertised by the beacon. */
  var advertisedId: js.UndefOr[AdvertisedId] = js.undefined
  /**
    * Attachments matching the type(s) requested.
    * May be empty if no attachment types were requested.
    */
  var attachments: js.UndefOr[js.Array[AttachmentInfo]] = js.undefined
  /** The name under which the beacon is registered. */
  var beaconName: js.UndefOr[String] = js.undefined
}

object BeaconInfo {
  @scala.inline
  def apply(
    advertisedId: AdvertisedId = null,
    attachments: js.Array[AttachmentInfo] = null,
    beaconName: String = null
  ): BeaconInfo = {
    val __obj = js.Dynamic.literal()
    if (advertisedId != null) __obj.updateDynamic("advertisedId")(advertisedId.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (beaconName != null) __obj.updateDynamic("beaconName")(beaconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeaconInfo]
  }
}

