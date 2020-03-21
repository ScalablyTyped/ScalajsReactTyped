package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAvailabilityZonesOutput extends js.Object {
  /**
    * The updated list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typingsJapgolly.awsSdk.elbMod.AvailabilityZones] = js.native
}

object AddAvailabilityZonesOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): AddAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAvailabilityZonesOutput]
  }
}

