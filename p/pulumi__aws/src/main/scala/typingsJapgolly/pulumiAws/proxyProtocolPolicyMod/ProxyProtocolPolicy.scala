package typingsJapgolly.pulumiAws.proxyProtocolPolicyMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy")
@js.native
class ProxyProtocolPolicy protected () extends CustomResource {
  /**
    * Create a ProxyProtocolPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProxyProtocolPolicyArgs) = this()
  def this(name: String, args: ProxyProtocolPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * List of instance ports to which the policy
    * should be applied. This can be specified if the protocol is SSL or TCP.
    */
  val instancePorts: Output_[js.Array[String]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy")
@js.native
object ProxyProtocolPolicy extends js.Object {
  /**
    * Get an existing ProxyProtocolPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ProxyProtocolPolicy = js.native
  def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState): ProxyProtocolPolicy = js.native
  def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState, opts: CustomResourceOptions): ProxyProtocolPolicy = js.native
  /**
    * Returns true if the given object is an instance of ProxyProtocolPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/proxyProtocolPolicy.ProxyProtocolPolicy */ Boolean = js.native
}

