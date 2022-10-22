package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Accurate
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Bevelled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Fast
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Mitered
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Rounded
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Square
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectOffset
  extends StObject
     with Object
     with CIMGeometricEffect {
  
  /**
    * The way strokes or fills are displayed at corners.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectOffset)
    */
  var method: Mitered | Bevelled | Rounded | Square
  
  /**
    * The distance of the symbol perpendicular to the feature geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectOffset)
    */
  var offset: Double
  
  /**
    * The way the symbol handles complex geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectOffset)
    */
  var option: Fast | Accurate
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectOffset)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset
}
object CIMGeometricEffectOffset {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    method: Mitered | Bevelled | Rounded | Square,
    offset: Double,
    option: Fast | Accurate,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectOffset")
    __obj.asInstanceOf[CIMGeometricEffectOffset]
  }
  
  extension [Self <: CIMGeometricEffectOffset](x: Self) {
    
    inline def setMethod(value: Mitered | Bevelled | Rounded | Square): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOption(value: Fast | Accurate): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
