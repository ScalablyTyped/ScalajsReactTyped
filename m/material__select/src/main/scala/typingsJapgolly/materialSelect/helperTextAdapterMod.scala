package typingsJapgolly.materialSelect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextAdapterMod {
  
  trait MDCSelectHelperTextAdapter extends StObject {
    
    /**
      * Adds a class to the helper text element.
      */
    def addClass(className: String): Unit
    
    /**
      * Gets an attribute from the helper text element.
      */
    def getAttr(attr: String): String | Null
    
    /**
      * Returns whether or not the helper text element contains the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Removes an attribute from the helper text element.
      */
    def removeAttr(attr: String): Unit
    
    /**
      * Removes a class from the helper text element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets an attribute with a given value on the helper text element.
      */
    def setAttr(attr: String, value: String): Unit
    
    /**
      * Sets the text content for the helper text element.
      */
    def setContent(content: String): Unit
  }
  object MDCSelectHelperTextAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getAttr: String => String | Null,
      hasClass: String => Boolean,
      removeAttr: String => Callback,
      removeClass: String => Callback,
      setAttr: (String, String) => Callback,
      setContent: String => Callback
    ): MDCSelectHelperTextAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getAttr = js.Any.fromFunction1(getAttr), hasClass = js.Any.fromFunction1(hasClass), removeAttr = js.Any.fromFunction1((t0: String) => removeAttr(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setAttr = js.Any.fromFunction2((t0: String, t1: String) => (setAttr(t0, t1)).runNow()), setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()))
      __obj.asInstanceOf[MDCSelectHelperTextAdapter]
    }
    
    extension [Self <: MDCSelectHelperTextAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttr(value: String => Callback): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttr(value: (String, String) => Callback): Self = StObject.set(x, "setAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetContent(value: String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
