package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGamesRequest extends StObject {
  
  /**
    * The maximum number of results to return.  Use this parameter with NextToken to get results as a set of sequential pages. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.MaxResults] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
}
object ListGamesRequest {
  
  inline def apply(): ListGamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGamesRequest]
  }
  
  extension [Self <: ListGamesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
