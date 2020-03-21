package typingsJapgolly.pulumiAws.usagePlanMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.outputMod.apigateway.UsagePlanApiStage
import typingsJapgolly.pulumiAws.outputMod.apigateway.UsagePlanQuotaSettings
import typingsJapgolly.pulumiAws.outputMod.apigateway.UsagePlanThrottleSettings
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan")
@js.native
class UsagePlan protected () extends CustomResource {
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
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: Output_[js.UndefOr[js.Array[UsagePlanApiStage]]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  /**
    * The description of a usage plan.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the usage plan.
    */
  val name: Output_[String] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: Output_[js.UndefOr[String]] = js.native
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: Output_[js.UndefOr[UsagePlanQuotaSettings]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: Output_[js.UndefOr[UsagePlanThrottleSettings]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan")
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
  def get(name: String, id: Input[ID]): UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState): UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState, opts: CustomResourceOptions): UsagePlan = js.native
  /**
    * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlan.UsagePlan */ Boolean = js.native
}

