package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
trait PartialListSelectionProps extends StObject {
  
  var checkBoxAriaLabel: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* checkedState */ Boolean, Unit]
  ] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
}
object PartialListSelectionProps {
  
  inline def apply(): PartialListSelectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListSelectionProps]
  }
  
  extension [Self <: PartialListSelectionProps](x: Self) {
    
    inline def setCheckBoxAriaLabel(value: String): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxAriaLabelUndefined: Self = StObject.set(x, "checkBoxAriaLabel", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnChange(
      value: (/* event */ ReactEventFrom[HTMLInputElement], /* checkedState */ Boolean) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* checkedState */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
