package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridRowSelectorsMethods extends StObject {
  
  /**
    * Changes the check state of a row by index to specified value
    *
    * @param index Row index
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckState(index: Double, toCheck: Boolean): Unit
  
  /**
    * Change the check state of a row by row id
    *
    * @param rowId Row Id
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckStateById(rowId: js.Object, toCheck: Boolean): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit
  
  /**
    * Returns the check state of the row by id.
    *
    * @param rowId
    */
  def checkStateById(rowId: js.Object): String
  
  /**
    * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def checkedRows(): js.Array[Any]
  
  def destroy(): Unit
  
  /**
    * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def partiallyCheckedRows(): js.Array[Any]
  
  def rsRenderColgroup(): Unit
  
  /**
    * Toggles the check state of a row by index
    *
    * @param index Row index
    */
  def toggleCheckState(index: Double): Unit
  
  /**
    * Toggles the check state of a row by row id
    *
    * @param rowId Row Id
    */
  def toggleCheckStateById(rowId: js.Object): Unit
  
  /**
    * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def uncheckedRows(): js.Array[Any]
}
object IgTreeGridRowSelectorsMethods {
  
  inline def apply(
    changeCheckState: (Double, Boolean) => Callback,
    changeCheckStateById: (js.Object, Boolean) => Callback,
    changeLocale: Callback,
    checkStateById: js.Object => String,
    checkedRows: CallbackTo[js.Array[Any]],
    destroy: Callback,
    partiallyCheckedRows: CallbackTo[js.Array[Any]],
    rsRenderColgroup: Callback,
    toggleCheckState: Double => Callback,
    toggleCheckStateById: js.Object => Callback,
    uncheckedRows: CallbackTo[js.Array[Any]]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeCheckState = js.Any.fromFunction2((t0: Double, t1: Boolean) => (changeCheckState(t0, t1)).runNow()), changeCheckStateById = js.Any.fromFunction2((t0: js.Object, t1: Boolean) => (changeCheckStateById(t0, t1)).runNow()), changeLocale = changeLocale.toJsFn, checkStateById = js.Any.fromFunction1(checkStateById), checkedRows = checkedRows.toJsFn, destroy = destroy.toJsFn, partiallyCheckedRows = partiallyCheckedRows.toJsFn, rsRenderColgroup = rsRenderColgroup.toJsFn, toggleCheckState = js.Any.fromFunction1((t0: Double) => toggleCheckState(t0).runNow()), toggleCheckStateById = js.Any.fromFunction1((t0: js.Object) => toggleCheckStateById(t0).runNow()), uncheckedRows = uncheckedRows.toJsFn)
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
  
  extension [Self <: IgTreeGridRowSelectorsMethods](x: Self) {
    
    inline def setChangeCheckState(value: (Double, Boolean) => Callback): Self = StObject.set(x, "changeCheckState", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setChangeCheckStateById(value: (js.Object, Boolean) => Callback): Self = StObject.set(x, "changeCheckStateById", js.Any.fromFunction2((t0: js.Object, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setCheckStateById(value: js.Object => String): Self = StObject.set(x, "checkStateById", js.Any.fromFunction1(value))
    
    inline def setCheckedRows(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "checkedRows", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setPartiallyCheckedRows(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "partiallyCheckedRows", value.toJsFn)
    
    inline def setRsRenderColgroup(value: Callback): Self = StObject.set(x, "rsRenderColgroup", value.toJsFn)
    
    inline def setToggleCheckState(value: Double => Callback): Self = StObject.set(x, "toggleCheckState", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToggleCheckStateById(value: js.Object => Callback): Self = StObject.set(x, "toggleCheckStateById", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setUncheckedRows(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "uncheckedRows", value.toJsFn)
  }
}
