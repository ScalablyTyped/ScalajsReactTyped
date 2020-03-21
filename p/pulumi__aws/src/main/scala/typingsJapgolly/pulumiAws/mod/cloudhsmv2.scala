package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.clusterMod.ClusterArgs
import typingsJapgolly.pulumiAws.clusterMod.ClusterState
import typingsJapgolly.pulumiAws.getClusterMod.GetClusterArgs
import typingsJapgolly.pulumiAws.getClusterMod.GetClusterResult
import typingsJapgolly.pulumiAws.hsmMod.HsmArgs
import typingsJapgolly.pulumiAws.hsmMod.HsmState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudhsmv2")
@js.native
object cloudhsmv2 extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsJapgolly.pulumiAws.cloudhsmv2Mod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Hsm protected ()
    extends typingsJapgolly.pulumiAws.cloudhsmv2Mod.Hsm {
    /**
      * Create a Hsm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HsmArgs) = this()
    def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.clusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsJapgolly.pulumiAws.clusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.clusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Hsm extends js.Object {
    /**
      * Get an existing Hsm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.hsmMod.Hsm = js.native
    def get(name: String, id: Input[ID], state: HsmState): typingsJapgolly.pulumiAws.hsmMod.Hsm = js.native
    def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.hsmMod.Hsm = js.native
    /**
      * Returns true if the given object is an instance of Hsm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = js.native
  }
  
}

