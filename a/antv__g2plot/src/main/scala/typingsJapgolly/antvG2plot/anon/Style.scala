package typingsJapgolly.antvG2plot.anon

import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var style: ShapeAttrs
}
object Style {
  
  inline def apply(style: ShapeAttrs): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
