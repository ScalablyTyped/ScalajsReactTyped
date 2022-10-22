package typingsJapgolly.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var mask: MaskedInputStatic
}
object JQueryStatic {
  
  inline def apply(mask: MaskedInputStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setMask(value: MaskedInputStatic): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
