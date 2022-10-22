package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerGroup extends StObject {
  
  /**
    * A generated unique ID for the Amazon EC2 Auto Scaling group that is associated with this game server group.
    */
  var AutoScalingGroupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.AutoScalingGroupArn] = js.undefined
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.BalancingStrategy] = js.undefined
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A generated unique ID for the game server group.
    */
  var GameServerGroupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroupArn] = js.undefined
  
  /**
    * A developer-defined identifier for the game server group. The name is unique for each Region in each Amazon Web Services account.
    */
  var GameServerGroupName: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroupName] = js.undefined
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by Amazon Web Services regardless of protection status. 
    */
  var GameServerProtectionPolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerProtectionPolicy] = js.undefined
  
  /**
    * The set of Amazon EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in the corresponding Auto Scaling group. 
    */
  var InstanceDefinitions: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.InstanceDefinitions] = js.undefined
  
  /**
    * A timestamp that indicates when this game server group was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The current status of the game server group. Possible statuses include:    NEW - GameLift FleetIQ has validated the CreateGameServerGroup() request.     ACTIVATING - GameLift FleetIQ is setting up a game server group, which includes creating an Auto Scaling group in your Amazon Web Services account.     ACTIVE - The game server group has been successfully created.     DELETE_SCHEDULED - A request to delete the game server group has been received.     DELETING - GameLift FleetIQ has received a valid DeleteGameServerGroup() request and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group and the game server group.     DELETED - The game server group has been successfully deleted.     ERROR - The asynchronous processes of activating or deleting a game server group has failed, resulting in an error state.  
    */
  var Status: js.UndefOr[GameServerGroupStatus] = js.undefined
  
  /**
    * Additional information about the current game server group status. This information might provide additional insight on groups that are in ERROR status.
    */
  var StatusReason: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A list of activities that are currently suspended for this game server group. If this property is empty, all activities are occurring.
    */
  var SuspendedActions: js.UndefOr[GameServerGroupActions] = js.undefined
}
object GameServerGroup {
  
  inline def apply(): GameServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerGroup]
  }
  
  extension [Self <: GameServerGroup](x: Self) {
    
    inline def setAutoScalingGroupArn(value: AutoScalingGroupArn): Self = StObject.set(x, "AutoScalingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupArnUndefined: Self = StObject.set(x, "AutoScalingGroupArn", js.undefined)
    
    inline def setBalancingStrategy(value: BalancingStrategy): Self = StObject.set(x, "BalancingStrategy", value.asInstanceOf[js.Any])
    
    inline def setBalancingStrategyUndefined: Self = StObject.set(x, "BalancingStrategy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setGameServerGroupArn(value: GameServerGroupArn): Self = StObject.set(x, "GameServerGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupArnUndefined: Self = StObject.set(x, "GameServerGroupArn", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupName): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupNameUndefined: Self = StObject.set(x, "GameServerGroupName", js.undefined)
    
    inline def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = StObject.set(x, "GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setGameServerProtectionPolicyUndefined: Self = StObject.set(x, "GameServerProtectionPolicy", js.undefined)
    
    inline def setInstanceDefinitions(value: InstanceDefinitions): Self = StObject.set(x, "InstanceDefinitions", value.asInstanceOf[js.Any])
    
    inline def setInstanceDefinitionsUndefined: Self = StObject.set(x, "InstanceDefinitions", js.undefined)
    
    inline def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = StObject.set(x, "InstanceDefinitions", js.Array(value*))
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: GameServerGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: NonZeroAndMaxString): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSuspendedActions(value: GameServerGroupActions): Self = StObject.set(x, "SuspendedActions", value.asInstanceOf[js.Any])
    
    inline def setSuspendedActionsUndefined: Self = StObject.set(x, "SuspendedActions", js.undefined)
    
    inline def setSuspendedActionsVarargs(value: GameServerGroupAction*): Self = StObject.set(x, "SuspendedActions", js.Array(value*))
  }
}
