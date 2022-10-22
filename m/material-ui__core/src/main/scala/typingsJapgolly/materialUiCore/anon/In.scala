package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  var in: Boolean
  
  def onEnter(): js.Object
  
  def onExited(): js.Object
}
object In {
  
  inline def apply(in: Boolean, onEnter: CallbackTo[js.Object], onExited: CallbackTo[js.Object]): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onEnter = onEnter.toJsFn, onExited = onExited.toJsFn)
    __obj.asInstanceOf[In]
  }
  
  extension [Self <: In](x: Self) {
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setOnEnter(value: CallbackTo[js.Object]): Self = StObject.set(x, "onEnter", value.toJsFn)
    
    inline def setOnExited(value: CallbackTo[js.Object]): Self = StObject.set(x, "onExited", value.toJsFn)
  }
}
