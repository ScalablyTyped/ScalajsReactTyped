package typingsJapgolly.pulumiAws.publicDnsNamespaceMod

import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace")
@js.native
class PublicDnsNamespace protected () extends CustomResource {
  /**
    * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PublicDnsNamespaceArgs) = this()
  def this(name: String, args: PublicDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: Output_[String] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: Output_[String] = js.native
  /**
    * The name of the namespace.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace")
@js.native
object PublicDnsNamespace extends js.Object {
  /**
    * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): PublicDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PublicDnsNamespaceState): PublicDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PublicDnsNamespaceState, opts: CustomResourceOptions): PublicDnsNamespace = js.native
  /**
    * Returns true if the given object is an instance of PublicDnsNamespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean = js.native
}

