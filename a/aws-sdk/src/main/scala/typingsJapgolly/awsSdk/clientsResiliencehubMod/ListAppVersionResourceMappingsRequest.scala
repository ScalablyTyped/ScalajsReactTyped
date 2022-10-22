package typingsJapgolly.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppVersionResourceMappingsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Null, or the token from a previous call to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppVersionResourceMappingsRequest {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): ListAppVersionResourceMappingsRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppVersionResourceMappingsRequest]
  }
  
  extension [Self <: ListAppVersionResourceMappingsRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
