package typingsJapgolly.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetPortSettingsInput extends js.Object {
  /**
    * A unique identifier for a fleet to update port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsJapgolly.awsSdk.gameliftMod.FleetId = js.native
  /**
    * A collection of port settings to be added to the fleet record.
    */
  var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.native
  /**
    * A collection of port settings to be removed from the fleet record.
    */
  var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.native
}

object UpdateFleetPortSettingsInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    InboundPermissionAuthorizations: IpPermissionsList = null,
    InboundPermissionRevocations: IpPermissionsList = null
  ): UpdateFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    if (InboundPermissionAuthorizations != null) __obj.updateDynamic("InboundPermissionAuthorizations")(InboundPermissionAuthorizations.asInstanceOf[js.Any])
    if (InboundPermissionRevocations != null) __obj.updateDynamic("InboundPermissionRevocations")(InboundPermissionRevocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetPortSettingsInput]
  }
}

