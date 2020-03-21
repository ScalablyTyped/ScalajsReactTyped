package typingsJapgolly.pulumiAws.s3Mod

import typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfigurationArgs
import typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfigurationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "AnalyticsConfiguration")
@js.native
class AnalyticsConfiguration protected ()
  extends typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration {
  /**
    * Create a AnalyticsConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AnalyticsConfigurationArgs) = this()
  def this(name: String, args: AnalyticsConfigurationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/s3", "AnalyticsConfiguration")
@js.native
object AnalyticsConfiguration extends js.Object {
  /**
    * Get an existing AnalyticsConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
  def get(name: String, id: Input[ID], state: AnalyticsConfigurationState): typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
  def get(name: String, id: Input[ID], state: AnalyticsConfigurationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
  /**
    * Returns true if the given object is an instance of AnalyticsConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/analyticsConfiguration.AnalyticsConfiguration */ Boolean = js.native
}

