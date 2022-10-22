package typingsJapgolly.materialTooltip

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialTooltip.anon.Height
import typingsJapgolly.materialTooltip.constantsMod.CssClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTooltipAdapter extends StObject {
    
    /**
      * Adds a class onto the root element.
      */
    def addClass(className: CssClasses): Unit
    
    /**
      * Checks if element is contained within the anchor element.
      */
    def anchorContainsElement(element: HTMLElement): Boolean
    
    /**
      * Clears all inline styles set on the caret-top and caret-bottom elements.
      */
    def clearTooltipCaretStyles(): Unit
    
    /**
      * Deregisters an event listener to the anchor element.
      */
    def deregisterAnchorEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the document body.
      */
    def deregisterDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the root element.
      */
    def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener to the window.
      */
    def deregisterWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Sets focus on the anchor element.
      */
    def focusAnchorElement(): Unit
    
    /**
      * @return the active element of the document that owns the tooltip.
      */
    def getActiveElement(): Element | Null
    
    /**
      * @return the attribute string if present on the anchor element, null
      * otherwise.
      */
    def getAnchorAttribute(attr: String): String | Null
    
    /**
      * @return the DOMRect for the anchor element.
      */
    def getAnchorBoundingRect(): DOMRect | Null
    
    /**
      * @return the attribute string if present on the root element, null
      * otherwise.
      */
    def getAttribute(attr: String): String | Null
    
    /**
      * @return the value of the given computed style property on the root element.
      */
    def getComputedStyleProperty(propertyName: String): String
    
    /**
      * @return the DOMRect for the parent of the tooltip element.
      */
    def getParentBoundingRect(): DOMRect | Null
    
    /**
      * @return the DOMRect for the caret element.
      */
    def getTooltipCaretBoundingRect(): DOMRect | Null
    
    /**
      * @return the width and height of the tooltip element.
      */
    def getTooltipSize(): Height
    
    /**
      * @return the height of the viewport.
      */
    def getViewportHeight(): Double
    
    /**
      * @return the width of the viewport.
      */
    def getViewportWidth(): Double
    
    /**
      * @return whether or not the root element has the provided className.
      */
    def hasClass(className: CssClasses): Boolean
    
    /**
      * @return true if the text direction is right-to-left.
      */
    def isRTL(): Boolean
    
    /**
      * Notification that the tooltip element has been fully hidden. Typically used
      * to wait for the hide animation to complete.
      */
    def notifyHidden(): Unit
    
    /**
      * Registers an event listener to the anchor element.
      */
    def registerAnchorEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the document body.
      */
    def registerDocumentEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the root element.
      */
    def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener to the window.
      */
    def registerWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes an attribute on the root element.
      */
    def removeAttribute(attr: String): Unit
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: CssClasses): Unit
    
    /**
      * Sets an attribute on the anchor element.
      */
    def setAnchorAttribute(attr: String, value: String): Unit
    
    /**
      * Sets an attribute on the root element.
      */
    def setAttribute(attr: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on the root element.
      */
    def setStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on the tooltip's
      * surface-animation element (indicated by the
      * "mdc-tooltip__surface-animation" class).
      */
    def setSurfaceAnimationStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Sets the property value of the given style property on both the caret-top
      * and caret-bottom elements.
      */
    def setTooltipCaretStyle(propertyName: String, value: String): Unit
    
    /**
      * Checks if element is contained within the tooltip element.
      */
    def tooltipContainsElement(element: HTMLElement): Boolean
  }
  object MDCTooltipAdapter {
    
    inline def apply(
      addClass: CssClasses => Callback,
      anchorContainsElement: HTMLElement => Boolean,
      clearTooltipCaretStyles: Callback,
      deregisterAnchorEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterDocumentEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterWindowEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      focusAnchorElement: Callback,
      getActiveElement: CallbackTo[Element | Null],
      getAnchorAttribute: String => String | Null,
      getAnchorBoundingRect: CallbackTo[DOMRect | Null],
      getAttribute: String => String | Null,
      getComputedStyleProperty: String => String,
      getParentBoundingRect: CallbackTo[DOMRect | Null],
      getTooltipCaretBoundingRect: CallbackTo[DOMRect | Null],
      getTooltipSize: CallbackTo[Height],
      getViewportHeight: CallbackTo[Double],
      getViewportWidth: CallbackTo[Double],
      hasClass: CssClasses => Boolean,
      isRTL: CallbackTo[Boolean],
      notifyHidden: Callback,
      registerAnchorEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerDocumentEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerWindowEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeAttribute: String => Callback,
      removeClass: CssClasses => Callback,
      setAnchorAttribute: (String, String) => Callback,
      setAttribute: (String, String) => Callback,
      setStyleProperty: (String, String) => Callback,
      setSurfaceAnimationStyleProperty: (String, String) => Callback,
      setTooltipCaretStyle: (String, String) => Callback,
      tooltipContainsElement: HTMLElement => Boolean
    ): MDCTooltipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: CssClasses) => addClass(t0).runNow()), anchorContainsElement = js.Any.fromFunction1(anchorContainsElement), clearTooltipCaretStyles = clearTooltipCaretStyles.toJsFn, deregisterAnchorEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterAnchorEventHandler(t0, t1)).runNow()), deregisterDocumentEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterDocumentEventHandler(t0, t1)).runNow()), deregisterEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterEventHandler(t0, t1)).runNow()), deregisterWindowEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterWindowEventHandler(t0, t1)).runNow()), focusAnchorElement = focusAnchorElement.toJsFn, getActiveElement = getActiveElement.toJsFn, getAnchorAttribute = js.Any.fromFunction1(getAnchorAttribute), getAnchorBoundingRect = getAnchorBoundingRect.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getComputedStyleProperty = js.Any.fromFunction1(getComputedStyleProperty), getParentBoundingRect = getParentBoundingRect.toJsFn, getTooltipCaretBoundingRect = getTooltipCaretBoundingRect.toJsFn, getTooltipSize = getTooltipSize.toJsFn, getViewportHeight = getViewportHeight.toJsFn, getViewportWidth = getViewportWidth.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isRTL = isRTL.toJsFn, notifyHidden = notifyHidden.toJsFn, registerAnchorEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerAnchorEventHandler(t0, t1)).runNow()), registerDocumentEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerDocumentEventHandler(t0, t1)).runNow()), registerEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerEventHandler(t0, t1)).runNow()), registerWindowEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerWindowEventHandler(t0, t1)).runNow()), removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeClass = js.Any.fromFunction1((t0: CssClasses) => removeClass(t0).runNow()), setAnchorAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAnchorAttribute(t0, t1)).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setStyleProperty(t0, t1)).runNow()), setSurfaceAnimationStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setSurfaceAnimationStyleProperty(t0, t1)).runNow()), setTooltipCaretStyle = js.Any.fromFunction2((t0: String, t1: String) => (setTooltipCaretStyle(t0, t1)).runNow()), tooltipContainsElement = js.Any.fromFunction1(tooltipContainsElement))
      __obj.asInstanceOf[MDCTooltipAdapter]
    }
    
    extension [Self <: MDCTooltipAdapter](x: Self) {
      
      inline def setAddClass(value: CssClasses => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: CssClasses) => value(t0).runNow()))
      
      inline def setAnchorContainsElement(value: HTMLElement => Boolean): Self = StObject.set(x, "anchorContainsElement", js.Any.fromFunction1(value))
      
      inline def setClearTooltipCaretStyles(value: Callback): Self = StObject.set(x, "clearTooltipCaretStyles", value.toJsFn)
      
      inline def setDeregisterAnchorEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterAnchorEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterDocumentEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterDocumentEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setFocusAnchorElement(value: Callback): Self = StObject.set(x, "focusAnchorElement", value.toJsFn)
      
      inline def setGetActiveElement(value: CallbackTo[Element | Null]): Self = StObject.set(x, "getActiveElement", value.toJsFn)
      
      inline def setGetAnchorAttribute(value: String => String | Null): Self = StObject.set(x, "getAnchorAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAnchorBoundingRect(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getAnchorBoundingRect", value.toJsFn)
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetComputedStyleProperty(value: String => String): Self = StObject.set(x, "getComputedStyleProperty", js.Any.fromFunction1(value))
      
      inline def setGetParentBoundingRect(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getParentBoundingRect", value.toJsFn)
      
      inline def setGetTooltipCaretBoundingRect(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getTooltipCaretBoundingRect", value.toJsFn)
      
      inline def setGetTooltipSize(value: CallbackTo[Height]): Self = StObject.set(x, "getTooltipSize", value.toJsFn)
      
      inline def setGetViewportHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportHeight", value.toJsFn)
      
      inline def setGetViewportWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportWidth", value.toJsFn)
      
      inline def setHasClass(value: CssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setNotifyHidden(value: Callback): Self = StObject.set(x, "notifyHidden", value.toJsFn)
      
      inline def setRegisterAnchorEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerAnchorEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterDocumentEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerDocumentEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: CssClasses => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: CssClasses) => value(t0).runNow()))
      
      inline def setSetAnchorAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAnchorAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetSurfaceAnimationStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setSurfaceAnimationStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetTooltipCaretStyle(value: (String, String) => Callback): Self = StObject.set(x, "setTooltipCaretStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setTooltipContainsElement(value: HTMLElement => Boolean): Self = StObject.set(x, "tooltipContainsElement", js.Any.fromFunction1(value))
    }
  }
}
