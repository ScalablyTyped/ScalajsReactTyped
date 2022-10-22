package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'1' | '2' | '3' | '4' | '5' | '6' | 'none', string> */
trait Record123456nonestring extends StObject {
  
  var `1`: String
  
  var `2`: String
  
  var `3`: String
  
  var `4`: String
  
  var `5`: String
  
  var `6`: String
  
  var none: String
}
object Record123456nonestring {
  
  inline def apply(`1`: String, `2`: String, `3`: String, `4`: String, `5`: String, `6`: String, none: String): Record123456nonestring = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record123456nonestring]
  }
  
  extension [Self <: Record123456nonestring](x: Self) {
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
