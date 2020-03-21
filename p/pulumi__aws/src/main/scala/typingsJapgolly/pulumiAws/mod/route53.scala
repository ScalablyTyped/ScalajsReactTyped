package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.delegationSetMod.DelegationSetArgs
import typingsJapgolly.pulumiAws.delegationSetMod.DelegationSetState
import typingsJapgolly.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typingsJapgolly.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typingsJapgolly.pulumiAws.getResolverRuleMod.GetResolverRuleArgs
import typingsJapgolly.pulumiAws.getResolverRuleMod.GetResolverRuleResult
import typingsJapgolly.pulumiAws.getResolverRulesMod.GetResolverRulesArgs
import typingsJapgolly.pulumiAws.getResolverRulesMod.GetResolverRulesResult
import typingsJapgolly.pulumiAws.getZoneMod.GetZoneArgs
import typingsJapgolly.pulumiAws.getZoneMod.GetZoneResult
import typingsJapgolly.pulumiAws.healthCheckMod.HealthCheckArgs
import typingsJapgolly.pulumiAws.healthCheckMod.HealthCheckState
import typingsJapgolly.pulumiAws.queryLogMod.QueryLogArgs
import typingsJapgolly.pulumiAws.queryLogMod.QueryLogState
import typingsJapgolly.pulumiAws.recordMod.RecordArgs
import typingsJapgolly.pulumiAws.recordMod.RecordState
import typingsJapgolly.pulumiAws.recordTypeMod.RecordType
import typingsJapgolly.pulumiAws.resolverEndpointMod.ResolverEndpointArgs
import typingsJapgolly.pulumiAws.resolverEndpointMod.ResolverEndpointState
import typingsJapgolly.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationArgs
import typingsJapgolly.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationState
import typingsJapgolly.pulumiAws.resolverRuleMod.ResolverRuleArgs
import typingsJapgolly.pulumiAws.resolverRuleMod.ResolverRuleState
import typingsJapgolly.pulumiAws.zoneAssociationMod.ZoneAssociationArgs
import typingsJapgolly.pulumiAws.zoneAssociationMod.ZoneAssociationState
import typingsJapgolly.pulumiAws.zoneMod.ZoneArgs
import typingsJapgolly.pulumiAws.zoneMod.ZoneState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "route53")
@js.native
object route53 extends js.Object {
  @js.native
  class DelegationSet protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DelegationSetArgs) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class HealthCheck protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.HealthCheck {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HealthCheckArgs) = this()
    def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class QueryLog protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.QueryLog {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueryLogArgs) = this()
    def this(name: String, args: QueryLogArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Record protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.Record {
    /**
      * Create a Record resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecordArgs) = this()
    def this(name: String, args: RecordArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverEndpoint protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.ResolverEndpoint {
    /**
      * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverEndpointArgs) = this()
    def this(name: String, args: ResolverEndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRule protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.ResolverRule {
    /**
      * Create a ResolverRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleArgs) = this()
    def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRuleAssociation protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.ResolverRuleAssociation {
    /**
      * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleAssociationArgs) = this()
    def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Zone protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ZoneArgs) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends typingsJapgolly.pulumiAws.route53Mod.ZoneAssociation {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ZoneAssociationArgs) = this()
    def this(name: String, args: ZoneAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getZone(): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] with GetZoneResult = js.native
  /* static members */
  @js.native
  object DelegationSet extends js.Object {
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): typingsJapgolly.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.delegationSetMod.DelegationSet = js.native
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HealthCheck extends js.Object {
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): typingsJapgolly.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.healthCheckMod.HealthCheck = js.native
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object QueryLog extends js.Object {
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState): typingsJapgolly.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.queryLogMod.QueryLog = js.native
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Record extends js.Object {
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState): typingsJapgolly.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.recordMod.Record = js.native
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
  }
  
  @js.native
  object RecordTypes extends js.Object {
    val A: RecordType = js.native
    val AAAA: RecordType = js.native
    val CAA: RecordType = js.native
    val CNAME: RecordType = js.native
    val MX: RecordType = js.native
    val NAPTR: RecordType = js.native
    val NS: RecordType = js.native
    val PTR: RecordType = js.native
    val SOA: RecordType = js.native
    val SPF: RecordType = js.native
    val SRV: RecordType = js.native
    val TXT: RecordType = js.native
  }
  
  /* static members */
  @js.native
  object ResolverEndpoint extends js.Object {
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typingsJapgolly.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRule extends js.Object {
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState): typingsJapgolly.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resolverRuleMod.ResolverRule = js.native
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRuleAssociation extends js.Object {
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typingsJapgolly.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Zone extends js.Object {
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState): typingsJapgolly.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.zoneMod.Zone = js.native
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ZoneAssociation extends js.Object {
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typingsJapgolly.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
  
}

