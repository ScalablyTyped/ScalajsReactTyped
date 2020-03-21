package typingsJapgolly.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectDiagnosticsLinkStatus extends js.Object {
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP
    * neighbor entries seen on this link. This will be empty if the link is
    * bundled
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.native
  /**
    * The unique ID for this link assigned during turn up by Google.
    */
  var circuitId: js.UndefOr[String] = js.native
  /**
    * The Demarc address assigned by Google and provided in the LoA.
    */
  var googleDemarc: js.UndefOr[String] = js.native
  var lacpStatus: js.UndefOr[SchemaInterconnectDiagnosticsLinkLACPStatus] = js.native
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the received light level.
    */
  var receivingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.native
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the transmitted light level.
    */
  var transmittingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.native
}

object SchemaInterconnectDiagnosticsLinkStatus {
  @scala.inline
  def apply(
    arpCaches: js.Array[SchemaInterconnectDiagnosticsARPEntry] = null,
    circuitId: String = null,
    googleDemarc: String = null,
    lacpStatus: SchemaInterconnectDiagnosticsLinkLACPStatus = null,
    receivingOpticalPower: SchemaInterconnectDiagnosticsLinkOpticalPower = null,
    transmittingOpticalPower: SchemaInterconnectDiagnosticsLinkOpticalPower = null
  ): SchemaInterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    if (arpCaches != null) __obj.updateDynamic("arpCaches")(arpCaches.asInstanceOf[js.Any])
    if (circuitId != null) __obj.updateDynamic("circuitId")(circuitId.asInstanceOf[js.Any])
    if (googleDemarc != null) __obj.updateDynamic("googleDemarc")(googleDemarc.asInstanceOf[js.Any])
    if (lacpStatus != null) __obj.updateDynamic("lacpStatus")(lacpStatus.asInstanceOf[js.Any])
    if (receivingOpticalPower != null) __obj.updateDynamic("receivingOpticalPower")(receivingOpticalPower.asInstanceOf[js.Any])
    if (transmittingOpticalPower != null) __obj.updateDynamic("transmittingOpticalPower")(transmittingOpticalPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkStatus]
  }
}

