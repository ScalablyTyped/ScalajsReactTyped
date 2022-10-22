package typingsJapgolly.algoliaClientSearch.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopUserIDsResponse extends StObject {
  
  /**
    * Mapping of cluster names to top users.
    */
  var topUsers: Record[String, js.Array[UserIDResponse]]
}
object GetTopUserIDsResponse {
  
  inline def apply(topUsers: Record[String, js.Array[UserIDResponse]]): GetTopUserIDsResponse = {
    val __obj = js.Dynamic.literal(topUsers = topUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopUserIDsResponse]
  }
  
  extension [Self <: GetTopUserIDsResponse](x: Self) {
    
    inline def setTopUsers(value: Record[String, js.Array[UserIDResponse]]): Self = StObject.set(x, "topUsers", value.asInstanceOf[js.Any])
  }
}
