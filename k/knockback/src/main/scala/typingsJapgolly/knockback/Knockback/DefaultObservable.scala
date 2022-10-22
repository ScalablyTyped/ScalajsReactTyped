package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultObservable
  extends StObject
     with Destroyable {
  
  def setToDefault(): Any
}
object DefaultObservable {
  
  inline def apply(destroy: CallbackTo[Any], setToDefault: CallbackTo[Any]): DefaultObservable = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, setToDefault = setToDefault.toJsFn)
    __obj.asInstanceOf[DefaultObservable]
  }
  
  extension [Self <: DefaultObservable](x: Self) {
    
    inline def setSetToDefault(value: CallbackTo[Any]): Self = StObject.set(x, "setToDefault", value.toJsFn)
  }
}
