package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathComponent extends StObject {
  
  var pathComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object PathComponent {
  
  inline def apply(pathComponent: VdomElement, role: String, shapeRendering: String): PathComponent = {
    val __obj = js.Dynamic.literal(pathComponent = pathComponent.rawElement.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathComponent]
  }
  
  extension [Self <: PathComponent](x: Self) {
    
    inline def setPathComponent(value: VdomElement): Self = StObject.set(x, "pathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
