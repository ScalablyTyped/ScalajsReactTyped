package typingsJapgolly.pulumiAws.mod.sqs

import typingsJapgolly.pulumiAws.queuePolicyMod.QueuePolicyArgs
import typingsJapgolly.pulumiAws.queuePolicyMod.QueuePolicyState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.QueuePolicy")
@js.native
class QueuePolicy protected ()
  extends typingsJapgolly.pulumiAws.sqsMod.QueuePolicy {
  /**
    * Create a QueuePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: QueuePolicyArgs) = this()
  def this(name: String, args: QueuePolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "sqs.QueuePolicy")
@js.native
object QueuePolicy extends js.Object {
  /**
    * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.queuePolicyMod.QueuePolicy = js.native
  def get(name: String, id: Input[ID], state: QueuePolicyState): typingsJapgolly.pulumiAws.queuePolicyMod.QueuePolicy = js.native
  def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.queuePolicyMod.QueuePolicy = js.native
  /**
    * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = js.native
}

