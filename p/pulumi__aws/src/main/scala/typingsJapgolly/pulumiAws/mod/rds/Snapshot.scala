package typingsJapgolly.pulumiAws.mod.rds

import typingsJapgolly.pulumiAws.rdsSnapshotMod.SnapshotArgs
import typingsJapgolly.pulumiAws.rdsSnapshotMod.SnapshotState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.Snapshot")
@js.native
class Snapshot protected ()
  extends typingsJapgolly.pulumiAws.rdsMod.Snapshot {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotArgs) = this()
  def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Get an existing Snapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.rdsSnapshotMod.Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState): typingsJapgolly.pulumiAws.rdsSnapshotMod.Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.rdsSnapshotMod.Snapshot = js.native
  /**
    * Returns true if the given object is an instance of Snapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = js.native
}

