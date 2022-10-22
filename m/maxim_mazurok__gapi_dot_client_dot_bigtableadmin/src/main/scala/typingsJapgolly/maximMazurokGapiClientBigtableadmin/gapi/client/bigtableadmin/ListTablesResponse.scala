package typingsJapgolly.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesResponse extends StObject {
  
  /** Set if not all tables could be returned in a single response. Pass this value to `page_token` in another request to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The tables present in the requested instance. */
  var tables: js.UndefOr[js.Array[Table]] = js.undefined
}
object ListTablesResponse {
  
  inline def apply(): ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesResponse]
  }
  
  extension [Self <: ListTablesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTables(value: js.Array[Table]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: Table*): Self = StObject.set(x, "tables", js.Array(value*))
  }
}
