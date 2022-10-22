package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetLeft extends StObject {
  
  var offsetHeight: Any
  
  var offsetLeft: Unit
  
  var offsetTop: Any
  
  var offsetWidth: Unit
}
object OffsetLeft {
  
  inline def apply(offsetHeight: Any, offsetLeft: Unit, offsetTop: Any, offsetWidth: Unit): OffsetLeft = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetLeft]
  }
  
  extension [Self <: OffsetLeft](x: Self) {
    
    inline def setOffsetHeight(value: Any): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeft(value: Unit): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetTop(value: Any): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetWidth(value: Unit): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
  }
}
