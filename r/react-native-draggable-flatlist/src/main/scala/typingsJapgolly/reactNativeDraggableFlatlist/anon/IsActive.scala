package typingsJapgolly.reactNativeDraggableFlatlist.anon

import typingsJapgolly.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActive extends StObject {
  
  var isActive: Boolean
  
  var onActiveAnim: Value
}
object IsActive {
  
  inline def apply(isActive: Boolean, onActiveAnim: Value): IsActive = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onActiveAnim = onActiveAnim.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  extension [Self <: IsActive](x: Self) {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setOnActiveAnim(value: Value): Self = StObject.set(x, "onActiveAnim", value.asInstanceOf[js.Any])
  }
}
