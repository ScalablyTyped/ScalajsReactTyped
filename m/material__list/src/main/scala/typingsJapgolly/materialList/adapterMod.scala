package typingsJapgolly.materialList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCListAdapter extends StObject {
    
    def addClassForElementIndex(index: Double, className: String): Unit
    
    /**
      * Focuses list item at the index specified.
      */
    def focusItemAtIndex(index: Double): Unit
    
    /**
      * Returns the attribute value of list item at given `index`.
      */
    def getAttributeForElementIndex(index: Double, attr: String): String | Null
    
    def getFocusedElementIndex(): Double
    
    def getListItemCount(): Double
    
    /**
      * @return the primary text content of the list item at index.
      */
    def getPrimaryTextAtIndex(index: Double): String
    
    /**
      * @return true if checkbox is present at given list item index.
      */
    def hasCheckboxAtIndex(index: Double): Boolean
    
    /**
      * @return true if radio button is present at given list item index.
      */
    def hasRadioAtIndex(index: Double): Boolean
    
    /**
      * @return true if checkbox inside a list item is checked.
      */
    def isCheckboxCheckedAtIndex(index: Double): Boolean
    
    /**
      * @return true when the current focused element is inside list root.
      */
    def isFocusInsideList(): Boolean
    
    /**
      * @return true if root element is focused.
      */
    def isRootFocused(): Boolean
    
    /**
      * @param index list item index.
      * @param className the name of the class whose presence is to be checked.
      * @return true if list item at `index` has class `className`.
      */
    def listItemAtIndexHasClass(index: Double, className: String): Boolean
    
    /**
      * Notifies user action on list item.
      */
    def notifyAction(index: Double): Unit
    
    /**
      * Notifies that items at the given indices have changed its
      * selection state through user interaction (e.g. click).
      *
      * This is invoked only for changes caused by user interaction
      * to match with the native `change` event semantics.
      */
    def notifySelectionChange(changedIndices: js.Array[Double]): Unit
    
    def removeClassForElementIndex(index: Double, className: String): Unit
    
    def setAttributeForElementIndex(index: Double, attribute: String, value: String): Unit
    
    /**
      * Sets the checked status of checkbox or radio at given list item index.
      */
    def setCheckedCheckboxOrRadioAtIndex(index: Double, isChecked: Boolean): Unit
    
    /**
      * Sets the tabindex to the value specified for all button/a element children of
      * the list item at the index specified.
      */
    def setTabIndexForListItemChildren(listItemIndex: Double, tabIndexValue: String): Unit
  }
  object MDCListAdapter {
    
    inline def apply(
      addClassForElementIndex: (Double, String) => Callback,
      focusItemAtIndex: Double => Callback,
      getAttributeForElementIndex: (Double, String) => String | Null,
      getFocusedElementIndex: CallbackTo[Double],
      getListItemCount: CallbackTo[Double],
      getPrimaryTextAtIndex: Double => String,
      hasCheckboxAtIndex: Double => Boolean,
      hasRadioAtIndex: Double => Boolean,
      isCheckboxCheckedAtIndex: Double => Boolean,
      isFocusInsideList: CallbackTo[Boolean],
      isRootFocused: CallbackTo[Boolean],
      listItemAtIndexHasClass: (Double, String) => Boolean,
      notifyAction: Double => Callback,
      notifySelectionChange: js.Array[Double] => Callback,
      removeClassForElementIndex: (Double, String) => Callback,
      setAttributeForElementIndex: (Double, String, String) => Callback,
      setCheckedCheckboxOrRadioAtIndex: (Double, Boolean) => Callback,
      setTabIndexForListItemChildren: (Double, String) => Callback
    ): MDCListAdapter = {
      val __obj = js.Dynamic.literal(addClassForElementIndex = js.Any.fromFunction2((t0: Double, t1: String) => (addClassForElementIndex(t0, t1)).runNow()), focusItemAtIndex = js.Any.fromFunction1((t0: Double) => focusItemAtIndex(t0).runNow()), getAttributeForElementIndex = js.Any.fromFunction2(getAttributeForElementIndex), getFocusedElementIndex = getFocusedElementIndex.toJsFn, getListItemCount = getListItemCount.toJsFn, getPrimaryTextAtIndex = js.Any.fromFunction1(getPrimaryTextAtIndex), hasCheckboxAtIndex = js.Any.fromFunction1(hasCheckboxAtIndex), hasRadioAtIndex = js.Any.fromFunction1(hasRadioAtIndex), isCheckboxCheckedAtIndex = js.Any.fromFunction1(isCheckboxCheckedAtIndex), isFocusInsideList = isFocusInsideList.toJsFn, isRootFocused = isRootFocused.toJsFn, listItemAtIndexHasClass = js.Any.fromFunction2(listItemAtIndexHasClass), notifyAction = js.Any.fromFunction1((t0: Double) => notifyAction(t0).runNow()), notifySelectionChange = js.Any.fromFunction1((t0: js.Array[Double]) => notifySelectionChange(t0).runNow()), removeClassForElementIndex = js.Any.fromFunction2((t0: Double, t1: String) => (removeClassForElementIndex(t0, t1)).runNow()), setAttributeForElementIndex = js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (setAttributeForElementIndex(t0, t1, t2)).runNow()), setCheckedCheckboxOrRadioAtIndex = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setCheckedCheckboxOrRadioAtIndex(t0, t1)).runNow()), setTabIndexForListItemChildren = js.Any.fromFunction2((t0: Double, t1: String) => (setTabIndexForListItemChildren(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCListAdapter]
    }
    
    extension [Self <: MDCListAdapter](x: Self) {
      
      inline def setAddClassForElementIndex(value: (Double, String) => Callback): Self = StObject.set(x, "addClassForElementIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setFocusItemAtIndex(value: Double => Callback): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGetAttributeForElementIndex(value: (Double, String) => String | Null): Self = StObject.set(x, "getAttributeForElementIndex", js.Any.fromFunction2(value))
      
      inline def setGetFocusedElementIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getFocusedElementIndex", value.toJsFn)
      
      inline def setGetListItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getListItemCount", value.toJsFn)
      
      inline def setGetPrimaryTextAtIndex(value: Double => String): Self = StObject.set(x, "getPrimaryTextAtIndex", js.Any.fromFunction1(value))
      
      inline def setHasCheckboxAtIndex(value: Double => Boolean): Self = StObject.set(x, "hasCheckboxAtIndex", js.Any.fromFunction1(value))
      
      inline def setHasRadioAtIndex(value: Double => Boolean): Self = StObject.set(x, "hasRadioAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsCheckboxCheckedAtIndex(value: Double => Boolean): Self = StObject.set(x, "isCheckboxCheckedAtIndex", js.Any.fromFunction1(value))
      
      inline def setIsFocusInsideList(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusInsideList", value.toJsFn)
      
      inline def setIsRootFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRootFocused", value.toJsFn)
      
      inline def setListItemAtIndexHasClass(value: (Double, String) => Boolean): Self = StObject.set(x, "listItemAtIndexHasClass", js.Any.fromFunction2(value))
      
      inline def setNotifyAction(value: Double => Callback): Self = StObject.set(x, "notifyAction", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setNotifySelectionChange(value: js.Array[Double] => Callback): Self = StObject.set(x, "notifySelectionChange", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      
      inline def setRemoveClassForElementIndex(value: (Double, String) => Callback): Self = StObject.set(x, "removeClassForElementIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetAttributeForElementIndex(value: (Double, String, String) => Callback): Self = StObject.set(x, "setAttributeForElementIndex", js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetCheckedCheckboxOrRadioAtIndex(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setCheckedCheckboxOrRadioAtIndex", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetTabIndexForListItemChildren(value: (Double, String) => Callback): Self = StObject.set(x, "setTabIndexForListItemChildren", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
