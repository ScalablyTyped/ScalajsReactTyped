package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Default
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Numeric
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimitiveOverrideValueExpressionInfo
  extends StObject
     with Object {
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var expression: String
  
  /**
    * The name of the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The return type of the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var returnType: js.UndefOr[Default | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.String | Numeric] = js.undefined
  
  /**
    * The human readable text that describes the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: CIMExpressionInfo
}
object PrimitiveOverrideValueExpressionInfo {
  
  inline def apply(
    constructor: js.Function,
    expression: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrimitiveOverrideValueExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMExpressionInfo")
    __obj.asInstanceOf[PrimitiveOverrideValueExpressionInfo]
  }
  
  extension [Self <: PrimitiveOverrideValueExpressionInfo](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturnType(value: Default | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.String | Numeric): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: CIMExpressionInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
