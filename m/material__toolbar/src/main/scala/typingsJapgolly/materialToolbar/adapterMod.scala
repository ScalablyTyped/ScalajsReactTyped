package typingsJapgolly.materialToolbar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialToolbar.materialToolbarStrings.resize
import typingsJapgolly.materialToolbar.materialToolbarStrings.scroll
import typingsJapgolly.materialToolbar.typesMod.MDCToolbarEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCToolbarAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    @JSName("deregisterScrollHandler")
    def deregisterScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit
    
    def getFirstRowElementOffsetHeight(): Double
    
    def getOffsetHeight(): Double
    
    def getViewportScrollY(): Double
    
    def getViewportWidth(): Double
    
    def hasClass(className: String): Boolean
    
    def notifyChange(evtData: MDCToolbarEventDetail): Unit
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    @JSName("registerScrollHandler")
    def registerScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit
    
    def removeClass(className: String): Unit
    
    def setStyle(property: String, value: String): Unit
    
    def setStyleForFixedAdjustElement(property: String, value: String): Unit
    
    def setStyleForFlexibleRowElement(property: String, value: String): Unit
    
    def setStyleForTitleElement(property: String, value: String): Unit
  }
  object MDCToolbarAdapter {
    
    inline def apply(
      addClass: String => Callback,
      deregisterResizeHandler: SpecificEventListener[resize] => Callback,
      deregisterScrollHandler: SpecificEventListener[scroll] => Callback,
      getFirstRowElementOffsetHeight: CallbackTo[Double],
      getOffsetHeight: CallbackTo[Double],
      getViewportScrollY: CallbackTo[Double],
      getViewportWidth: CallbackTo[Double],
      hasClass: String => Boolean,
      notifyChange: MDCToolbarEventDetail => Callback,
      registerResizeHandler: SpecificEventListener[resize] => Callback,
      registerScrollHandler: SpecificEventListener[scroll] => Callback,
      removeClass: String => Callback,
      setStyle: (String, String) => Callback,
      setStyleForFixedAdjustElement: (String, String) => Callback,
      setStyleForFlexibleRowElement: (String, String) => Callback,
      setStyleForTitleElement: (String, String) => Callback
    ): MDCToolbarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), deregisterResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => deregisterResizeHandler(t0).runNow()), deregisterScrollHandler = js.Any.fromFunction1((t0: SpecificEventListener[scroll]) => deregisterScrollHandler(t0).runNow()), getFirstRowElementOffsetHeight = getFirstRowElementOffsetHeight.toJsFn, getOffsetHeight = getOffsetHeight.toJsFn, getViewportScrollY = getViewportScrollY.toJsFn, getViewportWidth = getViewportWidth.toJsFn, hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1((t0: MDCToolbarEventDetail) => notifyChange(t0).runNow()), registerResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => registerResizeHandler(t0).runNow()), registerScrollHandler = js.Any.fromFunction1((t0: SpecificEventListener[scroll]) => registerScrollHandler(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setStyle = js.Any.fromFunction2((t0: String, t1: String) => (setStyle(t0, t1)).runNow()), setStyleForFixedAdjustElement = js.Any.fromFunction2((t0: String, t1: String) => (setStyleForFixedAdjustElement(t0, t1)).runNow()), setStyleForFlexibleRowElement = js.Any.fromFunction2((t0: String, t1: String) => (setStyleForFlexibleRowElement(t0, t1)).runNow()), setStyleForTitleElement = js.Any.fromFunction2((t0: String, t1: String) => (setStyleForTitleElement(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCToolbarAdapter]
    }
    
    extension [Self <: MDCToolbarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setDeregisterScrollHandler(value: SpecificEventListener[scroll] => Callback): Self = StObject.set(x, "deregisterScrollHandler", js.Any.fromFunction1((t0: SpecificEventListener[scroll]) => value(t0).runNow()))
      
      inline def setGetFirstRowElementOffsetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstRowElementOffsetHeight", value.toJsFn)
      
      inline def setGetOffsetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetHeight", value.toJsFn)
      
      inline def setGetViewportScrollY(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportScrollY", value.toJsFn)
      
      inline def setGetViewportWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportWidth", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyChange(value: MDCToolbarEventDetail => Callback): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1((t0: MDCToolbarEventDetail) => value(t0).runNow()))
      
      inline def setRegisterResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setRegisterScrollHandler(value: SpecificEventListener[scroll] => Callback): Self = StObject.set(x, "registerScrollHandler", js.Any.fromFunction1((t0: SpecificEventListener[scroll]) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStyle(value: (String, String) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleForFixedAdjustElement(value: (String, String) => Callback): Self = StObject.set(x, "setStyleForFixedAdjustElement", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleForFlexibleRowElement(value: (String, String) => Callback): Self = StObject.set(x, "setStyleForFlexibleRowElement", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleForTitleElement(value: (String, String) => Callback): Self = StObject.set(x, "setStyleForTitleElement", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
