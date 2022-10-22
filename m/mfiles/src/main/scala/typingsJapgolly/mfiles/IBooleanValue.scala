package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBooleanValue extends StObject {
  
  def Clone(): IBooleanValue
  
  var Value: Boolean
}
object IBooleanValue {
  
  inline def apply(Clone: CallbackTo[IBooleanValue], Value: Boolean): IBooleanValue = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBooleanValue]
  }
  
  extension [Self <: IBooleanValue](x: Self) {
    
    inline def setClone(value: CallbackTo[IBooleanValue]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
