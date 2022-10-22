package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'0' | 'DEFAULT', string> */
trait Record0DEFAULTstring extends StObject {
  
  var `0`: String
  
  var DEFAULT: String
}
object Record0DEFAULTstring {
  
  inline def apply(`0`: String, DEFAULT: String): Record0DEFAULTstring = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record0DEFAULTstring]
  }
  
  extension [Self <: Record0DEFAULTstring](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
  }
}
