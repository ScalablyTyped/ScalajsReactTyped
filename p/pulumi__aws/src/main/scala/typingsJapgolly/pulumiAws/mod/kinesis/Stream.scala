package typingsJapgolly.pulumiAws.mod.kinesis

import typingsJapgolly.pulumiAws.streamMod.StreamArgs
import typingsJapgolly.pulumiAws.streamMod.StreamState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis.Stream")
@js.native
class Stream protected ()
  extends typingsJapgolly.pulumiAws.kinesisMod.Stream {
  /**
    * Create a Stream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StreamArgs) = this()
  def this(name: String, args: StreamArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "kinesis.Stream")
@js.native
object Stream extends js.Object {
  /**
    * Get an existing Stream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.streamMod.Stream = js.native
  def get(name: String, id: Input[ID], state: StreamState): typingsJapgolly.pulumiAws.streamMod.Stream = js.native
  def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.streamMod.Stream = js.native
  /**
    * Returns true if the given object is an instance of Stream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean = js.native
}

