package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var groupComponent: Element
  
  var lineComponent: Element
  
  var role: String
  
  var shapeRendering: String
}
object Role {
  
  inline def apply(groupComponent: VdomElement, lineComponent: VdomElement, role: String, shapeRendering: String): Role = {
    val __obj = js.Dynamic.literal(groupComponent = groupComponent.rawElement.asInstanceOf[js.Any], lineComponent = lineComponent.rawElement.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  extension [Self <: Role](x: Self) {
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLineComponent(value: VdomElement): Self = StObject.set(x, "lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
  }
}
