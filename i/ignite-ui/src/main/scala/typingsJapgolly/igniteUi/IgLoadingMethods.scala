package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLoadingMethods extends StObject {
  
  def destroy(): Unit
  
  def hide(): Unit
  
  def indicator(): Unit
  
  def indicatorElement(): Unit
  
  def refreshPos(): Unit
  
  def show(refresh: js.Object): Unit
}
object IgLoadingMethods {
  
  inline def apply(
    destroy: Callback,
    hide: Callback,
    indicator: Callback,
    indicatorElement: Callback,
    refreshPos: Callback,
    show: js.Object => Callback
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, indicator = indicator.toJsFn, indicatorElement = indicatorElement.toJsFn, refreshPos = refreshPos.toJsFn, show = js.Any.fromFunction1((t0: js.Object) => show(t0).runNow()))
    __obj.asInstanceOf[IgLoadingMethods]
  }
  
  extension [Self <: IgLoadingMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIndicator(value: Callback): Self = StObject.set(x, "indicator", value.toJsFn)
    
    inline def setIndicatorElement(value: Callback): Self = StObject.set(x, "indicatorElement", value.toJsFn)
    
    inline def setRefreshPos(value: Callback): Self = StObject.set(x, "refreshPos", value.toJsFn)
    
    inline def setShow(value: js.Object => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
