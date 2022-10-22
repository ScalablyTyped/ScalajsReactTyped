package typingsJapgolly.materialSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.materialMenuSurface.constantsMod.Corner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSelectAdapter extends StObject {
    
    /**
      * Activates the bottom line, showing a focused state.
      */
    def activateBottomLine(): Unit
    
    /**
      * Adds class to select anchor element.
      */
    def addClass(className: String): Unit
    
    /**
      * Adds class to the menu element.
      */
    def addMenuClass(className: String): Unit
    
    /**
      * Closes the menu.
      */
    def closeMenu(): Unit
    
    /**
      * Closes notch in outline element, if the outline exists.
      */
    def closeOutline(): Unit
    
    /**
      * Deactivates the bottom line.
      */
    def deactivateBottomLine(): Unit
    
    /**
      * Floats label determined based off of the shouldFloat argument.
      */
    def floatLabel(shouldFloat: Boolean): Unit
    
    /**
      * Focuses the menu item element at the given index.
      */
    def focusMenuItemAtIndex(index: Double): Unit
    
    /**
      * Returns the select anchor element.
      */
    def getAnchorElement(): Element | Null
    
    /**
      * Returns width of label in pixels, if the label exists.
      */
    def getLabelWidth(): Double
    
    /**
      * Returns the number of menu items.
      */
    def getMenuItemCount(): Double
    
    /**
      * Gets the text content of the menu item element at the given index.
      */
    def getMenuItemTextAtIndex(index: Double): String
    
    /**
      * Returns an array representing the VALUE_ATTR attributes of each menu item.
      */
    def getMenuItemValues(): js.Array[String]
    
    /**
      * Gets the given attribute on the select anchor element.
      */
    def getSelectAnchorAttr(attr: String): String | Null
    
    /**
      * Returns the selected index.
      */
    def getSelectedIndex(): Double
    
    /**
      * Returns true if the select anchor element contains the given class name.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Returns true if label exists, false if it doesn't.
      */
    def hasLabel(): Boolean
    
    /**
      * Returns true if outline element exists, false if it doesn't.
      */
    def hasOutline(): Boolean
    
    /**
      * Returns whether the select anchor is focused.
      */
    def isSelectAnchorFocused(): Boolean
    
    /**
      * Returns whether typeahead is in progress in the menu.
      */
    def isTypeaheadInProgress(): Boolean
    
    /**
      * Only implement if outline element exists.
      */
    def notchOutline(labelWidth: Double): Unit
    
    /**
      * Emits a change event when an element is selected.
      */
    def notifyChange(value: String): Unit
    
    /**
      * Opens the menu.
      */
    def openMenu(): Unit
    
    /**
      * Removes a class from the select anchor element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes a class from the menu element.
      */
    def removeMenuClass(className: String): Unit
    
    /**
      * Removes the given attribute on the select anchor element.
      */
    def removeSelectAnchorAttr(attr: String): Unit
    
    /**
      * Styles the label as required, if the label exists.
      */
    def setLabelRequired(isRequired: Boolean): Unit
    
    /**
      * Sets the menu anchor corner.
      */
    def setMenuAnchorCorner(anchorCorner: Corner): Unit
    
    /**
      * Sets the menu anchor element.
      */
    def setMenuAnchorElement(anchorEl: Element): Unit
    
    /**
      * Sets whether the menu should wrap focus.
      */
    def setMenuWrapFocus(wrapFocus: Boolean): Unit
    
    /**
      * Sets the line ripple transform origin center.
      */
    def setRippleCenter(normalizedX: Double): Unit
    
    /**
      * Sets the given attribute on the select anchor element.
      */
    def setSelectAnchorAttr(attr: String, value: String): Unit
    
    /**
      * Sets the selected index in the menu.
      */
    def setSelectedIndex(index: Double): Unit
    
    /**
      * Sets the text content of the selectedText element to the given string.
      */
    def setSelectedText(text: String): Unit
    
    /**
      * Adds a character to the list typeahead buffer and returns index of the
      * next item in the list matching the buffer.
      */
    def typeaheadMatchItem(nextChar: String, startingIndex: Double): Double
  }
  object MDCSelectAdapter {
    
    inline def apply(
      activateBottomLine: Callback,
      addClass: String => Callback,
      addMenuClass: String => Callback,
      closeMenu: Callback,
      closeOutline: Callback,
      deactivateBottomLine: Callback,
      floatLabel: Boolean => Callback,
      focusMenuItemAtIndex: Double => Callback,
      getAnchorElement: CallbackTo[Element | Null],
      getLabelWidth: CallbackTo[Double],
      getMenuItemCount: CallbackTo[Double],
      getMenuItemTextAtIndex: Double => String,
      getMenuItemValues: CallbackTo[js.Array[String]],
      getSelectAnchorAttr: String => String | Null,
      getSelectedIndex: CallbackTo[Double],
      hasClass: String => Boolean,
      hasLabel: CallbackTo[Boolean],
      hasOutline: CallbackTo[Boolean],
      isSelectAnchorFocused: CallbackTo[Boolean],
      isTypeaheadInProgress: CallbackTo[Boolean],
      notchOutline: Double => Callback,
      notifyChange: String => Callback,
      openMenu: Callback,
      removeClass: String => Callback,
      removeMenuClass: String => Callback,
      removeSelectAnchorAttr: String => Callback,
      setLabelRequired: Boolean => Callback,
      setMenuAnchorCorner: Corner => Callback,
      setMenuAnchorElement: Element => Callback,
      setMenuWrapFocus: Boolean => Callback,
      setRippleCenter: Double => Callback,
      setSelectAnchorAttr: (String, String) => Callback,
      setSelectedIndex: Double => Callback,
      setSelectedText: String => Callback,
      typeaheadMatchItem: (String, Double) => Double
    ): MDCSelectAdapter = {
      val __obj = js.Dynamic.literal(activateBottomLine = activateBottomLine.toJsFn, addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), addMenuClass = js.Any.fromFunction1((t0: String) => addMenuClass(t0).runNow()), closeMenu = closeMenu.toJsFn, closeOutline = closeOutline.toJsFn, deactivateBottomLine = deactivateBottomLine.toJsFn, floatLabel = js.Any.fromFunction1((t0: Boolean) => floatLabel(t0).runNow()), focusMenuItemAtIndex = js.Any.fromFunction1((t0: Double) => focusMenuItemAtIndex(t0).runNow()), getAnchorElement = getAnchorElement.toJsFn, getLabelWidth = getLabelWidth.toJsFn, getMenuItemCount = getMenuItemCount.toJsFn, getMenuItemTextAtIndex = js.Any.fromFunction1(getMenuItemTextAtIndex), getMenuItemValues = getMenuItemValues.toJsFn, getSelectAnchorAttr = js.Any.fromFunction1(getSelectAnchorAttr), getSelectedIndex = getSelectedIndex.toJsFn, hasClass = js.Any.fromFunction1(hasClass), hasLabel = hasLabel.toJsFn, hasOutline = hasOutline.toJsFn, isSelectAnchorFocused = isSelectAnchorFocused.toJsFn, isTypeaheadInProgress = isTypeaheadInProgress.toJsFn, notchOutline = js.Any.fromFunction1((t0: Double) => notchOutline(t0).runNow()), notifyChange = js.Any.fromFunction1((t0: String) => notifyChange(t0).runNow()), openMenu = openMenu.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeMenuClass = js.Any.fromFunction1((t0: String) => removeMenuClass(t0).runNow()), removeSelectAnchorAttr = js.Any.fromFunction1((t0: String) => removeSelectAnchorAttr(t0).runNow()), setLabelRequired = js.Any.fromFunction1((t0: Boolean) => setLabelRequired(t0).runNow()), setMenuAnchorCorner = js.Any.fromFunction1((t0: Corner) => setMenuAnchorCorner(t0).runNow()), setMenuAnchorElement = js.Any.fromFunction1((t0: Element) => setMenuAnchorElement(t0).runNow()), setMenuWrapFocus = js.Any.fromFunction1((t0: Boolean) => setMenuWrapFocus(t0).runNow()), setRippleCenter = js.Any.fromFunction1((t0: Double) => setRippleCenter(t0).runNow()), setSelectAnchorAttr = js.Any.fromFunction2((t0: String, t1: String) => (setSelectAnchorAttr(t0, t1)).runNow()), setSelectedIndex = js.Any.fromFunction1((t0: Double) => setSelectedIndex(t0).runNow()), setSelectedText = js.Any.fromFunction1((t0: String) => setSelectedText(t0).runNow()), typeaheadMatchItem = js.Any.fromFunction2(typeaheadMatchItem))
      __obj.asInstanceOf[MDCSelectAdapter]
    }
    
    extension [Self <: MDCSelectAdapter](x: Self) {
      
      inline def setActivateBottomLine(value: Callback): Self = StObject.set(x, "activateBottomLine", value.toJsFn)
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddMenuClass(value: String => Callback): Self = StObject.set(x, "addMenuClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCloseMenu(value: Callback): Self = StObject.set(x, "closeMenu", value.toJsFn)
      
      inline def setCloseOutline(value: Callback): Self = StObject.set(x, "closeOutline", value.toJsFn)
      
      inline def setDeactivateBottomLine(value: Callback): Self = StObject.set(x, "deactivateBottomLine", value.toJsFn)
      
      inline def setFloatLabel(value: Boolean => Callback): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setFocusMenuItemAtIndex(value: Double => Callback): Self = StObject.set(x, "focusMenuItemAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setGetAnchorElement(value: CallbackTo[Element | Null]): Self = StObject.set(x, "getAnchorElement", value.toJsFn)
      
      inline def setGetLabelWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelWidth", value.toJsFn)
      
      inline def setGetMenuItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getMenuItemCount", value.toJsFn)
      
      inline def setGetMenuItemTextAtIndex(value: Double => String): Self = StObject.set(x, "getMenuItemTextAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetMenuItemValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getMenuItemValues", value.toJsFn)
      
      inline def setGetSelectAnchorAttr(value: String => String | Null): Self = StObject.set(x, "getSelectAnchorAttr", js.Any.fromFunction1(value))
      
      inline def setGetSelectedIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedIndex", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasLabel(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLabel", value.toJsFn)
      
      inline def setHasOutline(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOutline", value.toJsFn)
      
      inline def setIsSelectAnchorFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelectAnchorFocused", value.toJsFn)
      
      inline def setIsTypeaheadInProgress(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTypeaheadInProgress", value.toJsFn)
      
      inline def setNotchOutline(value: Double => Callback): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setNotifyChange(value: String => Callback): Self = StObject.set(x, "notifyChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOpenMenu(value: Callback): Self = StObject.set(x, "openMenu", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveMenuClass(value: String => Callback): Self = StObject.set(x, "removeMenuClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveSelectAnchorAttr(value: String => Callback): Self = StObject.set(x, "removeSelectAnchorAttr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetLabelRequired(value: Boolean => Callback): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetMenuAnchorCorner(value: Corner => Callback): Self = StObject.set(x, "setMenuAnchorCorner", js.Any.fromFunction1((t0: Corner) => value(t0).runNow()))
      
      inline def setSetMenuAnchorElement(value: Element => Callback): Self = StObject.set(x, "setMenuAnchorElement", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
      
      inline def setSetMenuWrapFocus(value: Boolean => Callback): Self = StObject.set(x, "setMenuWrapFocus", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetRippleCenter(value: Double => Callback): Self = StObject.set(x, "setRippleCenter", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetSelectAnchorAttr(value: (String, String) => Callback): Self = StObject.set(x, "setSelectAnchorAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetSelectedIndex(value: Double => Callback): Self = StObject.set(x, "setSelectedIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetSelectedText(value: String => Callback): Self = StObject.set(x, "setSelectedText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setTypeaheadMatchItem(value: (String, Double) => Double): Self = StObject.set(x, "typeaheadMatchItem", js.Any.fromFunction2(value))
    }
  }
}
