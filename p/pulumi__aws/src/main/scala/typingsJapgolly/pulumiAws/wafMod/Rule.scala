package typingsJapgolly.pulumiAws.wafMod

import typingsJapgolly.pulumiAws.wafRuleMod.RuleArgs
import typingsJapgolly.pulumiAws.wafRuleMod.RuleState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "Rule")
@js.native
class Rule protected ()
  extends typingsJapgolly.pulumiAws.wafRuleMod.Rule {
  /**
    * Create a Rule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RuleArgs) = this()
  def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/waf", "Rule")
@js.native
object Rule extends js.Object {
  /**
    * Get an existing Rule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.wafRuleMod.Rule = js.native
  def get(name: String, id: Input[ID], state: RuleState): typingsJapgolly.pulumiAws.wafRuleMod.Rule = js.native
  def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.wafRuleMod.Rule = js.native
  /**
    * Returns true if the given object is an instance of Rule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rule.Rule */ Boolean = js.native
}

