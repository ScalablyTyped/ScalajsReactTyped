package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'0' | '2' | '4' | '8' | 'DEFAULT', string> */
trait Record0248DEFAULTstring extends StObject {
  
  var `0`: String
  
  var `2`: String
  
  var `4`: String
  
  var `8`: String
  
  var DEFAULT: String
}
object Record0248DEFAULTstring {
  
  inline def apply(`0`: String, `2`: String, `4`: String, `8`: String, DEFAULT: String): Record0248DEFAULTstring = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record0248DEFAULTstring]
  }
  
  extension [Self <: Record0248DEFAULTstring](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
  }
}
