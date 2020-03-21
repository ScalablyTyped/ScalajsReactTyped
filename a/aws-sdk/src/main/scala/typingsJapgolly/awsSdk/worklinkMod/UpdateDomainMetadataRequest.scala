package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainMetadataRequest extends js.Object {
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The name of the domain.
    */
  var DomainName: typingsJapgolly.awsSdk.worklinkMod.DomainName = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.worklinkMod.FleetArn = js.native
}

object UpdateDomainMetadataRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn, DisplayName: DisplayName = null): UpdateDomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainMetadataRequest]
  }
}

