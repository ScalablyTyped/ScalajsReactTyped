package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgZoomSliderMethods extends StObject {
  
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Flushes the gauge.
    */
  def flush(): Unit
  
  def notifySizeChanged(): Unit
  
  def onAttachedToUI(): Unit
  
  def onDetachedFromUI(): Unit
}
object IgZoomSliderMethods {
  
  inline def apply(
    destroy: Callback,
    flush: Callback,
    notifySizeChanged: Callback,
    onAttachedToUI: Callback,
    onDetachedFromUI: Callback
  ): IgZoomSliderMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, flush = flush.toJsFn, notifySizeChanged = notifySizeChanged.toJsFn, onAttachedToUI = onAttachedToUI.toJsFn, onDetachedFromUI = onDetachedFromUI.toJsFn)
    __obj.asInstanceOf[IgZoomSliderMethods]
  }
  
  extension [Self <: IgZoomSliderMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setNotifySizeChanged(value: Callback): Self = StObject.set(x, "notifySizeChanged", value.toJsFn)
    
    inline def setOnAttachedToUI(value: Callback): Self = StObject.set(x, "onAttachedToUI", value.toJsFn)
    
    inline def setOnDetachedFromUI(value: Callback): Self = StObject.set(x, "onDetachedFromUI", value.toJsFn)
  }
}
