package typingsJapgolly.pulumiAws.mod.apigateway

import typingsJapgolly.pulumiAws.usagePlanMod.UsagePlanArgs
import typingsJapgolly.pulumiAws.usagePlanMod.UsagePlanState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.UsagePlan")
@js.native
class UsagePlan protected ()
  extends typingsJapgolly.pulumiAws.apigatewayMod.UsagePlan {
  /**
    * Create a UsagePlan resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UsagePlanArgs) = this()
  def this(name: String, args: UsagePlanArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.UsagePlan")
@js.native
object UsagePlan extends js.Object {
  /**
    * Get an existing UsagePlan resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.usagePlanMod.UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState): typingsJapgolly.pulumiAws.usagePlanMod.UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.usagePlanMod.UsagePlan = js.native
  /**
    * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlan.UsagePlan */ Boolean = js.native
}

