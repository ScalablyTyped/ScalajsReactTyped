package typingsJapgolly.pulumiAws.mod.cloudwatch

import typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterArgs
import typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.LogSubscriptionFilter")
@js.native
class LogSubscriptionFilter protected ()
  extends typingsJapgolly.pulumiAws.cloudwatchMod.LogSubscriptionFilter {
  /**
    * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogSubscriptionFilterArgs) = this()
  def this(name: String, args: LogSubscriptionFilterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "cloudwatch.LogSubscriptionFilter")
@js.native
object LogSubscriptionFilter extends js.Object {
  /**
    * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
  def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
  def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
  /**
    * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
}

