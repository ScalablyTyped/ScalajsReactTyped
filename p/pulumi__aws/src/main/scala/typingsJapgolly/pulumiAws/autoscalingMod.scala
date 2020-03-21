package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.attachmentMod.AttachmentArgs
import typingsJapgolly.pulumiAws.attachmentMod.AttachmentState
import typingsJapgolly.pulumiAws.autoscalingPolicyMod.PolicyArgs
import typingsJapgolly.pulumiAws.autoscalingPolicyMod.PolicyState
import typingsJapgolly.pulumiAws.getGroupMod.GetGroupArgs
import typingsJapgolly.pulumiAws.getGroupMod.GetGroupResult
import typingsJapgolly.pulumiAws.groupMod.GroupArgs
import typingsJapgolly.pulumiAws.groupMod.GroupState
import typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHookArgs
import typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHookState
import typingsJapgolly.pulumiAws.metricsMod.Metric
import typingsJapgolly.pulumiAws.metricsMod.MetricsGranularity
import typingsJapgolly.pulumiAws.notificationMod.NotificationArgs
import typingsJapgolly.pulumiAws.notificationMod.NotificationState
import typingsJapgolly.pulumiAws.notificationTypeMod.NotificationType
import typingsJapgolly.pulumiAws.scheduleMod.ScheduleArgs
import typingsJapgolly.pulumiAws.scheduleMod.ScheduleState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling", JSImport.Namespace)
@js.native
object autoscalingMod extends js.Object {
  @js.native
  class Attachment protected ()
    extends typingsJapgolly.pulumiAws.attachmentMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Group protected ()
    extends typingsJapgolly.pulumiAws.groupMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LifecycleHook protected ()
    extends typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHook {
    /**
      * Create a LifecycleHook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecycleHookArgs) = this()
    def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typingsJapgolly.pulumiAws.notificationMod.Notification {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationArgs) = this()
    def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends typingsJapgolly.pulumiAws.autoscalingPolicyMod.Policy {
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
  class Schedule protected ()
    extends typingsJapgolly.pulumiAws.scheduleMod.Schedule {
    /**
      * Create a Schedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduleArgs) = this()
    def this(name: String, args: ScheduleArgs, opts: CustomResourceOptions) = this()
  }
  
  var GroupDesiredCapacityMetric: Metric = js.native
  var GroupInServiceInstancesMetric: Metric = js.native
  var GroupMaxSizeMetric: Metric = js.native
  var GroupMinSizeMetric: Metric = js.native
  var GroupPendingInstances: Metric = js.native
  var GroupStandbyInstances: Metric = js.native
  var GroupTerminatingInstances: Metric = js.native
  var GroupTotalInstances: Metric = js.native
  var InstanceLaunchErrorNotification: NotificationType = js.native
  var InstanceLaunchNotification: NotificationType = js.native
  var InstanceTerminateErrorNotification: NotificationType = js.native
  var InstanceTerminateNotification: NotificationType = js.native
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
  var TestNotification: NotificationType = js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] with GetGroupResult = js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] with GetGroupResult = js.native
  /* static members */
  @js.native
  object Attachment extends js.Object {
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.attachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsJapgolly.pulumiAws.attachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.attachmentMod.Attachment = js.native
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.groupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsJapgolly.pulumiAws.groupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.groupMod.Group = js.native
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LifecycleHook extends js.Object {
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState): typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Notification extends js.Object {
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.notificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState): typingsJapgolly.pulumiAws.notificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.notificationMod.Notification = js.native
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsJapgolly.pulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.autoscalingPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Schedule extends js.Object {
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.scheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState): typingsJapgolly.pulumiAws.scheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.scheduleMod.Schedule = js.native
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
  }
  
}

