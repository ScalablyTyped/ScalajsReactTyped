package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetTop extends StObject {
  
  var offsetHeight: Unit
  
  var offsetLeft: Any
  
  var offsetTop: Unit
  
  var offsetWidth: Any
}
object OffsetTop {
  
  inline def apply(offsetHeight: Unit, offsetLeft: Any, offsetTop: Unit, offsetWidth: Any): OffsetTop = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetTop]
  }
  
  extension [Self <: OffsetTop](x: Self) {
    
    inline def setOffsetHeight(value: Unit): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeft(value: Any): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetTop(value: Unit): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetWidth(value: Any): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
  }
}
