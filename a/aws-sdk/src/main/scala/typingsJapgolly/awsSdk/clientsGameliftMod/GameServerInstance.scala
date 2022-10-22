package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerInstance extends StObject {
  
  /**
    * A generated unique identifier for the game server group that includes the game server instance. 
    */
  var GameServerGroupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroupArn] = js.undefined
  
  /**
    * A developer-defined identifier for the game server group that includes the game server instance. The name is unique for each Region in each Amazon Web Services account.
    */
  var GameServerGroupName: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroupName] = js.undefined
  
  /**
    * The unique identifier for the instance where the game server is running. This ID is available in the instance metadata. EC2 instance IDs use a 17-character format, for example: i-1234567890abcdef0.
    */
  var InstanceId: js.UndefOr[GameServerInstanceId] = js.undefined
  
  /**
    *  Current status of the game server instance.     ACTIVE -- The instance is viable for hosting game servers.     DRAINING -- The instance is not viable for hosting game servers. Existing game servers are in the process of ending, and new game servers are not started on this instance unless no other resources are available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED game servers, it will be terminated in favor of the new instance.    SPOT_TERMINATING -- The instance is in the process of shutting down due to a Spot instance interruption. No new game servers are started on this instance.  
    */
  var InstanceStatus: js.UndefOr[GameServerInstanceStatus] = js.undefined
}
object GameServerInstance {
  
  inline def apply(): GameServerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerInstance]
  }
  
  extension [Self <: GameServerInstance](x: Self) {
    
    inline def setGameServerGroupArn(value: GameServerGroupArn): Self = StObject.set(x, "GameServerGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupArnUndefined: Self = StObject.set(x, "GameServerGroupArn", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupName): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupNameUndefined: Self = StObject.set(x, "GameServerGroupName", js.undefined)
    
    inline def setInstanceId(value: GameServerInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceStatus(value: GameServerInstanceStatus): Self = StObject.set(x, "InstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatusUndefined: Self = StObject.set(x, "InstanceStatus", js.undefined)
  }
}
