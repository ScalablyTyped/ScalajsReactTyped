package typingsJapgolly.materialTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialTabs.materialTabsStrings.resize
import typingsJapgolly.materialTabs.tabBarTypesMod.MDCTabBarChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarAdapterMod {
  
  trait MDCTabBarAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def bindOnMDCTabSelectedEvent(): Unit
    
    @JSName("deregisterResizeHandler")
    def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def getComputedLeftForTabAtIndex(index: Double): Double
    
    def getComputedWidthForTabAtIndex(index: Double): Double
    
    def getNumberOfTabs(): Double
    
    def getOffsetWidth(): Double
    
    def getOffsetWidthForIndicator(): Double
    
    def isDefaultPreventedOnClickForTabAtIndex(index: Double): Boolean
    
    def isTabActiveAtIndex(index: Double): Boolean
    
    def measureTabAtIndex(index: Double): Unit
    
    def notifyChange(evtData: MDCTabBarChangeEventDetail): Unit
    
    @JSName("registerResizeHandler")
    def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit
    
    def removeClass(className: String): Unit
    
    def setPreventDefaultOnClickForTabAtIndex(index: Double, preventDefaultOnClick: Boolean): Unit
    
    def setStyleForIndicator(propertyName: String, value: String): Unit
    
    def setTabActiveAtIndex(index: Double, isActive: Boolean): Unit
    
    def unbindOnMDCTabSelectedEvent(): Unit
  }
  object MDCTabBarAdapter {
    
    inline def apply(
      addClass: String => Callback,
      bindOnMDCTabSelectedEvent: Callback,
      deregisterResizeHandler: SpecificEventListener[resize] => Callback,
      getComputedLeftForTabAtIndex: Double => Double,
      getComputedWidthForTabAtIndex: Double => Double,
      getNumberOfTabs: CallbackTo[Double],
      getOffsetWidth: CallbackTo[Double],
      getOffsetWidthForIndicator: CallbackTo[Double],
      isDefaultPreventedOnClickForTabAtIndex: Double => Boolean,
      isTabActiveAtIndex: Double => Boolean,
      measureTabAtIndex: Double => Callback,
      notifyChange: MDCTabBarChangeEventDetail => Callback,
      registerResizeHandler: SpecificEventListener[resize] => Callback,
      removeClass: String => Callback,
      setPreventDefaultOnClickForTabAtIndex: (Double, Boolean) => Callback,
      setStyleForIndicator: (String, String) => Callback,
      setTabActiveAtIndex: (Double, Boolean) => Callback,
      unbindOnMDCTabSelectedEvent: Callback
    ): MDCTabBarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), bindOnMDCTabSelectedEvent = bindOnMDCTabSelectedEvent.toJsFn, deregisterResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => deregisterResizeHandler(t0).runNow()), getComputedLeftForTabAtIndex = js.Any.fromFunction1(getComputedLeftForTabAtIndex), getComputedWidthForTabAtIndex = js.Any.fromFunction1(getComputedWidthForTabAtIndex), getNumberOfTabs = getNumberOfTabs.toJsFn, getOffsetWidth = getOffsetWidth.toJsFn, getOffsetWidthForIndicator = getOffsetWidthForIndicator.toJsFn, isDefaultPreventedOnClickForTabAtIndex = js.Any.fromFunction1(isDefaultPreventedOnClickForTabAtIndex), isTabActiveAtIndex = js.Any.fromFunction1(isTabActiveAtIndex), measureTabAtIndex = js.Any.fromFunction1((t0: Double) => measureTabAtIndex(t0).runNow()), notifyChange = js.Any.fromFunction1((t0: MDCTabBarChangeEventDetail) => notifyChange(t0).runNow()), registerResizeHandler = js.Any.fromFunction1((t0: SpecificEventListener[resize]) => registerResizeHandler(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setPreventDefaultOnClickForTabAtIndex = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setPreventDefaultOnClickForTabAtIndex(t0, t1)).runNow()), setStyleForIndicator = js.Any.fromFunction2((t0: String, t1: String) => (setStyleForIndicator(t0, t1)).runNow()), setTabActiveAtIndex = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setTabActiveAtIndex(t0, t1)).runNow()), unbindOnMDCTabSelectedEvent = unbindOnMDCTabSelectedEvent.toJsFn)
      __obj.asInstanceOf[MDCTabBarAdapter]
    }
    
    extension [Self <: MDCTabBarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setBindOnMDCTabSelectedEvent(value: Callback): Self = StObject.set(x, "bindOnMDCTabSelectedEvent", value.toJsFn)
      
      inline def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setGetComputedLeftForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedLeftForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetComputedWidthForTabAtIndex(value: Double => Double): Self = StObject.set(x, "getComputedWidthForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetNumberOfTabs(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfTabs", value.toJsFn)
      
      inline def setGetOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidth", value.toJsFn)
      
      inline def setGetOffsetWidthForIndicator(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidthForIndicator", value.toJsFn)
      
      inline def setIsDefaultPreventedOnClickForTabAtIndex(value: Double => Boolean): Self = StObject.set(x, "isDefaultPreventedOnClickForTabAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsTabActiveAtIndex(value: Double => Boolean): Self = StObject.set(x, "isTabActiveAtIndex", js.Any.fromFunction1(value))
      
      inline def setMeasureTabAtIndex(value: Double => Callback): Self = StObject.set(x, "measureTabAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setNotifyChange(value: MDCTabBarChangeEventDetail => Callback): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1((t0: MDCTabBarChangeEventDetail) => value(t0).runNow()))
      
      inline def setRegisterResizeHandler(value: SpecificEventListener[resize] => Callback): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1((t0: SpecificEventListener[resize]) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetPreventDefaultOnClickForTabAtIndex(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setPreventDefaultOnClickForTabAtIndex", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleForIndicator(value: (String, String) => Callback): Self = StObject.set(x, "setStyleForIndicator", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetTabActiveAtIndex(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setTabActiveAtIndex", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setUnbindOnMDCTabSelectedEvent(value: Callback): Self = StObject.set(x, "unbindOnMDCTabSelectedEvent", value.toJsFn)
    }
  }
}
