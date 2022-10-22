package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabasesRequest extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetRelationalDatabases request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetRelationalDatabasesRequest {
  
  inline def apply(): GetRelationalDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabasesRequest]
  }
  
  extension [Self <: GetRelationalDatabasesRequest](x: Self) {
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
