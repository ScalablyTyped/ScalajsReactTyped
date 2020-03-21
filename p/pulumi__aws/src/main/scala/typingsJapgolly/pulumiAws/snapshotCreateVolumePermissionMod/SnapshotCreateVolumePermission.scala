package typingsJapgolly.pulumiAws.snapshotCreateVolumePermissionMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission")
@js.native
class SnapshotCreateVolumePermission protected () extends CustomResource {
  /**
    * Create a SnapshotCreateVolumePermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotCreateVolumePermissionArgs) = this()
  def this(name: String, args: SnapshotCreateVolumePermissionArgs, opts: CustomResourceOptions) = this()
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: Output_[String] = js.native
  /**
    * A snapshot ID
    */
  val snapshotId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/snapshotCreateVolumePermission", "SnapshotCreateVolumePermission")
@js.native
object SnapshotCreateVolumePermission extends js.Object {
  /**
    * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SnapshotCreateVolumePermission = js.native
  def get(name: String, id: Input[ID], state: SnapshotCreateVolumePermissionState): SnapshotCreateVolumePermission = js.native
  def get(
    name: String,
    id: Input[ID],
    state: SnapshotCreateVolumePermissionState,
    opts: CustomResourceOptions
  ): SnapshotCreateVolumePermission = js.native
  /**
    * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ Boolean = js.native
}

