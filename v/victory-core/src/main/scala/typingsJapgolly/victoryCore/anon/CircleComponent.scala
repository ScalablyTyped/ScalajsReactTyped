package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleComponent extends StObject {
  
  var circleComponent: Element
  
  var rectComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object CircleComponent {
  
  inline def apply(circleComponent: VdomElement, rectComponent: VdomElement, role: String, shapeRendering: String): CircleComponent = {
    val __obj = js.Dynamic.literal(circleComponent = circleComponent.rawElement.asInstanceOf[js.Any], rectComponent = rectComponent.rawElement.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleComponent]
  }
  
  extension [Self <: CircleComponent](x: Self) {
    
    inline def setCircleComponent(value: VdomElement): Self = StObject.set(x, "circleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRectComponent(value: VdomElement): Self = StObject.set(x, "rectComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
