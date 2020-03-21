package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.notificationRuleMod.NotificationRuleArgs
import typingsJapgolly.pulumiAws.notificationRuleMod.NotificationRuleState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "codestarnotifications")
@js.native
object codestarnotifications extends js.Object {
  @js.native
  class NotificationRule protected ()
    extends typingsJapgolly.pulumiAws.codestarnotificationsMod.NotificationRule {
    /**
      * Create a NotificationRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationRuleArgs) = this()
    def this(name: String, args: NotificationRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object NotificationRule extends js.Object {
    /**
      * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.notificationRuleMod.NotificationRule = js.native
    def get(name: String, id: Input[ID], state: NotificationRuleState): typingsJapgolly.pulumiAws.notificationRuleMod.NotificationRule = js.native
    def get(name: String, id: Input[ID], state: NotificationRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.notificationRuleMod.NotificationRule = js.native
    /**
      * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codestarnotifications/notificationRule.NotificationRule */ Boolean = js.native
  }
  
}

