package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.lbGetListenerMod.GetListenerArgs
import typingsJapgolly.pulumiAws.lbGetListenerMod.GetListenerResult
import typingsJapgolly.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerArgs
import typingsJapgolly.pulumiAws.lbGetLoadBalancerMod.GetLoadBalancerResult
import typingsJapgolly.pulumiAws.lbGetTargetGroupMod.GetTargetGroupArgs
import typingsJapgolly.pulumiAws.lbGetTargetGroupMod.GetTargetGroupResult
import typingsJapgolly.pulumiAws.lbListenerCertificateMod.ListenerCertificateArgs
import typingsJapgolly.pulumiAws.lbListenerCertificateMod.ListenerCertificateState
import typingsJapgolly.pulumiAws.lbListenerMod.ListenerArgs
import typingsJapgolly.pulumiAws.lbListenerMod.ListenerState
import typingsJapgolly.pulumiAws.lbListenerRuleMod.ListenerRuleArgs
import typingsJapgolly.pulumiAws.lbListenerRuleMod.ListenerRuleState
import typingsJapgolly.pulumiAws.lbLoadBalancerMod.LoadBalancerArgs
import typingsJapgolly.pulumiAws.lbLoadBalancerMod.LoadBalancerState
import typingsJapgolly.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentArgs
import typingsJapgolly.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachmentState
import typingsJapgolly.pulumiAws.lbTargetGroupMod.TargetGroupArgs
import typingsJapgolly.pulumiAws.lbTargetGroupMod.TargetGroupState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lb")
@js.native
object lb extends js.Object {
  @js.native
  class Listener protected ()
    extends typingsJapgolly.pulumiAws.lbMod.Listener {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerCertificate protected ()
    extends typingsJapgolly.pulumiAws.lbMod.ListenerCertificate {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ListenerRule protected ()
    extends typingsJapgolly.pulumiAws.lbMod.ListenerRule {
    /**
      * Create a ListenerRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerRuleArgs) = this()
    def this(name: String, args: ListenerRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LoadBalancer protected ()
    extends typingsJapgolly.pulumiAws.lbMod.LoadBalancer {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroup protected ()
    extends typingsJapgolly.pulumiAws.lbMod.TargetGroup {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TargetGroupAttachment protected ()
    extends typingsJapgolly.pulumiAws.lbMod.TargetGroupAttachment {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  def getListener(): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  /* static members */
  @js.native
  object Listener extends js.Object {
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState): typingsJapgolly.pulumiAws.lbListenerMod.Listener = js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbListenerMod.Listener = js.native
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListenerCertificate extends js.Object {
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): typingsJapgolly.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ListenerRule extends js.Object {
    /**
      * Get an existing ListenerRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState): typingsJapgolly.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    def get(name: String, id: Input[ID], state: ListenerRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbListenerRuleMod.ListenerRule = js.native
    /**
      * Returns true if the given object is an instance of ListenerRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerRule.ListenerRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LoadBalancer extends js.Object {
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState): typingsJapgolly.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbLoadBalancerMod.LoadBalancer = js.native
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/loadBalancer.LoadBalancer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetGroup extends js.Object {
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): typingsJapgolly.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbTargetGroupMod.TargetGroup = js.native
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TargetGroupAttachment extends js.Object {
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): typingsJapgolly.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lbTargetGroupAttachmentMod.TargetGroupAttachment = js.native
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
}

