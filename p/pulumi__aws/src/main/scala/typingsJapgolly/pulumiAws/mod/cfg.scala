package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.aggregateAuthorizationMod.AggregateAuthorizationArgs
import typingsJapgolly.pulumiAws.aggregateAuthorizationMod.AggregateAuthorizationState
import typingsJapgolly.pulumiAws.configurationAggregatorMod.ConfigurationAggregatorArgs
import typingsJapgolly.pulumiAws.configurationAggregatorMod.ConfigurationAggregatorState
import typingsJapgolly.pulumiAws.deliveryChannelMod.DeliveryChannelArgs
import typingsJapgolly.pulumiAws.deliveryChannelMod.DeliveryChannelState
import typingsJapgolly.pulumiAws.organizationCustomRuleMod.OrganizationCustomRuleArgs
import typingsJapgolly.pulumiAws.organizationCustomRuleMod.OrganizationCustomRuleState
import typingsJapgolly.pulumiAws.organizationManagedRuleMod.OrganizationManagedRuleArgs
import typingsJapgolly.pulumiAws.organizationManagedRuleMod.OrganizationManagedRuleState
import typingsJapgolly.pulumiAws.recorderMod.RecorderArgs
import typingsJapgolly.pulumiAws.recorderMod.RecorderState
import typingsJapgolly.pulumiAws.recorderStatusMod.RecorderStatusArgs
import typingsJapgolly.pulumiAws.recorderStatusMod.RecorderStatusState
import typingsJapgolly.pulumiAws.ruleMod.RuleArgs
import typingsJapgolly.pulumiAws.ruleMod.RuleState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cfg")
@js.native
object cfg extends js.Object {
  @js.native
  class AggregateAuthorization protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.AggregateAuthorization {
    /**
      * Create a AggregateAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AggregateAuthorizationArgs) = this()
    def this(name: String, args: AggregateAuthorizationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationAggregator protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.ConfigurationAggregator {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationAggregatorArgs) = this()
    def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DeliveryChannel protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.DeliveryChannel {
    /**
      * Create a DeliveryChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeliveryChannelArgs) = this()
    def this(name: String, args: DeliveryChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationCustomRule protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.OrganizationCustomRule {
    /**
      * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationCustomRuleArgs) = this()
    def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationManagedRule protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.OrganizationManagedRule {
    /**
      * Create a OrganizationManagedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationManagedRuleArgs) = this()
    def this(name: String, args: OrganizationManagedRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Recorder protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.Recorder {
    /**
      * Create a Recorder resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderArgs) = this()
    def this(name: String, args: RecorderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RecorderStatus protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.RecorderStatus {
    /**
      * Create a RecorderStatus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderStatusArgs) = this()
    def this(name: String, args: RecorderStatusArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Rule protected ()
    extends typingsJapgolly.pulumiAws.cfgMod.Rule {
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
  @js.native
  object AggregateAuthorization extends js.Object {
    /**
      * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState): typingsJapgolly.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConfigurationAggregator extends js.Object {
    /**
      * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): typingsJapgolly.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DeliveryChannel extends js.Object {
    /**
      * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState): typingsJapgolly.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    /**
      * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationCustomRule extends js.Object {
    /**
      * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): typingsJapgolly.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    /**
      * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationManagedRule extends js.Object {
    /**
      * Get an existing OrganizationManagedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): typingsJapgolly.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    /**
      * Returns true if the given object is an instance of OrganizationManagedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Recorder extends js.Object {
    /**
      * Get an existing Recorder resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.recorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState): typingsJapgolly.pulumiAws.recorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.recorderMod.Recorder = js.native
    /**
      * Returns true if the given object is an instance of Recorder.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RecorderStatus extends js.Object {
    /**
      * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState): typingsJapgolly.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    /**
      * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ruleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState): typingsJapgolly.pulumiAws.ruleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ruleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = js.native
  }
  
}

