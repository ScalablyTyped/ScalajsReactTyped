package typingsJapgolly.pulumiAws.mod.rds

import typingsJapgolly.pulumiAws.clusterEndpointMod.ClusterEndpointArgs
import typingsJapgolly.pulumiAws.clusterEndpointMod.ClusterEndpointState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.ClusterEndpoint")
@js.native
class ClusterEndpoint protected ()
  extends typingsJapgolly.pulumiAws.rdsMod.ClusterEndpoint {
  /**
    * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterEndpointArgs) = this()
  def this(name: String, args: ClusterEndpointArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "rds.ClusterEndpoint")
@js.native
object ClusterEndpoint extends js.Object {
  /**
    * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
  def get(name: String, id: Input[ID], state: ClusterEndpointState): typingsJapgolly.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
  def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.clusterEndpointMod.ClusterEndpoint = js.native
  /**
    * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = js.native
}

