package typingsJapgolly.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypesResponse extends StObject {
  
  /**
    * An identifier to pass in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Type objects.
    */
  var types: js.UndefOr[TypeList] = js.undefined
}
object ListTypesResponse {
  
  inline def apply(): ListTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypesResponse]
  }
  
  extension [Self <: ListTypesResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTypes(value: TypeList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
