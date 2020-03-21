package typingsJapgolly.pulumiAws.vpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService")
@js.native
class VpcEndpointService protected () extends CustomResource {
  /**
    * Create a VpcEndpointService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointServiceArgs) = this()
  def this(name: String, args: VpcEndpointServiceArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Output_[Boolean] = js.native
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: Output_[js.Array[String]] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: Output_[js.Array[String]] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: Output_[js.Array[String]] = js.native
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: Output_[Boolean] = js.native
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: Output_[js.Array[String]] = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: Output_[String] = js.native
  /**
    * The service name.
    */
  val serviceName: Output_[String] = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: Output_[String] = js.native
  /**
    * The state of the VPC endpoint service.
    */
  val state: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService")
@js.native
object VpcEndpointService extends js.Object {
  /**
    * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcEndpointService = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointServiceState): VpcEndpointService = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointServiceState, opts: CustomResourceOptions): VpcEndpointService = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointService.VpcEndpointService */ Boolean = js.native
}

