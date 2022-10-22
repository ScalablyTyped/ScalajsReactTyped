package typingsJapgolly.smoothScrollbar

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesTrackMod {
  
  trait ScrollbarThumb extends StObject {
    
    def attachTo(track: HTMLElement): Unit
    
    var displaySize: Double
    
    val element: HTMLElement
    
    var offset: Double
    
    var realSize: Double
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
  }
  object ScrollbarThumb {
    
    inline def apply(
      attachTo: HTMLElement => Callback,
      displaySize: Double,
      element: HTMLElement,
      offset: Double,
      realSize: Double,
      update: (Double, Double, Double) => Callback
    ): ScrollbarThumb = {
      val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1((t0: HTMLElement) => attachTo(t0).runNow()), displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (update(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ScrollbarThumb]
    }
    
    extension [Self <: ScrollbarThumb](x: Self) {
      
      inline def setAttachTo(value: HTMLElement => Callback): Self = StObject.set(x, "attachTo", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setDisplaySize(value: Double): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRealSize(value: Double): Self = StObject.set(x, "realSize", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait ScrollbarTrack extends StObject {
    
    def attachTo(container: HTMLElement): Unit
    
    val element: HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
    
    val thumb: ScrollbarThumb
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
  }
  object ScrollbarTrack {
    
    inline def apply(
      attachTo: HTMLElement => Callback,
      element: HTMLElement,
      hide: Callback,
      show: Callback,
      thumb: ScrollbarThumb,
      update: (Double, Double, Double) => Callback
    ): ScrollbarTrack = {
      val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1((t0: HTMLElement) => attachTo(t0).runNow()), element = element.asInstanceOf[js.Any], hide = hide.toJsFn, show = show.toJsFn, thumb = thumb.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (update(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ScrollbarTrack]
    }
    
    extension [Self <: ScrollbarTrack](x: Self) {
      
      inline def setAttachTo(value: HTMLElement => Callback): Self = StObject.set(x, "attachTo", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setThumb(value: ScrollbarThumb): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait TrackController extends StObject {
    
    def autoHideOnIdle(): Unit
    
    def update(): Unit
    
    val xAxis: ScrollbarTrack
    
    val yAxis: ScrollbarTrack
  }
  object TrackController {
    
    inline def apply(autoHideOnIdle: Callback, update: Callback, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
      val __obj = js.Dynamic.literal(autoHideOnIdle = autoHideOnIdle.toJsFn, update = update.toJsFn, xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackController]
    }
    
    extension [Self <: TrackController](x: Self) {
      
      inline def setAutoHideOnIdle(value: Callback): Self = StObject.set(x, "autoHideOnIdle", value.toJsFn)
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setXAxis(value: ScrollbarTrack): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxis(value: ScrollbarTrack): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    }
  }
}
