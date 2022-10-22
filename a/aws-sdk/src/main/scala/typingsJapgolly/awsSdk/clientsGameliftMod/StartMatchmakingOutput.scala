package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMatchmakingOutput extends StObject {
  
  /**
    * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.MatchmakingTicket] = js.undefined
}
object StartMatchmakingOutput {
  
  inline def apply(): StartMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMatchmakingOutput]
  }
  
  extension [Self <: StartMatchmakingOutput](x: Self) {
    
    inline def setMatchmakingTicket(value: MatchmakingTicket): Self = StObject.set(x, "MatchmakingTicket", value.asInstanceOf[js.Any])
    
    inline def setMatchmakingTicketUndefined: Self = StObject.set(x, "MatchmakingTicket", js.undefined)
  }
}
