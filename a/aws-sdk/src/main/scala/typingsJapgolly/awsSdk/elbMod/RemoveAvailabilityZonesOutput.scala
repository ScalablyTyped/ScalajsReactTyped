package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAvailabilityZonesOutput extends js.Object {
  /**
    * The remaining Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsJapgolly.awsSdk.elbMod.AvailabilityZones] = js.native
}

object RemoveAvailabilityZonesOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): RemoveAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAvailabilityZonesOutput]
  }
}

