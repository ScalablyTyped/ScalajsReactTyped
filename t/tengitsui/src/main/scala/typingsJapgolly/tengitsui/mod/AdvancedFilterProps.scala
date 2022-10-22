package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedFilterProps extends StObject {
  
  var defaultValue: js.UndefOr[js.Object] = js.undefined
  
  var noClearer: js.UndefOr[Boolean] = js.undefined
  
  var noCollpose: js.UndefOr[Boolean] = js.undefined
  
  var onChange: typingsJapgolly.tengitsui.mod.onChange
  
  var onFieldChange: voidFunc
  
  var onReset: js.UndefOr[voidFunc] = js.undefined
  
  var onSearch: js.UndefOr[voidFunc] = js.undefined
  
  var schema: js.Object
}
object AdvancedFilterProps {
  
  inline def apply(onChange: /* value */ Any => Callback, onFieldChange: Callback, schema: js.Object): AdvancedFilterProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: /* value */ Any) => onChange(t0).runNow()), onFieldChange = onFieldChange.toJsFn, schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedFilterProps]
  }
  
  extension [Self <: AdvancedFilterProps](x: Self) {
    
    inline def setDefaultValue(value: js.Object): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setNoClearer(value: Boolean): Self = StObject.set(x, "noClearer", value.asInstanceOf[js.Any])
    
    inline def setNoClearerUndefined: Self = StObject.set(x, "noClearer", js.undefined)
    
    inline def setNoCollpose(value: Boolean): Self = StObject.set(x, "noCollpose", value.asInstanceOf[js.Any])
    
    inline def setNoCollposeUndefined: Self = StObject.set(x, "noCollpose", js.undefined)
    
    inline def setOnChange(value: /* value */ Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setOnFieldChange(value: Callback): Self = StObject.set(x, "onFieldChange", value.toJsFn)
    
    inline def setOnReset(value: Callback): Self = StObject.set(x, "onReset", value.toJsFn)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnSearch(value: Callback): Self = StObject.set(x, "onSearch", value.toJsFn)
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
