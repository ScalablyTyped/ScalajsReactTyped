package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameSessionOutput extends StObject {
  
  /**
    * The updated game session properties.
    */
  var GameSession: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.GameSession] = js.undefined
}
object UpdateGameSessionOutput {
  
  inline def apply(): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
  
  extension [Self <: UpdateGameSessionOutput](x: Self) {
    
    inline def setGameSession(value: GameSession): Self = StObject.set(x, "GameSession", value.asInstanceOf[js.Any])
    
    inline def setGameSessionUndefined: Self = StObject.set(x, "GameSession", js.undefined)
  }
}
