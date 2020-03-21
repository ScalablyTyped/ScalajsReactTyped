package typingsJapgolly.pulumiAws.receiptFilterMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter")
@js.native
class ReceiptFilter protected () extends CustomResource {
  /**
    * Create a ReceiptFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReceiptFilterArgs) = this()
  def this(name: String, args: ReceiptFilterArgs, opts: CustomResourceOptions) = this()
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: Output_[String] = js.native
  /**
    * The name of the filter
    */
  val name: Output_[String] = js.native
  /**
    * Block or Allow
    */
  val policy: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter")
@js.native
object ReceiptFilter extends js.Object {
  /**
    * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ReceiptFilter = js.native
  def get(name: String, id: Input[ID], state: ReceiptFilterState): ReceiptFilter = js.native
  def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): ReceiptFilter = js.native
  /**
    * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = js.native
}

