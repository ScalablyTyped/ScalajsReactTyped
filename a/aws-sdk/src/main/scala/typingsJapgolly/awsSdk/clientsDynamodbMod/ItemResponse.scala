package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemResponse extends StObject {
  
  /**
    * Map of attribute data consisting of the data type and attribute value.
    */
  var Item: js.UndefOr[AttributeMap] = js.undefined
}
object ItemResponse {
  
  inline def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  
  extension [Self <: ItemResponse](x: Self) {
    
    inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
