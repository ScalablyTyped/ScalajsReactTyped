package typingsJapgolly.pulumiAws.cloudwatchMod

import typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilterArgs
import typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilterState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter")
@js.native
class LogMetricFilter protected ()
  extends typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilter {
  /**
    * Create a LogMetricFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogMetricFilterArgs) = this()
  def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter")
@js.native
object LogMetricFilter extends js.Object {
  /**
    * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState): typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
  /**
    * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
}

