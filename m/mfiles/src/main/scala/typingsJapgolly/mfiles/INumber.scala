package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumber extends StObject {
  
  def Clone(): INumber
  
  var Value: Double
}
object INumber {
  
  inline def apply(Clone: CallbackTo[INumber], Value: Double): INumber = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
  
  extension [Self <: INumber](x: Self) {
    
    inline def setClone(value: CallbackTo[INumber]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
