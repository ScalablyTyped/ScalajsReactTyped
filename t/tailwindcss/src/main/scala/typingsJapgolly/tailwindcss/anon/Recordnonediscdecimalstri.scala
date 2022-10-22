package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'none' | 'disc' | 'decimal', string> */
trait Recordnonediscdecimalstri extends StObject {
  
  var decimal: String
  
  var disc: String
  
  var none: String
}
object Recordnonediscdecimalstri {
  
  inline def apply(decimal: String, disc: String, none: String): Recordnonediscdecimalstri = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], disc = disc.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordnonediscdecimalstri]
  }
  
  extension [Self <: Recordnonediscdecimalstri](x: Self) {
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDisc(value: String): Self = StObject.set(x, "disc", value.asInstanceOf[js.Any])
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
