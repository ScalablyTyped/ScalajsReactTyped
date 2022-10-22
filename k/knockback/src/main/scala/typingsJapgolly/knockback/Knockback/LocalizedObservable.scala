package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedObservable extends StObject {
  
  def destroy(): Any
  
  def observedValue(value: Any): Any
  
  def resetToCurrent(): Any
}
object LocalizedObservable {
  
  inline def apply(destroy: CallbackTo[Any], observedValue: Any => Any, resetToCurrent: CallbackTo[Any]): LocalizedObservable = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, observedValue = js.Any.fromFunction1(observedValue), resetToCurrent = resetToCurrent.toJsFn)
    __obj.asInstanceOf[LocalizedObservable]
  }
  
  extension [Self <: LocalizedObservable](x: Self) {
    
    inline def setDestroy(value: CallbackTo[Any]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setObservedValue(value: Any => Any): Self = StObject.set(x, "observedValue", js.Any.fromFunction1(value))
    
    inline def setResetToCurrent(value: CallbackTo[Any]): Self = StObject.set(x, "resetToCurrent", value.toJsFn)
  }
}
