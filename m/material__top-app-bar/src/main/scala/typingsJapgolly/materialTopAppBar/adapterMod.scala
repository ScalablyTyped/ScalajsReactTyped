package typingsJapgolly.materialTopAppBar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTopAppBarAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit
    
    /**
      * Gets the height of the top app bar.
      */
    def getTopAppBarHeight(): Double
    
    def getTotalActionItems(): Double
    
    def getViewportScrollY(): Double
    
    /**
      * Returns true if the root Element contains the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Emits an event when the navigation icon is clicked.
      */
    def notifyNavigationIconClicked(): Unit
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets the specified inline style property on the root Element to the given value.
      */
    def setStyle(property: String, value: String): Unit
  }
  object MDCTopAppBarAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getTopAppBarHeight: CallbackTo[Double],
      getTotalActionItems: CallbackTo[Double],
      getViewportScrollY: CallbackTo[Double],
      hasClass: String => Boolean,
      notifyNavigationIconClicked: Callback,
      removeClass: String => Callback,
      setStyle: (String, String) => Callback
    ): MDCTopAppBarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getTopAppBarHeight = getTopAppBarHeight.toJsFn, getTotalActionItems = getTotalActionItems.toJsFn, getViewportScrollY = getViewportScrollY.toJsFn, hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = notifyNavigationIconClicked.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setStyle = js.Any.fromFunction2((t0: String, t1: String) => (setStyle(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCTopAppBarAdapter]
    }
    
    extension [Self <: MDCTopAppBarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetTopAppBarHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getTopAppBarHeight", value.toJsFn)
      
      inline def setGetTotalActionItems(value: CallbackTo[Double]): Self = StObject.set(x, "getTotalActionItems", value.toJsFn)
      
      inline def setGetViewportScrollY(value: CallbackTo[Double]): Self = StObject.set(x, "getViewportScrollY", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyNavigationIconClicked(value: Callback): Self = StObject.set(x, "notifyNavigationIconClicked", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStyle(value: (String, String) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
