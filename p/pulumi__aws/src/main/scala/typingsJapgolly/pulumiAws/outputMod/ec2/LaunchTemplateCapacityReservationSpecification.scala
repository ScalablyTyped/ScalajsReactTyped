package typingsJapgolly.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  var capacityReservationPreference: js.UndefOr[String] = js.native
  var capacityReservationTarget: js.UndefOr[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = js.native
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(
    capacityReservationPreference: String = null,
    capacityReservationTarget: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = null
  ): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference.asInstanceOf[js.Any])
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
}

