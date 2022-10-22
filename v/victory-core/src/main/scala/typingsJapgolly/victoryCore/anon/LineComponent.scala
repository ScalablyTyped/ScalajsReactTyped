package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineComponent extends StObject {
  
  var lineComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object LineComponent {
  
  inline def apply(lineComponent: VdomElement, role: String, shapeRendering: String): LineComponent = {
    val __obj = js.Dynamic.literal(lineComponent = lineComponent.rawElement.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineComponent]
  }
  
  extension [Self <: LineComponent](x: Self) {
    
    inline def setLineComponent(value: VdomElement): Self = StObject.set(x, "lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
