package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autocomplete
  extends StObject
     with Component[AutocompleteOptions]
     with Openable {
  
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double
  
  /**
    * Number of matching autocomplete options.
    */
  var count: Double
  
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit
  
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit
}
object Autocomplete {
  
  inline def apply(
    activeIndex: Double,
    close: Callback,
    count: Double,
    destroy: Callback,
    el: Element,
    isOpen: Boolean,
    open: Callback,
    options: AutocompleteOptions,
    selectOption: Element => Callback,
    updateData: AutocompleteData => Callback
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], close = close.toJsFn, count = count.asInstanceOf[js.Any], destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1((t0: Element) => selectOption(t0).runNow()), updateData = js.Any.fromFunction1((t0: AutocompleteData) => updateData(t0).runNow()))
    __obj.asInstanceOf[Autocomplete]
  }
  
  extension [Self <: Autocomplete](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setSelectOption(value: Element => Callback): Self = StObject.set(x, "selectOption", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setUpdateData(value: AutocompleteData => Callback): Self = StObject.set(x, "updateData", js.Any.fromFunction1((t0: AutocompleteData) => value(t0).runNow()))
  }
}
