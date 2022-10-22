package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBar extends StObject {
  
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double
  
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: Any): Unit
  
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: Double): Unit
  
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: Double): Unit
  
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: Double): Unit
}
object ScrollBar {
  
  inline def apply(
    getWidth: CallbackTo[Double],
    onScroll: Any => Callback,
    setHeight: Double => Callback,
    setInnerHeight: Double => Callback,
    setScrollTop: Double => Callback
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(getWidth = getWidth.toJsFn, onScroll = js.Any.fromFunction1((t0: Any) => onScroll(t0).runNow()), setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setInnerHeight = js.Any.fromFunction1((t0: Double) => setInnerHeight(t0).runNow()), setScrollTop = js.Any.fromFunction1((t0: Double) => setScrollTop(t0).runNow()))
    __obj.asInstanceOf[ScrollBar]
  }
  
  extension [Self <: ScrollBar](x: Self) {
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setOnScroll(value: Any => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetInnerHeight(value: Double => Callback): Self = StObject.set(x, "setInnerHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetScrollTop(value: Double => Callback): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
