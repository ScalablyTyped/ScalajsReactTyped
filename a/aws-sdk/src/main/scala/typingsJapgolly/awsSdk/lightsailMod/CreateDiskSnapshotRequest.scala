package typingsJapgolly.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDiskSnapshotRequest extends js.Object {
  /**
    * The unique name of the source disk (e.g., Disk-Virginia-1).  This parameter cannot be defined together with the instance name parameter. The disk name and instance name parameters are mutually exclusive. 
    */
  var diskName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the destination disk snapshot (e.g., my-disk-snapshot) based on the source disk.
    */
  var diskSnapshotName: ResourceName = js.native
  /**
    * The unique name of the source instance (e.g., Amazon_Linux-512MB-Virginia-1). When this is defined, a snapshot of the instance's system volume is created.  This parameter cannot be defined together with the disk name parameter. The instance name and disk name parameters are mutually exclusive. 
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateDiskSnapshotRequest {
  @scala.inline
  def apply(
    diskSnapshotName: ResourceName,
    diskName: ResourceName = null,
    instanceName: ResourceName = null,
    tags: TagList = null
  ): CreateDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    if (diskName != null) __obj.updateDynamic("diskName")(diskName.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskSnapshotRequest]
  }
}

