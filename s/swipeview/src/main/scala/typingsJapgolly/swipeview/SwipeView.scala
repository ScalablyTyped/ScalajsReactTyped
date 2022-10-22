package typingsJapgolly.swipeview

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeView extends StObject {
  
  var currentMasterPage: Double
  
  def destroy(): Unit
  
  def goToPage(p: Double): Unit
  
  def handleEvent(e: Event): Unit
  
  var masterPages: js.Array[HTMLElement]
  
  def next(): Unit
  
  def onFlip(fn: js.Function): Unit
  @JSName("onFlip")
  var onFlip_Original: SwipeViewEvent
  
  def onMoveIn(fn: js.Function): Unit
  @JSName("onMoveIn")
  var onMoveIn_Original: SwipeViewEvent
  
  def onMoveOut(fn: js.Function): Unit
  @JSName("onMoveOut")
  var onMoveOut_Original: SwipeViewEvent
  
  def onTouchStart(fn: js.Function): Unit
  @JSName("onTouchStart")
  var onTouchStart_Original: SwipeViewEvent
  
  def prev(): Unit
  
  def refreshSize(): Unit
  
  var slider: HTMLElement
  
  def updatePageCount(n: Double): Unit
  
  var wrapper: HTMLElement
  
  var wrapperHeight: Double
}
object SwipeView {
  
  inline def apply(
    currentMasterPage: Double,
    destroy: Callback,
    goToPage: Double => Callback,
    handleEvent: Event => Callback,
    masterPages: js.Array[HTMLElement],
    next: Callback,
    onFlip: /* fn */ js.Function => Callback,
    onMoveIn: /* fn */ js.Function => Callback,
    onMoveOut: /* fn */ js.Function => Callback,
    onTouchStart: /* fn */ js.Function => Callback,
    prev: Callback,
    refreshSize: Callback,
    slider: HTMLElement,
    updatePageCount: Double => Callback,
    wrapper: HTMLElement,
    wrapperHeight: Double
  ): SwipeView = {
    val __obj = js.Dynamic.literal(currentMasterPage = currentMasterPage.asInstanceOf[js.Any], destroy = destroy.toJsFn, goToPage = js.Any.fromFunction1((t0: Double) => goToPage(t0).runNow()), handleEvent = js.Any.fromFunction1((t0: Event) => handleEvent(t0).runNow()), masterPages = masterPages.asInstanceOf[js.Any], next = next.toJsFn, onFlip = js.Any.fromFunction1((t0: /* fn */ js.Function) => onFlip(t0).runNow()), onMoveIn = js.Any.fromFunction1((t0: /* fn */ js.Function) => onMoveIn(t0).runNow()), onMoveOut = js.Any.fromFunction1((t0: /* fn */ js.Function) => onMoveOut(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: /* fn */ js.Function) => onTouchStart(t0).runNow()), prev = prev.toJsFn, refreshSize = refreshSize.toJsFn, slider = slider.asInstanceOf[js.Any], updatePageCount = js.Any.fromFunction1((t0: Double) => updatePageCount(t0).runNow()), wrapper = wrapper.asInstanceOf[js.Any], wrapperHeight = wrapperHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeView]
  }
  
  extension [Self <: SwipeView](x: Self) {
    
    inline def setCurrentMasterPage(value: Double): Self = StObject.set(x, "currentMasterPage", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGoToPage(value: Double => Callback): Self = StObject.set(x, "goToPage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setHandleEvent(value: Event => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setMasterPages(value: js.Array[HTMLElement]): Self = StObject.set(x, "masterPages", value.asInstanceOf[js.Any])
    
    inline def setMasterPagesVarargs(value: HTMLElement*): Self = StObject.set(x, "masterPages", js.Array(value*))
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setOnFlip(value: /* fn */ js.Function => Callback): Self = StObject.set(x, "onFlip", js.Any.fromFunction1((t0: /* fn */ js.Function) => value(t0).runNow()))
    
    inline def setOnMoveIn(value: /* fn */ js.Function => Callback): Self = StObject.set(x, "onMoveIn", js.Any.fromFunction1((t0: /* fn */ js.Function) => value(t0).runNow()))
    
    inline def setOnMoveOut(value: /* fn */ js.Function => Callback): Self = StObject.set(x, "onMoveOut", js.Any.fromFunction1((t0: /* fn */ js.Function) => value(t0).runNow()))
    
    inline def setOnTouchStart(value: /* fn */ js.Function => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* fn */ js.Function) => value(t0).runNow()))
    
    inline def setPrev(value: Callback): Self = StObject.set(x, "prev", value.toJsFn)
    
    inline def setRefreshSize(value: Callback): Self = StObject.set(x, "refreshSize", value.toJsFn)
    
    inline def setSlider(value: HTMLElement): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageCount(value: Double => Callback): Self = StObject.set(x, "updatePageCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperHeight(value: Double): Self = StObject.set(x, "wrapperHeight", value.asInstanceOf[js.Any])
  }
}
