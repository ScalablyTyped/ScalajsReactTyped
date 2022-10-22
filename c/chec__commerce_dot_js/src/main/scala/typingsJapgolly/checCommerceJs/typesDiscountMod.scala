package typingsJapgolly.checCommerceJs

import typingsJapgolly.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDiscountMod {
  
  trait Discount extends StObject {
    
    var amount_saved: Price
    
    var code: String
    
    var `type`: DiscountType
    
    var valid: Boolean
    
    var value: Double
  }
  object Discount {
    
    inline def apply(amount_saved: Price, code: String, `type`: DiscountType, valid: Boolean, value: Double): Discount = {
      val __obj = js.Dynamic.literal(amount_saved = amount_saved.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Discount]
    }
    
    extension [Self <: Discount](x: Self) {
      
      inline def setAmount_saved(value: Price): Self = StObject.set(x, "amount_saved", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setType(value: DiscountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.percentage
    - typingsJapgolly.checCommerceJs.checCommerceJsStrings.fixed
  */
  trait DiscountType extends StObject
  object DiscountType {
    
    inline def fixed: typingsJapgolly.checCommerceJs.checCommerceJsStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.fixed]
    
    inline def percentage: typingsJapgolly.checCommerceJs.checCommerceJsStrings.percentage = "percentage".asInstanceOf[typingsJapgolly.checCommerceJs.checCommerceJsStrings.percentage]
  }
}
