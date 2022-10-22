package typingsJapgolly.pixiLoaders.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  */
trait SignalBinding[CbType] extends StObject {
  
  var _fn: Any
  
  var _next: SignalBinding[CbType]
  
  var _once: Boolean
  
  var _owner: Signal[CbType]
  
  var _prev: SignalBinding[CbType]
  
  var _thisArg: Any
  
  def detach(): Boolean
}
object SignalBinding {
  
  inline def apply[CbType](
    _fn: Any,
    _next: SignalBinding[CbType],
    _once: Boolean,
    _owner: Signal[CbType],
    _prev: SignalBinding[CbType],
    _thisArg: Any,
    detach: CallbackTo[Boolean]
  ): SignalBinding[CbType] = {
    val __obj = js.Dynamic.literal(_fn = _fn.asInstanceOf[js.Any], _next = _next.asInstanceOf[js.Any], _once = _once.asInstanceOf[js.Any], _owner = _owner.asInstanceOf[js.Any], _prev = _prev.asInstanceOf[js.Any], _thisArg = _thisArg.asInstanceOf[js.Any], detach = detach.toJsFn)
    __obj.asInstanceOf[SignalBinding[CbType]]
  }
  
  extension [Self <: SignalBinding[?], CbType](x: Self & SignalBinding[CbType]) {
    
    inline def setDetach(value: CallbackTo[Boolean]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def set_fn(value: Any): Self = StObject.set(x, "_fn", value.asInstanceOf[js.Any])
    
    inline def set_next(value: SignalBinding[CbType]): Self = StObject.set(x, "_next", value.asInstanceOf[js.Any])
    
    inline def set_once(value: Boolean): Self = StObject.set(x, "_once", value.asInstanceOf[js.Any])
    
    inline def set_owner(value: Signal[CbType]): Self = StObject.set(x, "_owner", value.asInstanceOf[js.Any])
    
    inline def set_prev(value: SignalBinding[CbType]): Self = StObject.set(x, "_prev", value.asInstanceOf[js.Any])
    
    inline def set_thisArg(value: Any): Self = StObject.set(x, "_thisArg", value.asInstanceOf[js.Any])
  }
}
