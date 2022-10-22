package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleTextAlign extends StObject {
  
  var style: TextAlign
}
object StyleTextAlign {
  
  inline def apply(style: TextAlign): StyleTextAlign = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleTextAlign]
  }
  
  extension [Self <: StyleTextAlign](x: Self) {
    
    inline def setStyle(value: TextAlign): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
