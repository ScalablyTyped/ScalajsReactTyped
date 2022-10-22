package typingsJapgolly.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcLinksResponse extends StObject {
  
  /**
    * A collection of VPC links.
    */
  var Items: js.UndefOr[listOfVpcLink] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewayv2Mod.NextToken] = js.undefined
}
object GetVpcLinksResponse {
  
  inline def apply(): GetVpcLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcLinksResponse]
  }
  
  extension [Self <: GetVpcLinksResponse](x: Self) {
    
    inline def setItems(value: listOfVpcLink): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: VpcLink*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
