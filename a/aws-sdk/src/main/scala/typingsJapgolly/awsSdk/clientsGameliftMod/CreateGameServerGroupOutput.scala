package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameServerGroupOutput extends StObject {
  
  /**
    * The newly created game server group object, including the new ARN value for the GameLift FleetIQ game server group and the object's status. The Amazon EC2 Auto Scaling group ARN is initially null, since the group has not yet been created. This value is added once the game server group status reaches ACTIVE. 
    */
  var GameServerGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroup] = js.undefined
}
object CreateGameServerGroupOutput {
  
  inline def apply(): CreateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameServerGroupOutput]
  }
  
  extension [Self <: CreateGameServerGroupOutput](x: Self) {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
