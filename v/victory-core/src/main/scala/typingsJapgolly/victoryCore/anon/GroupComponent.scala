package typingsJapgolly.victoryCore.anon

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponent extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var groupComponent: Requireable[ReactElementLike]
}
object GroupComponent {
  
  inline def apply(children: Requireable[ReactNodeLike], groupComponent: Requireable[ReactElementLike]): GroupComponent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponent]
  }
  
  extension [Self <: GroupComponent](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
  }
}
