package typingsJapgolly.pulumiAws.rdsMod

import typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroupArgs
import typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroupState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "ParameterGroup")
@js.native
class ParameterGroup protected ()
  extends typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroup {
  /**
    * Create a ParameterGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ParameterGroupArgs) = this()
  def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/rds", "ParameterGroup")
@js.native
object ParameterGroup extends js.Object {
  /**
    * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ParameterGroupState): typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.rdsParameterGroupMod.ParameterGroup = js.native
  /**
    * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/parameterGroup.ParameterGroup */ Boolean = js.native
}

