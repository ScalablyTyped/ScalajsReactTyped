package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorChangeParams extends StObject {
  
  var originalEvent: ReactEventFrom[Element]
  
  def preventDefault(): Unit
  
  def stopPropagation(): Unit
  
  var target: PaginatorChangeTargetOptions
  
  var value: js.UndefOr[String | Null] = js.undefined
}
object PaginatorChangeParams {
  
  inline def apply(
    originalEvent: ReactEventFrom[Element],
    preventDefault: Callback,
    stopPropagation: Callback,
    target: PaginatorChangeTargetOptions
  ): PaginatorChangeParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorChangeParams]
  }
  
  extension [Self <: PaginatorChangeParams](x: Self) {
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    inline def setTarget(value: PaginatorChangeTargetOptions): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
