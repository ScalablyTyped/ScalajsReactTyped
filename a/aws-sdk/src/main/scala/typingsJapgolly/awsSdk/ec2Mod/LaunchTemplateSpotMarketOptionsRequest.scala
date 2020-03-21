package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpotMarketOptionsRequest extends js.Object {
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  /**
    * The Spot Instance request type.
    */
  var SpotInstanceType: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.SpotInstanceType] = js.native
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached. The default end date is 7 days from the current date.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object LaunchTemplateSpotMarketOptionsRequest {
  @scala.inline
  def apply(
    BlockDurationMinutes: Int | scala.Double = null,
    InstanceInterruptionBehavior: InstanceInterruptionBehavior = null,
    MaxPrice: String = null,
    SpotInstanceType: SpotInstanceType = null,
    ValidUntil: js.Date = null
  ): LaunchTemplateSpotMarketOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (BlockDurationMinutes != null) __obj.updateDynamic("BlockDurationMinutes")(BlockDurationMinutes.asInstanceOf[js.Any])
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (MaxPrice != null) __obj.updateDynamic("MaxPrice")(MaxPrice.asInstanceOf[js.Any])
    if (SpotInstanceType != null) __obj.updateDynamic("SpotInstanceType")(SpotInstanceType.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateSpotMarketOptionsRequest]
  }
}

