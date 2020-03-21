package typingsJapgolly.pulumiAws.rdsMod

import typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstanceArgs
import typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstanceState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "ClusterInstance")
@js.native
class ClusterInstance protected ()
  extends typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstance {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterInstanceArgs) = this()
  def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/rds", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState): typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.rdsClusterInstanceMod.ClusterInstance = js.native
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = js.native
}

