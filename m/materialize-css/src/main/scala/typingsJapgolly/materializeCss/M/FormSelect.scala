package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSelect
  extends StObject
     with Component[FormSelectOptions] {
  
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown
  
  /**
    * Dropdown UL element
    */
  var dropdownOptions: HTMLUListElement
  
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String]
  
  /**
    * Text input that shows current selected option
    */
  var input: HTMLInputElement
  
  /**
    * If this is a multiple select
    */
  var isMultiple: Boolean
  
  /**
    * The select wrapper element
    */
  var wrapper: Element
}
object FormSelect {
  
  inline def apply(
    destroy: Callback,
    dropdown: Dropdown,
    dropdownOptions: HTMLUListElement,
    el: Element,
    getSelectedValues: CallbackTo[js.Array[String]],
    input: HTMLInputElement,
    isMultiple: Boolean,
    options: FormSelectOptions,
    wrapper: Element
  ): FormSelect = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, dropdown = dropdown.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], getSelectedValues = getSelectedValues.toJsFn, input = input.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelect]
  }
  
  extension [Self <: FormSelect](x: Self) {
    
    inline def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptions(value: HTMLUListElement): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSelectedValues", value.toJsFn)
    
    inline def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setIsMultiple(value: Boolean): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: Element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
