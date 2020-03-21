package typingsJapgolly.pulumiAws.sslNegotiationPolicyMod

import typingsJapgolly.pulumiAws.outputMod.elasticloadbalancing.SslNegotiationPolicyAttribute
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy", "SslNegotiationPolicy")
@js.native
class SslNegotiationPolicy protected () extends CustomResource {
  /**
    * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SslNegotiationPolicyArgs) = this()
  def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: Output_[js.UndefOr[js.Array[SslNegotiationPolicyAttribute]]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Output_[Double] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Output_[String] = js.native
  /**
    * The name of the attribute
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy", "SslNegotiationPolicy")
@js.native
object SslNegotiationPolicy extends js.Object {
  /**
    * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SslNegotiationPolicy = js.native
  def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): SslNegotiationPolicy = js.native
  def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): SslNegotiationPolicy = js.native
  /**
    * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
}

