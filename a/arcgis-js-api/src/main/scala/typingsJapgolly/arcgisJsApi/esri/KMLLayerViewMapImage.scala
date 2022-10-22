package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMLLayerViewMapImage
  extends StObject
     with Object {
  
  /**
    * The [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var Extent: typingsJapgolly.arcgisJsApi.esri.Extent
  
  /**
    * URL to the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var href: String
  
  /**
    * Map image id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var id: Double
  
  /**
    * Rotation of the map image about its center, in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var rotation: Double
}
object KMLLayerViewMapImage {
  
  inline def apply(
    Extent: Extent,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    href: String,
    id: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double
  ): KMLLayerViewMapImage = {
    val __obj = js.Dynamic.literal(Extent = Extent.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMLLayerViewMapImage]
  }
  
  extension [Self <: KMLLayerViewMapImage](x: Self) {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "Extent", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
