package typingsJapgolly.pulumiAws.nodeGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.outputMod.eks.NodeGroupRemoteAccess
import typingsJapgolly.pulumiAws.outputMod.eks.NodeGroupResource
import typingsJapgolly.pulumiAws.outputMod.eks.NodeGroupScalingConfig
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
@js.native
class NodeGroup protected () extends CustomResource {
  /**
    * Create a NodeGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NodeGroupArgs) = this()
  def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
  val amiType: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the EKS Node Group.
    */
  val arn: Output_[String] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: Output_[String] = js.native
  val diskSize: Output_[Double] = js.native
  val instanceTypes: Output_[String] = js.native
  /**
    * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
    */
  val labels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Name of the EKS Node Group.
    */
  val nodeGroupName: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
    */
  val nodeRoleArn: Output_[String] = js.native
  /**
    * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
    */
  val releaseVersion: Output_[String] = js.native
  /**
    * Configuration block with remote access settings. Detailed below.
    */
  val remoteAccess: Output_[js.UndefOr[NodeGroupRemoteAccess]] = js.native
  /**
    * List of objects containing information about underlying resources.
    */
  val resources: Output_[js.Array[NodeGroupResource]] = js.native
  /**
    * Configuration block with scaling settings. Detailed below.
    */
  val scalingConfig: Output_[NodeGroupScalingConfig] = js.native
  /**
    * Status of the EKS Node Group.
    */
  val status: Output_[String] = js.native
  /**
    * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  val version: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
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
  def get(name: String, id: Input[ID]): NodeGroup = js.native
  def get(name: String, id: Input[ID], state: NodeGroupState): NodeGroup = js.native
  def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): NodeGroup = js.native
  /**
    * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
}

