package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.networkAclRuleMod.NetworkAclRuleArgs
import typingsJapgolly.pulumiAws.networkAclRuleMod.NetworkAclRuleState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.NetworkAclRule")
@js.native
class NetworkAclRule protected ()
  extends typingsJapgolly.pulumiAws.ec2Mod.NetworkAclRule {
  /**
    * Create a NetworkAclRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclRuleArgs) = this()
  def this(name: String, args: NetworkAclRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.NetworkAclRule")
@js.native
object NetworkAclRule extends js.Object {
  /**
    * Get an existing NetworkAclRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState): typingsJapgolly.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  def get(name: String, id: Input[ID], state: NetworkAclRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.networkAclRuleMod.NetworkAclRule = js.native
  /**
    * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean = js.native
}

