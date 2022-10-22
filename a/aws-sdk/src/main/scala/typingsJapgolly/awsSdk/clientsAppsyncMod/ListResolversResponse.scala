package typingsJapgolly.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolversResponse extends StObject {
  
  /**
    * An identifier to pass in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Resolver objects.
    */
  var resolvers: js.UndefOr[Resolvers] = js.undefined
}
object ListResolversResponse {
  
  inline def apply(): ListResolversResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolversResponse]
  }
  
  extension [Self <: ListResolversResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResolvers(value: Resolvers): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
    
    inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    
    inline def setResolversVarargs(value: Resolver*): Self = StObject.set(x, "resolvers", js.Array(value*))
  }
}
