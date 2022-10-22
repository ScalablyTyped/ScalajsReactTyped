package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amapJsSdk.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBar
  extends StObject
     with EventBindable
     with MapControl {
  
  def doLocation(): Unit
  
  def getLocation(): Lat
  
  def getOffset(): Pixel
  
  def hideDirection(): Unit
  
  def hideLocation(): Unit
  
  def hideRuler(): Unit
  
  def setOffset(offset: Pixel): Unit
  
  def showDirection(): Unit
  
  def showLocation(): Unit
  
  def showRuler(): Unit
}
object ToolBar {
  
  inline def apply(
    doLocation: Callback,
    getLocation: CallbackTo[Lat],
    getOffset: CallbackTo[Pixel],
    hide: Callback,
    hideDirection: Callback,
    hideLocation: Callback,
    hideRuler: Callback,
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    setOffset: Pixel => Callback,
    show: Callback,
    showDirection: Callback,
    showLocation: Callback,
    showRuler: Callback
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = doLocation.toJsFn, getLocation = getLocation.toJsFn, getOffset = getOffset.toJsFn, hide = hide.toJsFn, hideDirection = hideDirection.toJsFn, hideLocation = hideLocation.toJsFn, hideRuler = hideRuler.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), setOffset = js.Any.fromFunction1((t0: Pixel) => setOffset(t0).runNow()), show = show.toJsFn, showDirection = showDirection.toJsFn, showLocation = showLocation.toJsFn, showRuler = showRuler.toJsFn)
    __obj.asInstanceOf[ToolBar]
  }
  
  extension [Self <: ToolBar](x: Self) {
    
    inline def setDoLocation(value: Callback): Self = StObject.set(x, "doLocation", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[Lat]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetOffset(value: CallbackTo[Pixel]): Self = StObject.set(x, "getOffset", value.toJsFn)
    
    inline def setHideDirection(value: Callback): Self = StObject.set(x, "hideDirection", value.toJsFn)
    
    inline def setHideLocation(value: Callback): Self = StObject.set(x, "hideLocation", value.toJsFn)
    
    inline def setHideRuler(value: Callback): Self = StObject.set(x, "hideRuler", value.toJsFn)
    
    inline def setSetOffset(value: Pixel => Callback): Self = StObject.set(x, "setOffset", js.Any.fromFunction1((t0: Pixel) => value(t0).runNow()))
    
    inline def setShowDirection(value: Callback): Self = StObject.set(x, "showDirection", value.toJsFn)
    
    inline def setShowLocation(value: Callback): Self = StObject.set(x, "showLocation", value.toJsFn)
    
    inline def setShowRuler(value: Callback): Self = StObject.set(x, "showRuler", value.toJsFn)
  }
}
