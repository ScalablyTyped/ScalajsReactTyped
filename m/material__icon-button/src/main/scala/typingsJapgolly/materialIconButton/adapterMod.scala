package typingsJapgolly.materialIconButton

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCIconButtonToggleAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    /** Returns the given attribute value on the root element. */
    def getAttr(attrName: String): String | Null
    
    def hasClass(className: String): Boolean
    
    def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit
    
    def removeClass(className: String): Unit
    
    def setAttr(attrName: String, attrValue: String): Unit
  }
  object MDCIconButtonToggleAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getAttr: String => String | Null,
      hasClass: String => Boolean,
      notifyChange: MDCIconButtonToggleEventDetail => Callback,
      removeClass: String => Callback,
      setAttr: (String, String) => Callback
    ): MDCIconButtonToggleAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getAttr = js.Any.fromFunction1(getAttr), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1((t0: MDCIconButtonToggleEventDetail) => notifyChange(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setAttr = js.Any.fromFunction2((t0: String, t1: String) => (setAttr(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCIconButtonToggleAdapter]
    }
    
    extension [Self <: MDCIconButtonToggleAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyChange(value: MDCIconButtonToggleEventDetail => Callback): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1((t0: MDCIconButtonToggleEventDetail) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttr(value: (String, String) => Callback): Self = StObject.set(x, "setAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
