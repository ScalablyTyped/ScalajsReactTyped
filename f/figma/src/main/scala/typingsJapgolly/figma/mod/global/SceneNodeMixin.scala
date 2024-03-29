package typingsJapgolly.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneNodeMixin extends StObject {
  
  var locked: Boolean
  
  var visible: Boolean
}
object SceneNodeMixin {
  
  inline def apply(locked: Boolean, visible: Boolean): SceneNodeMixin = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneNodeMixin]
  }
  
  extension [Self <: SceneNodeMixin](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
