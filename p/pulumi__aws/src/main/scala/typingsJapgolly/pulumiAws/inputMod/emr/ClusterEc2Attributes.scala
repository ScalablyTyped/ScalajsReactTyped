package typingsJapgolly.pulumiAws.inputMod.emr

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEc2Attributes extends js.Object {
  var additionalMasterSecurityGroups: js.UndefOr[Input[String]] = js.native
  var additionalSlaveSecurityGroups: js.UndefOr[Input[String]] = js.native
  var emrManagedMasterSecurityGroup: js.UndefOr[Input[String]] = js.native
  var emrManagedSlaveSecurityGroup: js.UndefOr[Input[String]] = js.native
  var instanceProfile: Input[String] = js.native
  var keyName: js.UndefOr[Input[String]] = js.native
  var serviceAccessSecurityGroup: js.UndefOr[Input[String]] = js.native
  var subnetId: js.UndefOr[Input[String]] = js.native
}

object ClusterEc2Attributes {
  @scala.inline
  def apply(
    instanceProfile: Input[String],
    additionalMasterSecurityGroups: Input[String] = null,
    additionalSlaveSecurityGroups: Input[String] = null,
    emrManagedMasterSecurityGroup: Input[String] = null,
    emrManagedSlaveSecurityGroup: Input[String] = null,
    keyName: Input[String] = null,
    serviceAccessSecurityGroup: Input[String] = null,
    subnetId: Input[String] = null
  ): ClusterEc2Attributes = {
    val __obj = js.Dynamic.literal(instanceProfile = instanceProfile.asInstanceOf[js.Any])
    if (additionalMasterSecurityGroups != null) __obj.updateDynamic("additionalMasterSecurityGroups")(additionalMasterSecurityGroups.asInstanceOf[js.Any])
    if (additionalSlaveSecurityGroups != null) __obj.updateDynamic("additionalSlaveSecurityGroups")(additionalSlaveSecurityGroups.asInstanceOf[js.Any])
    if (emrManagedMasterSecurityGroup != null) __obj.updateDynamic("emrManagedMasterSecurityGroup")(emrManagedMasterSecurityGroup.asInstanceOf[js.Any])
    if (emrManagedSlaveSecurityGroup != null) __obj.updateDynamic("emrManagedSlaveSecurityGroup")(emrManagedSlaveSecurityGroup.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (serviceAccessSecurityGroup != null) __obj.updateDynamic("serviceAccessSecurityGroup")(serviceAccessSecurityGroup.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEc2Attributes]
  }
}

