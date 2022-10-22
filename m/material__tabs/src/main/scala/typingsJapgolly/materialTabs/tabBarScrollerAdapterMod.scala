package typingsJapgolly.materialTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialTabs.materialTabsStrings.click
import typingsJapgolly.materialTabs.materialTabsStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarScrollerAdapterMod {
  
  trait MDCTabBarScrollerAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def addClassToBackIndicator(className: String): Unit
    
    def addClassToForwardIndicator(className: String): Unit
    
    @JSName("deregisterBackIndicatorClickHandler")
    def deregisterBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    def deregisterCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit
    
    @JSName("deregisterForwardIndicatorClickHandler")
    def deregisterForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    @JSName("deregisterWindowResizeHandler")
    def deregisterWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def eventTargetHasClass(target: Element, className: String): Boolean
    
    def getComputedLeftForTabAtIndex(index: Double): Double
    
    def getComputedWidthForTabAtIndex(index: Double): Double
    
    def getNumberOfTabs(): Double
    
    def getOffsetLeftForEventTarget(target: HTMLElement): Double
    
    def getOffsetWidthForEventTarget(target: HTMLElement): Double
    
    def getOffsetWidthForScrollFrame(): Double
    
    def getOffsetWidthForTabBar(): Double
    
    def getScrollLeftForScrollFrame(): Double
    
    def isRTL(): Boolean
    
    @JSName("registerBackIndicatorClickHandler")
    def registerBackIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    def registerCapturedInteractionHandler[K /* <: EventType */](evt: K, handler: SpecificEventListener[K]): Unit
    
    @JSName("registerForwardIndicatorClickHandler")
    def registerForwardIndicatorClickHandler_click(handler: SpecificEventListener[click]): Unit
    
    @JSName("registerWindowResizeHandler")
    def registerWindowResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def removeClass(className: String): Unit
    
    def removeClassFromBackIndicator(className: String): Unit
    
    def removeClassFromForwardIndicator(className: String): Unit
    
    def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit
    
    def setTransformStyleForTabBar(value: String): Unit
  }
  object MDCTabBarScrollerAdapter {
    
    inline def apply(
      addClass: String => Callback,
      addClassToBackIndicator: String => Callback,
      addClassToForwardIndicator: String => Callback,
      deregisterBackIndicatorClickHandler: SpecificEventListener[click] => Callback,
      deregisterCapturedInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterForwardIndicatorClickHandler: SpecificEventListener[click] => Callback,
      deregisterWindowResizeHandler: SpecificEventListener[resize] => Callback,
      eventTargetHasClass: (Element, String) => Boolean,
      getComputedLeftForTabAtIndex: Double => Double,
      getComputedWidthForTabAtIndex: Double => Double,
      getNumberOfTabs: CallbackTo[Double],
      getOffsetLeftForEventTarget: HTMLElement => Double,
      getOffsetWidthForEventTarget: HTMLElement => Double,
      getOffsetWidthForScrollFrame: CallbackTo[Double],
      getOffsetWidthForTabBar: CallbackTo[Double],
      getScrollLeftForScrollFrame: CallbackTo[Double],
      isRTL: CallbackTo[Boolean],
      registerBackIndicatorClickHandler: SpecificEventListener[click] => Callback,
      registerCapturedInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerForwardIndicatorClickHandler: SpecificEventListener[click] => Callback,
      registerWindowResizeHandler: SpecificEventListener[resize] => Callback,
      removeClass: String => Callback,
      removeClassFromBackIndicator: String => Callback,
      removeClassFromForwardIndicator: String => Callback,
      setScrollLeftForScrollFrame: Double => Callback,
      setTransformStyleForTabBar: String => Callback
    ): MDCTabBarScrollerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), addClassToBackIndicator = js.Any.fromFunction1((t0: String) => addClassToBackIndicator(t0).runNow()), addClassToForwardIndicator = js.Any.fromFunction1((t0: String) => addClassToForwardIndicator(t0).runNow()), deregisterBackIndicatorClickHandler = js.Any.fromFunction1((t0: SpecificEventListener[click]) => deregisterBackIndicatorClickHandler(t0).runNow()), deregisterCapturedInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterCapturedInteractionHandler(t0, t1)).runNow()), deregisterForwardIndicatorClickHandler = js.Any.fromFunction1((t0: SpecificEventListener[click]) => deregisterForwardIndicatorClickHandler(t0).runNow()), deregisterWindowResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => deregisterWindowResizeHandler(t0).runNow()), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = getNumberOfTabs.toJsFn, getOffsetLeftForEventTarget = js.Any.fromFunction1(getOffsetLeftForEventTarget), getOffsetWidthForEventTarget = js.Any.fromFunction1(getOffsetWidthForEventTarget), getOffsetWidthForScrollFrame = getOffsetWidthForScrollFrame.toJsFn, getOffsetWidthForTabBar = getOffsetWidthForTabBar.toJsFn, getScrollLeftForScrollFrame = getScrollLeftForScrollFrame.toJsFn, isRTL = isRTL.toJsFn, registerBackIndicatorClickHandler = js.Any.fromFunction1((t0: SpecificEventListener[click]) => registerBackIndicatorClickHandler(t0).runNow()), registerCapturedInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerCapturedInteractionHandler(t0, t1)).runNow()), registerForwardIndicatorClickHandler = js.Any.fromFunction1((t0: SpecificEventListener[click]) => registerForwardIndicatorClickHandler(t0).runNow()), registerWindowResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => registerWindowResizeHandler(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeClassFromBackIndicator = js.Any.fromFunction1((t0: String) => removeClassFromBackIndicator(t0).runNow()), removeClassFromForwardIndicator = js.Any.fromFunction1((t0: String) => removeClassFromForwardIndicator(t0).runNow()), setScrollLeftForScrollFrame = js.Any.fromFunction1((t0: Double) => setScrollLeftForScrollFrame(t0).runNow()), setTransformStyleForTabBar = js.Any.fromFunction1((t0: String) => setTransformStyleForTabBar(t0).runNow()))
      __obj.asInstanceOf[MDCTabBarScrollerAdapter]
    }
    
    extension [Self <: MDCTabBarScrollerAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddClassToBackIndicator(value: String => Callback): Self = StObject.set(x, "addClassToBackIndicator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddClassToForwardIndicator(value: String => Callback): Self = StObject.set(x, "addClassToForwardIndicator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Callback): Self = StObject.set(x, "deregisterBackIndicatorClickHandler", js.Any.fromFunction1((t0: SpecificEventListener[click]) => value(t0).runNow()))
      
      inline def setDeregisterCapturedInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterCapturedInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Callback): Self = StObject.set(x, "deregisterForwardIndicatorClickHandler", js.Any.fromFunction1((t0: SpecificEventListener[click]) => value(t0).runNow()))
      
      inline def setDeregisterWindowResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "deregisterWindowResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setEventTargetHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "eventTargetHasClass", js.Any.fromFunction2(value))
      
      inline def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetNumberOfTabs(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfTabs", value.toJsFn)
      
      inline def setGetOffsetLeftForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetLeftForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForEventTarget(value: HTMLElement => Double): Self = StObject.set(x, "getOffsetWidthForEventTarget", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForScrollFrame(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidthForScrollFrame", value.toJsFn)
      
      inline def setGetOffsetWidthForTabBar(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidthForTabBar", value.toJsFn)
      
      inline def setGetScrollLeftForScrollFrame(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollLeftForScrollFrame", value.toJsFn)
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setRegisterBackIndicatorClickHandler(value: SpecificEventListener[click] => Callback): Self = StObject.set(x, "registerBackIndicatorClickHandler", js.Any.fromFunction1((t0: SpecificEventListener[click]) => value(t0).runNow()))
      
      inline def setRegisterCapturedInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerCapturedInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterForwardIndicatorClickHandler(value: SpecificEventListener[click] => Callback): Self = StObject.set(x, "registerForwardIndicatorClickHandler", js.Any.fromFunction1((t0: SpecificEventListener[click]) => value(t0).runNow()))
      
      inline def setRegisterWindowResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "registerWindowResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClassFromBackIndicator(value: String => Callback): Self = StObject.set(x, "removeClassFromBackIndicator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClassFromForwardIndicator(value: String => Callback): Self = StObject.set(x, "removeClassFromForwardIndicator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetScrollLeftForScrollFrame(value: Double => Callback): Self = StObject.set(x, "setScrollLeftForScrollFrame", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetTransformStyleForTabBar(value: String => Callback): Self = StObject.set(x, "setTransformStyleForTabBar", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
