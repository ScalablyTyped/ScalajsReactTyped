package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuthorizersResponse extends StObject {
  
  /**
    * The authorizers.
    */
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListAuthorizersResponse {
  
  inline def apply(): ListAuthorizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizersResponse]
  }
  
  extension [Self <: ListAuthorizersResponse](x: Self) {
    
    inline def setAuthorizers(value: Authorizers): Self = StObject.set(x, "authorizers", value.asInstanceOf[js.Any])
    
    inline def setAuthorizersUndefined: Self = StObject.set(x, "authorizers", js.undefined)
    
    inline def setAuthorizersVarargs(value: AuthorizerSummary*): Self = StObject.set(x, "authorizers", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
