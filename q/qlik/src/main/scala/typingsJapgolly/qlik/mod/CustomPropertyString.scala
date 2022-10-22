package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings._empty
import typingsJapgolly.qlik.qlikStrings.always
import typingsJapgolly.qlik.qlikStrings.optional
import typingsJapgolly.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyString
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[always | optional | _empty] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyString: string
}
object CustomPropertyString {
  
  inline def apply(): CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[CustomPropertyString]
  }
  
  extension [Self <: CustomPropertyString](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExpression(value: always | optional | _empty): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
