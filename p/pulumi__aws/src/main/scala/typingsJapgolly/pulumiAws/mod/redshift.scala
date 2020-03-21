package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.redshiftClusterMod.ClusterArgs
import typingsJapgolly.pulumiAws.redshiftClusterMod.ClusterState
import typingsJapgolly.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionArgs
import typingsJapgolly.pulumiAws.redshiftEventSubscriptionMod.EventSubscriptionState
import typingsJapgolly.pulumiAws.redshiftGetClusterMod.GetClusterArgs
import typingsJapgolly.pulumiAws.redshiftGetClusterMod.GetClusterResult
import typingsJapgolly.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typingsJapgolly.pulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typingsJapgolly.pulumiAws.redshiftParameterGroupMod.ParameterGroupArgs
import typingsJapgolly.pulumiAws.redshiftParameterGroupMod.ParameterGroupState
import typingsJapgolly.pulumiAws.redshiftSecurityGroupMod.SecurityGroupArgs
import typingsJapgolly.pulumiAws.redshiftSecurityGroupMod.SecurityGroupState
import typingsJapgolly.pulumiAws.redshiftSubnetGroupMod.SubnetGroupArgs
import typingsJapgolly.pulumiAws.redshiftSubnetGroupMod.SubnetGroupState
import typingsJapgolly.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantArgs
import typingsJapgolly.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrantState
import typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationArgs
import typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociationState
import typingsJapgolly.pulumiAws.snapshotScheduleMod.SnapshotScheduleArgs
import typingsJapgolly.pulumiAws.snapshotScheduleMod.SnapshotScheduleState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "redshift")
@js.native
object redshift extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSubscription protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ParameterGroup protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.ParameterGroup {
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
  
  @js.native
  class SecurityGroup protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotCopyGrant protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.SnapshotCopyGrant {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotSchedule protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.SnapshotSchedule {
    /**
      * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleArgs) = this()
    def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotScheduleAssociation protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.SnapshotScheduleAssociation {
    /**
      * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
    def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SubnetGroup protected ()
    extends typingsJapgolly.pulumiAws.redshiftMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsJapgolly.pulumiAws.redshiftClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.redshiftClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventSubscription extends js.Object {
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typingsJapgolly.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.redshiftEventSubscriptionMod.EventSubscription = js.native
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typingsJapgolly.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.redshiftParameterGroupMod.ParameterGroup = js.native
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityGroup extends js.Object {
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typingsJapgolly.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.redshiftSecurityGroupMod.SecurityGroup = js.native
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCopyGrant extends js.Object {
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): typingsJapgolly.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.snapshotCopyGrantMod.SnapshotCopyGrant = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotSchedule extends js.Object {
    /**
      * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState): typingsJapgolly.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.snapshotScheduleMod.SnapshotSchedule = js.native
    /**
      * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotScheduleAssociation extends js.Object {
    /**
      * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.snapshotScheduleAssociationMod.SnapshotScheduleAssociation = js.native
    /**
      * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SubnetGroup extends js.Object {
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typingsJapgolly.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.redshiftSubnetGroupMod.SubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
}

