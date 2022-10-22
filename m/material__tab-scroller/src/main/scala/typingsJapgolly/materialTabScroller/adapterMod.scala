package typingsJapgolly.materialTabScroller

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTabScrollerAdapter extends StObject {
    
    /**
      * Adds the given className to the root element.
      * @param className The className to add
      */
    def addClass(className: String): Unit
    
    /**
      * Adds the given className to the scroll area element.
      * @param className The className to add
      */
    def addScrollAreaClass(className: String): Unit
    
    /**
      * Returns the height of the browser's horizontal scrollbars (in px).
      */
    def computeHorizontalScrollbarHeight(): Double
    
    /**
      * Returns the bounding client rect of the scroll area element.
      */
    def computeScrollAreaClientRect(): DOMRect
    
    /**
      * Returns the bounding client rect of the scroll content element.
      */
    def computeScrollContentClientRect(): DOMRect
    
    /**
      * Returns whether the event target matches given className.
      * @param evtTarget The event target
      * @param selector The selector to check
      */
    def eventTargetMatchesSelector(evtTarget: EventTarget, selector: String): Boolean
    
    /**
      * Returns the offsetWitdth of the scroll area element.
      */
    def getScrollAreaOffsetWidth(): Double
    
    /**
      * Returns the scrollLeft value of the scroll area element.
      */
    def getScrollAreaScrollLeft(): Double
    
    /**
      * Returns the offsetWidth of the scroll content element.
      */
    def getScrollContentOffsetWidth(): Double
    
    /**
      * Returns the scroll content element's computed style value of the given css property `propertyName`.
      * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
      */
    def getScrollContentStyleValue(propertyName: String): String
    
    /**
      * Removes the given className from the root element.
      * @param className The className to remove
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets the scrollLeft value of the scroll area element to the passed value.
      * @param scrollLeft The new scrollLeft value
      */
    def setScrollAreaScrollLeft(scrollLeft: Double): Unit
    
    /**
      * Sets a style property of the area element to the passed value.
      * @param propName The style property name to set
      * @param value The style property value
      */
    def setScrollAreaStyleProperty(propName: String, value: String): Unit
    
    /**
      * Sets a style property of the content element to the passed value.
      * @param propName The style property name to set
      * @param value The style property value
      */
    def setScrollContentStyleProperty(propName: String, value: String): Unit
  }
  object MDCTabScrollerAdapter {
    
    inline def apply(
      addClass: String => Callback,
      addScrollAreaClass: String => Callback,
      computeHorizontalScrollbarHeight: CallbackTo[Double],
      computeScrollAreaClientRect: CallbackTo[DOMRect],
      computeScrollContentClientRect: CallbackTo[DOMRect],
      eventTargetMatchesSelector: (EventTarget, String) => Boolean,
      getScrollAreaOffsetWidth: CallbackTo[Double],
      getScrollAreaScrollLeft: CallbackTo[Double],
      getScrollContentOffsetWidth: CallbackTo[Double],
      getScrollContentStyleValue: String => String,
      removeClass: String => Callback,
      setScrollAreaScrollLeft: Double => Callback,
      setScrollAreaStyleProperty: (String, String) => Callback,
      setScrollContentStyleProperty: (String, String) => Callback
    ): MDCTabScrollerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), addScrollAreaClass = js.Any.fromFunction1((t0: String) => addScrollAreaClass(t0).runNow()), computeHorizontalScrollbarHeight = computeHorizontalScrollbarHeight.toJsFn, computeScrollAreaClientRect = computeScrollAreaClientRect.toJsFn, computeScrollContentClientRect = computeScrollContentClientRect.toJsFn, eventTargetMatchesSelector = js.Any.fromFunction2(eventTargetMatchesSelector), getScrollAreaOffsetWidth = getScrollAreaOffsetWidth.toJsFn, getScrollAreaScrollLeft = getScrollAreaScrollLeft.toJsFn, getScrollContentOffsetWidth = getScrollContentOffsetWidth.toJsFn, getScrollContentStyleValue = js.Any.fromFunction1(getScrollContentStyleValue), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setScrollAreaScrollLeft = js.Any.fromFunction1((t0: Double) => setScrollAreaScrollLeft(t0).runNow()), setScrollAreaStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setScrollAreaStyleProperty(t0, t1)).runNow()), setScrollContentStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setScrollContentStyleProperty(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCTabScrollerAdapter]
    }
    
    extension [Self <: MDCTabScrollerAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddScrollAreaClass(value: String => Callback): Self = StObject.set(x, "addScrollAreaClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setComputeHorizontalScrollbarHeight(value: CallbackTo[Double]): Self = StObject.set(x, "computeHorizontalScrollbarHeight", value.toJsFn)
      
      inline def setComputeScrollAreaClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "computeScrollAreaClientRect", value.toJsFn)
      
      inline def setComputeScrollContentClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "computeScrollContentClientRect", value.toJsFn)
      
      inline def setEventTargetMatchesSelector(value: (EventTarget, String) => Boolean): Self = StObject.set(x, "eventTargetMatchesSelector", js.Any.fromFunction2(value))
      
      inline def setGetScrollAreaOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollAreaOffsetWidth", value.toJsFn)
      
      inline def setGetScrollAreaScrollLeft(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollAreaScrollLeft", value.toJsFn)
      
      inline def setGetScrollContentOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollContentOffsetWidth", value.toJsFn)
      
      inline def setGetScrollContentStyleValue(value: String => String): Self = StObject.set(x, "getScrollContentStyleValue", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetScrollAreaScrollLeft(value: Double => Callback): Self = StObject.set(x, "setScrollAreaScrollLeft", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetScrollAreaStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setScrollAreaStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetScrollContentStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setScrollContentStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
