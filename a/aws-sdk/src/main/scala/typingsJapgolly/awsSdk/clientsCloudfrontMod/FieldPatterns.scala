package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPatterns extends StObject {
  
  /**
    * An array of the field-level encryption field patterns.
    */
  var Items: js.UndefOr[FieldPatternList] = js.undefined
  
  /**
    * The number of field-level encryption field patterns.
    */
  var Quantity: integer
}
object FieldPatterns {
  
  inline def apply(Quantity: integer): FieldPatterns = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPatterns]
  }
  
  extension [Self <: FieldPatterns](x: Self) {
    
    inline def setItems(value: FieldPatternList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
