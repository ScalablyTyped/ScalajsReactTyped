package typingsJapgolly.pulumiAws.customerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway")
@js.native
class CustomerGateway protected () extends CustomResource {
  /**
    * Create a CustomerGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomerGatewayArgs) = this()
  def this(name: String, args: CustomerGatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: Output_[Double] = js.native
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: Output_[String] = js.native
  /**
    * Tags to apply to the gateway.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway")
@js.native
object CustomerGateway extends js.Object {
  /**
    * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): CustomerGateway = js.native
  def get(name: String, id: Input[ID], state: CustomerGatewayState): CustomerGateway = js.native
  def get(name: String, id: Input[ID], state: CustomerGatewayState, opts: CustomResourceOptions): CustomerGateway = js.native
  /**
    * Returns true if the given object is an instance of CustomerGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/customerGateway.CustomerGateway */ Boolean = js.native
}

