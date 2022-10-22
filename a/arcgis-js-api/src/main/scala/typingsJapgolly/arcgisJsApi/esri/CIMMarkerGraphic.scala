package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerGraphic
  extends StObject
     with Object {
  
  /**
    * The geometry of the marker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerGraphic)
    */
  var geometry: Any
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerGraphic)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The symbol used to draw the marker graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerGraphic)
    */
  var symbol: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol | CIMTextSymbol
  
  /**
    * The text that is defined within the marker if drawn with a text symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMMarkerGraphic)
    */
  var textString: js.UndefOr[String] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic
}
object CIMMarkerGraphic {
  
  inline def apply(
    constructor: js.Function,
    geometry: Any,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol | CIMTextSymbol
  ): CIMMarkerGraphic = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMMarkerGraphic")
    __obj.asInstanceOf[CIMMarkerGraphic]
  }
  
  extension [Self <: CIMMarkerGraphic](x: Self) {
    
    inline def setGeometry(value: Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setSymbol(value: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol | CIMTextSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTextString(value: String): Self = StObject.set(x, "textString", value.asInstanceOf[js.Any])
    
    inline def setTextStringUndefined: Self = StObject.set(x, "textString", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
