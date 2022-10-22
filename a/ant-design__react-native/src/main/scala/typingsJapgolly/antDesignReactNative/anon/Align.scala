package typingsJapgolly.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: String
  
  var direction: String
  
  var justify: String
  
  var wrap: String
}
object Align {
  
  inline def apply(align: String, direction: String, justify: String, wrap: String): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], justify = justify.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setJustify(value: String): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
