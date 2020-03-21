package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.eksClusterMod.ClusterArgs
import typingsJapgolly.pulumiAws.eksClusterMod.ClusterState
import typingsJapgolly.pulumiAws.eksGetClusterMod.GetClusterArgs
import typingsJapgolly.pulumiAws.eksGetClusterMod.GetClusterResult
import typingsJapgolly.pulumiAws.fargateProfileMod.FargateProfileArgs
import typingsJapgolly.pulumiAws.fargateProfileMod.FargateProfileState
import typingsJapgolly.pulumiAws.getClusterAuthMod.GetClusterAuthArgs
import typingsJapgolly.pulumiAws.getClusterAuthMod.GetClusterAuthResult
import typingsJapgolly.pulumiAws.nodeGroupMod.NodeGroupArgs
import typingsJapgolly.pulumiAws.nodeGroupMod.NodeGroupState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "eks")
@js.native
object eks extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsJapgolly.pulumiAws.eksMod.Cluster {
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
  class FargateProfile protected ()
    extends typingsJapgolly.pulumiAws.eksMod.FargateProfile {
    /**
      * Create a FargateProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FargateProfileArgs) = this()
    def this(name: String, args: FargateProfileArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NodeGroup protected ()
    extends typingsJapgolly.pulumiAws.eksMod.NodeGroup {
    /**
      * Create a NodeGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodeGroupArgs) = this()
    def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsJapgolly.pulumiAws.eksClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.eksClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FargateProfile extends js.Object {
    /**
      * Get an existing FargateProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.fargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState): typingsJapgolly.pulumiAws.fargateProfileMod.FargateProfile = js.native
    def get(name: String, id: Input[ID], state: FargateProfileState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.fargateProfileMod.FargateProfile = js.native
    /**
      * Returns true if the given object is an instance of FargateProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/fargateProfile.FargateProfile */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NodeGroup extends js.Object {
    /**
      * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.nodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState): typingsJapgolly.pulumiAws.nodeGroupMod.NodeGroup = js.native
    def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.nodeGroupMod.NodeGroup = js.native
    /**
      * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
  }
  
}

