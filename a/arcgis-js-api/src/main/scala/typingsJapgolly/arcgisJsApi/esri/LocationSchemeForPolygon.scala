package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSchemeForPolygon
  extends StObject
     with Object
     with LocationScheme {
  
  /**
    * The color of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var color: Color_
  
  /**
    * The opacity of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var opacity: Double
  
  /**
    * Properties for defining the outline of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-location.html#LocationSchemeForPolygon)
    */
  var outline: LocationSchemeForPolygonOutline
}
object LocationSchemeForPolygon {
  
  inline def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    outline: LocationSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LocationSchemeForPolygon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LocationSchemeForPolygon]
  }
  
  extension [Self <: LocationSchemeForPolygon](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: LocationSchemeForPolygonOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
