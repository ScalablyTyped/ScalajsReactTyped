package typingsJapgolly.pulumiAws.wafByteMatchSetMod

import typingsJapgolly.pulumiAws.outputMod.waf.ByteMatchSetByteMatchTuple
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/byteMatchSet", "ByteMatchSet")
@js.native
class ByteMatchSet protected () extends CustomResource {
  /**
    * Create a ByteMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ByteMatchSetArgs) = this()
  def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies the bytes (typically a string that corresponds
    * with ASCII characters) that you want to search for in web requests,
    * the location in requests that you want to search, and other settings.
    */
  val byteMatchTuples: Output_[js.UndefOr[js.Array[ByteMatchSetByteMatchTuple]]] = js.native
  /**
    * The name or description of the Byte Match Set.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/waf/byteMatchSet", "ByteMatchSet")
@js.native
object ByteMatchSet extends js.Object {
  /**
    * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState): ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): ByteMatchSet = js.native
  /**
    * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ Boolean = js.native
}

