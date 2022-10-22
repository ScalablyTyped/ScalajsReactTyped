package typingsJapgolly.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUpdatesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListUpdates request. When the results of a ListUpdates request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all the updates for the specified cluster and Region.
    */
  var updateIds: js.UndefOr[StringList] = js.undefined
}
object ListUpdatesResponse {
  
  inline def apply(): ListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdatesResponse]
  }
  
  extension [Self <: ListUpdatesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUpdateIds(value: StringList): Self = StObject.set(x, "updateIds", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdsUndefined: Self = StObject.set(x, "updateIds", js.undefined)
    
    inline def setUpdateIdsVarargs(value: String*): Self = StObject.set(x, "updateIds", js.Array(value*))
  }
}
