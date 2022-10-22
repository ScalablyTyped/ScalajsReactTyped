package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxValue extends StObject {
  
  var maxValue: typingsJapgolly.wixStyleReact.distTypesInputMod.MaxValue
  
  var minValue: typingsJapgolly.wixStyleReact.distTypesInputMod.MinValue
  
  var value: typingsJapgolly.wixStyleReact.distTypesInputMod.InputValue
}
object MaxValue {
  
  inline def apply(): MaxValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxValue]
  }
  
  extension [Self <: MaxValue](x: Self) {
    
    inline def setMaxValue(value: typingsJapgolly.wixStyleReact.distTypesInputMod.MaxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: typingsJapgolly.wixStyleReact.distTypesInputMod.MinValue): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setValue(value: typingsJapgolly.wixStyleReact.distTypesInputMod.InputValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
