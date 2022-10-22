package typingsJapgolly.tabris.anon

import typingsJapgolly.tabris.tabrisStrings.multiple
import typingsJapgolly.tabris.tabrisStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantity extends StObject {
  
  var quantity: js.UndefOr[single | multiple] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Quantity {
  
  inline def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  extension [Self <: Quantity](x: Self) {
    
    inline def setQuantity(value: single | multiple): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
