package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.customerGatewayMod.CustomerGatewayArgs
import typingsJapgolly.pulumiAws.customerGatewayMod.CustomerGatewayState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.CustomerGateway")
@js.native
class CustomerGateway protected ()
  extends typingsJapgolly.pulumiAws.ec2Mod.CustomerGateway {
  /**
    * Create a CustomerGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomerGatewayArgs) = this()
  def this(name: String, args: CustomerGatewayArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.CustomerGateway")
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
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.customerGatewayMod.CustomerGateway = js.native
  def get(name: String, id: Input[ID], state: CustomerGatewayState): typingsJapgolly.pulumiAws.customerGatewayMod.CustomerGateway = js.native
  def get(name: String, id: Input[ID], state: CustomerGatewayState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.customerGatewayMod.CustomerGateway = js.native
  /**
    * Returns true if the given object is an instance of CustomerGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/customerGateway.CustomerGateway */ Boolean = js.native
}

