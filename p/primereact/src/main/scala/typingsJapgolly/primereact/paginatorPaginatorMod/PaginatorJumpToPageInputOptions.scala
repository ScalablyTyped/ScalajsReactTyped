package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorJumpToPageInputOptions extends StObject {
  
  var className: String
  
  var disabled: Boolean
  
  var element: Element
  
  def onChange(first: Double, rows: Double): Unit
  
  var props: PaginatorProps
  
  var value: Double
}
object PaginatorJumpToPageInputOptions {
  
  inline def apply(
    className: String,
    disabled: Boolean,
    element: VdomElement,
    onChange: (Double, Double) => Callback,
    props: PaginatorProps,
    value: Double
  ): PaginatorJumpToPageInputOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: Double, t1: Double) => (onChange(t0, t1)).runNow()), props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorJumpToPageInputOptions]
  }
  
  extension [Self <: PaginatorJumpToPageInputOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (Double, Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
