package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Custom
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.FullGap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.FullPattern
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.HalfGap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.HalfPattern
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.NoConstraint
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectDashes
  extends StObject
     with Object
     with CIMGeometricEffect {
  
  /**
    * Where the pattern should end relative to the ending point of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDashes)
    */
  var customEndingOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance for each dash and gap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDashes)
    */
  var dashTemplate: js.Array[Double]
  
  /**
    * The setting which determines how the strokes with dash patterns are handled at the end points of the line geometry's segments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDashes)
    */
  var lineDashEnding: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom
  
  /**
    * The position where the pattern should begin relative to the starting point of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDashes)
    */
  var offsetAlongLine: Double
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDashes)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes
}
object CIMGeometricEffectDashes {
  
  inline def apply(
    constructor: js.Function,
    dashTemplate: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    lineDashEnding: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom,
    offsetAlongLine: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMGeometricEffectDashes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dashTemplate = dashTemplate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lineDashEnding = lineDashEnding.asInstanceOf[js.Any], offsetAlongLine = offsetAlongLine.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectDashes")
    __obj.asInstanceOf[CIMGeometricEffectDashes]
  }
  
  extension [Self <: CIMGeometricEffectDashes](x: Self) {
    
    inline def setCustomEndingOffset(value: Double): Self = StObject.set(x, "customEndingOffset", value.asInstanceOf[js.Any])
    
    inline def setCustomEndingOffsetUndefined: Self = StObject.set(x, "customEndingOffset", js.undefined)
    
    inline def setDashTemplate(value: js.Array[Double]): Self = StObject.set(x, "dashTemplate", value.asInstanceOf[js.Any])
    
    inline def setDashTemplateVarargs(value: Double*): Self = StObject.set(x, "dashTemplate", js.Array(value*))
    
    inline def setLineDashEnding(value: NoConstraint | HalfPattern | HalfGap | FullPattern | FullGap | Custom): Self = StObject.set(x, "lineDashEnding", value.asInstanceOf[js.Any])
    
    inline def setOffsetAlongLine(value: Double): Self = StObject.set(x, "offsetAlongLine", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDashes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
