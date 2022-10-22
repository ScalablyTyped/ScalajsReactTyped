package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'1' | 'auto' | 'initial' | 'none', string> */
trait Record1autoinitialnonestr extends StObject {
  
  var `1`: String
  
  var auto: String
  
  var initial: String
  
  var none: String
}
object Record1autoinitialnonestr {
  
  inline def apply(`1`: String, auto: String, initial: String, none: String): Record1autoinitialnonestr = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record1autoinitialnonestr]
  }
  
  extension [Self <: Record1autoinitialnonestr](x: Self) {
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
