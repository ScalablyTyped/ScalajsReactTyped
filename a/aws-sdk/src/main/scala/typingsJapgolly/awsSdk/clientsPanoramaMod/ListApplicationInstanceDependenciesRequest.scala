package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstanceDependenciesRequest extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: typingsJapgolly.awsSdk.clientsPanoramaMod.ApplicationInstanceId
  
  /**
    * The maximum number of application instance dependencies to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListApplicationInstanceDependenciesRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): ListApplicationInstanceDependenciesRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationInstanceDependenciesRequest]
  }
  
  extension [Self <: ListApplicationInstanceDependenciesRequest](x: Self) {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
