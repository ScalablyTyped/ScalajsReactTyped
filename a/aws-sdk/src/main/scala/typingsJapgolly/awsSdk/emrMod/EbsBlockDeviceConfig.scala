package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsBlockDeviceConfig extends js.Object {
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: typingsJapgolly.awsSdk.emrMod.VolumeSpecification = js.native
  /**
    * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the instance group
    */
  var VolumesPerInstance: js.UndefOr[Integer] = js.native
}

object EbsBlockDeviceConfig {
  @scala.inline
  def apply(VolumeSpecification: VolumeSpecification, VolumesPerInstance: Int | Double = null): EbsBlockDeviceConfig = {
    val __obj = js.Dynamic.literal(VolumeSpecification = VolumeSpecification.asInstanceOf[js.Any])
    if (VolumesPerInstance != null) __obj.updateDynamic("VolumesPerInstance")(VolumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDeviceConfig]
  }
}

