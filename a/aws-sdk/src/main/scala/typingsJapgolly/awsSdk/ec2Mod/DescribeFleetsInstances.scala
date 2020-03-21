package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetsInstances extends js.Object {
  /**
    * The IDs of the instances.
    */
  var InstanceIds: js.UndefOr[InstanceIdsSet] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.native
  /**
    * Indicates if the instance that was launched is a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.native
  /**
    * The value is Windows for Windows instances. Otherwise, the value is blank.
    */
  var Platform: js.UndefOr[PlatformValues] = js.native
}

object DescribeFleetsInstances {
  @scala.inline
  def apply(
    InstanceIds: InstanceIdsSet = null,
    InstanceType: InstanceType = null,
    LaunchTemplateAndOverrides: LaunchTemplateAndOverridesResponse = null,
    Lifecycle: InstanceLifecycle = null,
    Platform: PlatformValues = null
  ): DescribeFleetsInstances = {
    val __obj = js.Dynamic.literal()
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LaunchTemplateAndOverrides != null) __obj.updateDynamic("LaunchTemplateAndOverrides")(LaunchTemplateAndOverrides.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetsInstances]
  }
}

