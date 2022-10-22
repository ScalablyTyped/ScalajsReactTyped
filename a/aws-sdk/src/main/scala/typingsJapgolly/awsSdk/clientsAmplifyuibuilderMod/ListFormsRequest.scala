package typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFormsRequest extends StObject {
  
  /**
    * The unique ID for the Amplify app.
    */
  var appId: String
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The maximum number of forms to retrieve.
    */
  var maxResults: js.UndefOr[ListFormsLimit] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListFormsRequest {
  
  inline def apply(appId: String, environmentName: String): ListFormsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFormsRequest]
  }
  
  extension [Self <: ListFormsRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListFormsLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
