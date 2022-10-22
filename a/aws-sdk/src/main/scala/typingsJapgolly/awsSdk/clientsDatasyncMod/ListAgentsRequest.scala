package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentsRequest extends StObject {
  
  /**
    * The maximum number of agents to list.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of agents.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
}
object ListAgentsRequest {
  
  inline def apply(): ListAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsRequest]
  }
  
  extension [Self <: ListAgentsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
