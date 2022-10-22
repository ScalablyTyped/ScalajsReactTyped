package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'none', string> */
trait Recordnonestring extends StObject {
  
  var none: String
}
object Recordnonestring {
  
  inline def apply(none: String): Recordnonestring = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordnonestring]
  }
  
  extension [Self <: Recordnonestring](x: Self) {
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
