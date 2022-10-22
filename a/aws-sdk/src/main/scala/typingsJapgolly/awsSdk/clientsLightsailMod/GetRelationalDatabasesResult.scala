package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabasesResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabases request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object describing the result of your get relational databases request.
    */
  var relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined
}
object GetRelationalDatabasesResult {
  
  inline def apply(): GetRelationalDatabasesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabasesResult]
  }
  
  extension [Self <: GetRelationalDatabasesResult](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRelationalDatabases(value: RelationalDatabaseList): Self = StObject.set(x, "relationalDatabases", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabasesUndefined: Self = StObject.set(x, "relationalDatabases", js.undefined)
    
    inline def setRelationalDatabasesVarargs(value: RelationalDatabase*): Self = StObject.set(x, "relationalDatabases", js.Array(value*))
  }
}
