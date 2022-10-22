package typingsJapgolly.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  var padding: Double
  
  var style: StrokeString
}
object Padding {
  
  inline def apply(padding: Double, style: StrokeString): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: StrokeString): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
