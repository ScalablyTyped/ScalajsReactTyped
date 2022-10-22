package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarMethods extends StObject {
  
  /**
    * Activate item matching provided index.
    *
    * @param index The index of the item.
    * @param activated The activate property value.
    */
  def activateItem(index: js.Object, activated: js.Object): Unit
  
  /**
    * Add item to widget item array
    *
    * @param item The item to be added.
    */
  def addItem(item: js.Object): Unit
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  def changeLocale(): Unit
  
  /**
    * Deactivate all buttons.
    */
  def deactivateAll(): Unit
  
  /**
    * Destroy the widget.
    */
  def destroy(): Unit
  
  /**
    * Disable item matching provided index.
    *
    * @param index The index of the item.
    * @param disabled The disabled property value.
    */
  def disableItem(index: js.Object, disabled: js.Object): Unit
  
  /**
    * Gets the item by matching the provided index.
    *
    * @param index The index of the item.
    */
  def getItem(index: js.Object): js.Object
  
  /**
    * Remove the item matching provided index.
    *
    * @param index The index of the item.
    */
  def removeItem(index: js.Object): js.Object
  
  /**
    * Returns the element on which the widget was instantiated
    */
  def widget(): Unit
}
object IgToolbarMethods {
  
  inline def apply(
    activateItem: (js.Object, js.Object) => Callback,
    addItem: js.Object => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    deactivateAll: Callback,
    destroy: Callback,
    disableItem: (js.Object, js.Object) => Callback,
    getItem: js.Object => js.Object,
    removeItem: js.Object => js.Object,
    widget: Callback
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal(activateItem = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (activateItem(t0, t1)).runNow()), addItem = js.Any.fromFunction1((t0: js.Object) => addItem(t0).runNow()), changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, deactivateAll = deactivateAll.toJsFn, destroy = destroy.toJsFn, disableItem = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (disableItem(t0, t1)).runNow()), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), widget = widget.toJsFn)
    __obj.asInstanceOf[IgToolbarMethods]
  }
  
  extension [Self <: IgToolbarMethods](x: Self) {
    
    inline def setActivateItem(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "activateItem", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setAddItem(value: js.Object => Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setDeactivateAll(value: Callback): Self = StObject.set(x, "deactivateAll", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDisableItem(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "disableItem", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setGetItem(value: js.Object => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setRemoveItem(value: js.Object => js.Object): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setWidget(value: Callback): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
