package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomAvailabilityZoneResult extends js.Object {
  var CustomAvailabilityZone: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}

object CreateCustomAvailabilityZoneResult {
  @scala.inline
  def apply(CustomAvailabilityZone: CustomAvailabilityZone = null): CreateCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZone != null) __obj.updateDynamic("CustomAvailabilityZone")(CustomAvailabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomAvailabilityZoneResult]
  }
}

