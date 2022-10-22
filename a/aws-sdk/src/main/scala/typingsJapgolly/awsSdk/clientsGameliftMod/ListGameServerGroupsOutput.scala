package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServerGroupsOutput extends StObject {
  
  /**
    * A collection of game server group objects that match the request.
    */
  var GameServerGroups: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServerGroups] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListGameServerGroupsOutput {
  
  inline def apply(): ListGameServerGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerGroupsOutput]
  }
  
  extension [Self <: ListGameServerGroupsOutput](x: Self) {
    
    inline def setGameServerGroups(value: GameServerGroups): Self = StObject.set(x, "GameServerGroups", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupsUndefined: Self = StObject.set(x, "GameServerGroups", js.undefined)
    
    inline def setGameServerGroupsVarargs(value: GameServerGroup*): Self = StObject.set(x, "GameServerGroups", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
