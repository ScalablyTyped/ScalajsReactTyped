package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypedLinkFacetNamesResponse extends StObject {
  
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListTypedLinkFacetNamesResponse {
  
  inline def apply(): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
  
  extension [Self <: ListTypedLinkFacetNamesResponse](x: Self) {
    
    inline def setFacetNames(value: TypedLinkNameList): Self = StObject.set(x, "FacetNames", value.asInstanceOf[js.Any])
    
    inline def setFacetNamesUndefined: Self = StObject.set(x, "FacetNames", js.undefined)
    
    inline def setFacetNamesVarargs(value: TypedLinkName*): Self = StObject.set(x, "FacetNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
