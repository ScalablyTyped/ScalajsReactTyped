package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sparklines extends StObject {
  
  var paddingX: Double
  
  var paddingY: Double
  
  var radius: Double
  
  def template(item: Any, common: String, data: js.Array[Any], column: Any, index: Double): String
}
object Sparklines {
  
  @JSImport("webix", "Sparklines")
  @js.native
  val ^ : Sparklines = js.native
  
  extension [Self <: Sparklines](x: Self) {
    
    inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: (Any, String, js.Array[Any], Any, Double) => String): Self = StObject.set(x, "template", js.Any.fromFunction5(value))
  }
}
