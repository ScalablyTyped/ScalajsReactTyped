package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActiveIsHovered extends StObject {
  
  var isActive: Boolean
  
  var isHovered: Boolean
}
object IsActiveIsHovered {
  
  inline def apply(isActive: Boolean, isHovered: Boolean): IsActiveIsHovered = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActiveIsHovered]
  }
  
  extension [Self <: IsActiveIsHovered](x: Self) {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
