package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'0' | '1' | '2', string> */
trait Record012string extends StObject {
  
  var `0`: String
  
  var `1`: String
  
  var `2`: String
}
object Record012string {
  
  inline def apply(`0`: String, `1`: String, `2`: String): Record012string = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record012string]
  }
  
  extension [Self <: Record012string](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
  }
}
