package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'0' | '10' | '20' | '30' | '40' | '50' | 'auto', string> */
trait Record01020304050autostri extends StObject {
  
  var `0`: String
  
  var `10`: String
  
  var `20`: String
  
  var `30`: String
  
  var `40`: String
  
  var `50`: String
  
  var auto: String
}
object Record01020304050autostri {
  
  inline def apply(`0`: String, `10`: String, `20`: String, `30`: String, `40`: String, `50`: String, auto: String): Record01020304050autostri = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
    __obj.updateDynamic("20")(`20`.asInstanceOf[js.Any])
    __obj.updateDynamic("30")(`30`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record01020304050autostri]
  }
  
  extension [Self <: Record01020304050autostri](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
    
    inline def set20(value: String): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
    
    inline def set30(value: String): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
    
    inline def set40(value: String): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
    
    inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
  }
}
