package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceUsersRequest extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The maximum number of requests that you want returned.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.MaxResults] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstanceUsersRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): ListAppInstanceUsersRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInstanceUsersRequest]
  }
  
  extension [Self <: ListAppInstanceUsersRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
