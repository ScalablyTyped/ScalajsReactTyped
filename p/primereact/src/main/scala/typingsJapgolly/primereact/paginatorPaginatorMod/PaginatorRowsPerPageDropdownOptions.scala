package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorRowsPerPageDropdownOptions extends StObject {
  
  var appendTo: PaginatorAppendToType
  
  var currentPage: Double
  
  var disabled: Boolean
  
  var element: Element
  
  def onChange(e: PaginatorChangeParams): Unit
  
  var options: js.Array[Any]
  
  var props: PaginatorProps
  
  var totalPages: Double
  
  var totalRecords: Double
  
  var value: Any
}
object PaginatorRowsPerPageDropdownOptions {
  
  inline def apply(
    currentPage: Double,
    disabled: Boolean,
    element: VdomElement,
    onChange: PaginatorChangeParams => Callback,
    options: js.Array[Any],
    props: PaginatorProps,
    totalPages: Double,
    totalRecords: Double,
    value: Any
  ): PaginatorRowsPerPageDropdownOptions = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: PaginatorChangeParams) => onChange(t0).runNow()), options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], totalRecords = totalRecords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorRowsPerPageDropdownOptions]
  }
  
  extension [Self <: PaginatorRowsPerPageDropdownOptions](x: Self) {
    
    inline def setAppendTo(value: PaginatorAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnChange(value: PaginatorChangeParams => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: PaginatorChangeParams) => value(t0).runNow()))
    
    inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
