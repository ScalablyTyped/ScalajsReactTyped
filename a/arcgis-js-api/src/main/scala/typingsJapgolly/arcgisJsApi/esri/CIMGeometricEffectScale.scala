package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectScale
  extends StObject
     with Object
     with CIMGeometricEffect {
  
  /**
    * The amount of change in size of a symbol in the x-axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectScale)
    */
  var XScaleFactor: Double
  
  /**
    * The amount of change in size of a symbol in the x-axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectScale)
    */
  var YScaleFactor: Double
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectScale)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale
}
object CIMGeometricEffectScale {
  
  inline def apply(
    XScaleFactor: Double,
    YScaleFactor: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal(XScaleFactor = XScaleFactor.asInstanceOf[js.Any], YScaleFactor = YScaleFactor.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMGeometricEffectScale")
    __obj.asInstanceOf[CIMGeometricEffectScale]
  }
  
  extension [Self <: CIMGeometricEffectScale](x: Self) {
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXScaleFactor(value: Double): Self = StObject.set(x, "XScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setYScaleFactor(value: Double): Self = StObject.set(x, "YScaleFactor", value.asInstanceOf[js.Any])
  }
}
