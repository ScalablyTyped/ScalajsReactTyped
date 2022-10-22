package typingsJapgolly.materialDrawer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCDrawerAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit
    
    /**
      * Returns true if the element contains the given class.
      * @param element target element to verify class name
      * @param className class name
      */
    def elementHasClass(element: Element, className: String): Boolean
    
    /**
      * Focuses the active / selected navigation item.
      */
    def focusActiveNavigationItem(): Unit
    
    /**
      * Returns true if the root Element contains the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Emits a custom event "MDCDrawer:closed" denoting the drawer has closed.
      */
    def notifyClose(): Unit
    
    /**
      * Emits a custom event "MDCDrawer:opened" denoting the drawer has opened.
      */
    def notifyOpen(): Unit
    
    /**
      * Releases focus trap from root element which was set by `trapFocus`
      * and restores focus to where it was prior to calling `trapFocus`.
      */
    def releaseFocus(): Unit
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Restores focus to element previously saved with 'saveFocus'.
      */
    def restoreFocus(): Unit
    
    /**
      * Saves the focus of currently active element.
      */
    def saveFocus(): Unit
    
    /**
      * Traps focus on root element and focuses the active navigation element.
      */
    def trapFocus(): Unit
  }
  object MDCDrawerAdapter {
    
    inline def apply(
      addClass: String => Callback,
      elementHasClass: (Element, String) => Boolean,
      focusActiveNavigationItem: Callback,
      hasClass: String => Boolean,
      notifyClose: Callback,
      notifyOpen: Callback,
      releaseFocus: Callback,
      removeClass: String => Callback,
      restoreFocus: Callback,
      saveFocus: Callback,
      trapFocus: Callback
    ): MDCDrawerAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), elementHasClass = js.Any.fromFunction2(elementHasClass), focusActiveNavigationItem = focusActiveNavigationItem.toJsFn, hasClass = js.Any.fromFunction1(hasClass), notifyClose = notifyClose.toJsFn, notifyOpen = notifyOpen.toJsFn, releaseFocus = releaseFocus.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), restoreFocus = restoreFocus.toJsFn, saveFocus = saveFocus.toJsFn, trapFocus = trapFocus.toJsFn)
      __obj.asInstanceOf[MDCDrawerAdapter]
    }
    
    extension [Self <: MDCDrawerAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setElementHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "elementHasClass", js.Any.fromFunction2(value))
      
      inline def setFocusActiveNavigationItem(value: Callback): Self = StObject.set(x, "focusActiveNavigationItem", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyClose(value: Callback): Self = StObject.set(x, "notifyClose", value.toJsFn)
      
      inline def setNotifyOpen(value: Callback): Self = StObject.set(x, "notifyOpen", value.toJsFn)
      
      inline def setReleaseFocus(value: Callback): Self = StObject.set(x, "releaseFocus", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRestoreFocus(value: Callback): Self = StObject.set(x, "restoreFocus", value.toJsFn)
      
      inline def setSaveFocus(value: Callback): Self = StObject.set(x, "saveFocus", value.toJsFn)
      
      inline def setTrapFocus(value: Callback): Self = StObject.set(x, "trapFocus", value.toJsFn)
    }
  }
}
