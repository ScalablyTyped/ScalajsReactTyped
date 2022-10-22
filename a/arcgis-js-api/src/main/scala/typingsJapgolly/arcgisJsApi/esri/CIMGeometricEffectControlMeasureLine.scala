package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectControlMeasureLine
  extends StObject
     with Object
     with CIMGeometricEffect {
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectControlMeasureLine)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The style of effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectControlMeasureLine)
    */
  var rule: String
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectControlMeasureLine
}
object CIMGeometricEffectControlMeasureLine {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    rule: String
  ): CIMGeometricEffectControlMeasureLine = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectControlMeasureLine")
    __obj.asInstanceOf[CIMGeometricEffectControlMeasureLine]
  }
  
  extension [Self <: CIMGeometricEffectControlMeasureLine](x: Self) {
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectControlMeasureLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
