package typingsJapgolly.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about any potential InterconnectAttachments between an
  * Interconnect at a specific InterconnectLocation, and a specific Cloud
  * Region.
  */
@js.native
trait SchemaInterconnectLocationRegionInfo extends js.Object {
  /**
    * Expected round-trip time in milliseconds, from this InterconnectLocation
    * to a VM in this region.
    */
  var expectedRttMs: js.UndefOr[String] = js.native
  /**
    * Identifies the network presence of this location.
    */
  var locationPresence: js.UndefOr[String] = js.native
  /**
    * URL for the region of this location.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocationRegionInfo {
  @scala.inline
  def apply(expectedRttMs: String = null, locationPresence: String = null, region: String = null): SchemaInterconnectLocationRegionInfo = {
    val __obj = js.Dynamic.literal()
    if (expectedRttMs != null) __obj.updateDynamic("expectedRttMs")(expectedRttMs.asInstanceOf[js.Any])
    if (locationPresence != null) __obj.updateDynamic("locationPresence")(locationPresence.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectLocationRegionInfo]
  }
}

