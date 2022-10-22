package typingsJapgolly.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  /**
    * The list of available extensions. The list includes Amazon Web Services-authored and user-created extensions.
    */
  var Items: js.UndefOr[ExtensionSummaries] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object Extensions {
  
  inline def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setItems(value: ExtensionSummaries): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ExtensionSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
