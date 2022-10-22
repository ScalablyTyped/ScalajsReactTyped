package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServersOutput extends StObject {
  
  /**
    * A collection of game server objects that match the request.
    */
  var GameServers: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameServers] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListGameServersOutput {
  
  inline def apply(): ListGameServersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServersOutput]
  }
  
  extension [Self <: ListGameServersOutput](x: Self) {
    
    inline def setGameServers(value: GameServers): Self = StObject.set(x, "GameServers", value.asInstanceOf[js.Any])
    
    inline def setGameServersUndefined: Self = StObject.set(x, "GameServers", js.undefined)
    
    inline def setGameServersVarargs(value: GameServer*): Self = StObject.set(x, "GameServers", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
