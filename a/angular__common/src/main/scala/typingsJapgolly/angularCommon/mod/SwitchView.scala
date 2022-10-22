package typingsJapgolly.angularCommon.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchView extends StObject {
  
  /* private */ var _created: Any
  
  /* private */ var _templateRef: Any
  
  /* private */ var _viewContainerRef: Any
  
  def create(): Unit
  
  def destroy(): Unit
  
  def enforceState(created: Boolean): Unit
}
object SwitchView {
  
  inline def apply(
    _created: Any,
    _templateRef: Any,
    _viewContainerRef: Any,
    create: Callback,
    destroy: Callback,
    enforceState: Boolean => Callback
  ): SwitchView = {
    val __obj = js.Dynamic.literal(_created = _created.asInstanceOf[js.Any], _templateRef = _templateRef.asInstanceOf[js.Any], _viewContainerRef = _viewContainerRef.asInstanceOf[js.Any], create = create.toJsFn, destroy = destroy.toJsFn, enforceState = js.Any.fromFunction1((t0: Boolean) => enforceState(t0).runNow()))
    __obj.asInstanceOf[SwitchView]
  }
  
  extension [Self <: SwitchView](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setEnforceState(value: Boolean => Callback): Self = StObject.set(x, "enforceState", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def set_created(value: Any): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_templateRef(value: Any): Self = StObject.set(x, "_templateRef", value.asInstanceOf[js.Any])
    
    inline def set_viewContainerRef(value: Any): Self = StObject.set(x, "_viewContainerRef", value.asInstanceOf[js.Any])
  }
}
