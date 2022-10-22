package typingsJapgolly.materialSegmentedButton

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentAdapterMod {
  
  trait MDCSegmentedButtonSegmentAdapter extends StObject {
    
    /**
      * Adds css class to segment
      *
      * @param className Class to add
      */
    def addClass(className: String): Unit
    
    /**
      * @param attrName Attribute of interest
      * @return Returns segment's attribute value if it is set, otherwise returns
      * null
      */
    def getAttr(attrName: String): String | Null
    
    /**
      * @return Returns bounding rectangle for ripple effect
      */
    def getRootBoundingClientRect(): DOMRect
    
    /**
      * @param className Class of interest
      * @return Returns true if segment has css class, otherwise returns false
      */
    def hasClass(className: String): Boolean
    
    /**
      * @return Returns true if wrapping segmented button is single select
      */
    def isSingleSelect(): Boolean
    
    /**
      * Emits event about segment to wrapping segmented button
      *
      * @param selected Represents whether segment is currently selected
      * @event selected With detail - SegmentDetail
      */
    def notifySelectedChange(selected: Boolean): Unit
    
    /**
      * Removes css class from segment
      *
      * @param className Class to remove
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets segment's attribute value to new value
      *
      * @param attrName Attribute of interest
      * @param value New value of attribute
      */
    def setAttr(attrName: String, value: String): Unit
  }
  object MDCSegmentedButtonSegmentAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getAttr: String => String | Null,
      getRootBoundingClientRect: CallbackTo[DOMRect],
      hasClass: String => Boolean,
      isSingleSelect: CallbackTo[Boolean],
      notifySelectedChange: Boolean => Callback,
      removeClass: String => Callback,
      setAttr: (String, String) => Callback
    ): MDCSegmentedButtonSegmentAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getAttr = js.Any.fromFunction1(getAttr), getRootBoundingClientRect = getRootBoundingClientRect.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isSingleSelect = isSingleSelect.toJsFn, notifySelectedChange = js.Any.fromFunction1((t0: Boolean) => notifySelectedChange(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setAttr = js.Any.fromFunction2((t0: String, t1: String) => (setAttr(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCSegmentedButtonSegmentAdapter]
    }
    
    extension [Self <: MDCSegmentedButtonSegmentAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setGetRootBoundingClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getRootBoundingClientRect", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsSingleSelect(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSingleSelect", value.toJsFn)
      
      inline def setNotifySelectedChange(value: Boolean => Callback): Self = StObject.set(x, "notifySelectedChange", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttr(value: (String, String) => Callback): Self = StObject.set(x, "setAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
