package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSolidFill
  extends StObject
     with Object
     with CIMSymbolLayer {
  
  /**
    * The color that is applied to the fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidFill)
    */
  var color: js.Array[Double]
  
  /**
    * A value indicating whether the color can be changed for this symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidFill)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The geometric effects applied to the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidFill)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * A value indicating whether the symbol layer is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidFill)
    */
  var enable: Boolean
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSolidFill)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMSolidFill
}
object CIMSolidFill {
  
  inline def apply(
    color: js.Array[Double],
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMSolidFill = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMSolidFill")
    __obj.asInstanceOf[CIMSolidFill]
  }
  
  extension [Self <: CIMSolidFill](x: Self) {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMSolidFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
