package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.policyMod.PolicyArgs
import typingsJapgolly.pulumiAws.policyMod.PolicyState
import typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledActionArgs
import typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledActionState
import typingsJapgolly.pulumiAws.targetMod.TargetArgs
import typingsJapgolly.pulumiAws.targetMod.TargetState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling", JSImport.Namespace)
@js.native
object appautoscalingMod extends js.Object {
  @js.native
  class Policy protected ()
    extends typingsJapgolly.pulumiAws.policyMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ScheduledAction protected ()
    extends typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledAction {
    /**
      * Create a ScheduledAction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduledActionArgs) = this()
    def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Target protected ()
    extends typingsJapgolly.pulumiAws.targetMod.Target {
    /**
      * Create a Target resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetArgs) = this()
    def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.policyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsJapgolly.pulumiAws.policyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.policyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ScheduledAction extends js.Object {
    /**
      * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState): typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    /**
      * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Target extends js.Object {
    /**
      * Get an existing Target resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.targetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState): typingsJapgolly.pulumiAws.targetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.targetMod.Target = js.native
    /**
      * Returns true if the given object is an instance of Target.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = js.native
  }
  
}

