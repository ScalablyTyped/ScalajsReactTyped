package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendLayerInfos
  extends StObject
     with Object {
  
  /**
    * A layer to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layer: Layer
  
  /**
    * Only applicable if the `layer` is a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var sublayerIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies a title for the layer to display above its symbols and descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var title: js.UndefOr[String] = js.undefined
}
object LegendLayerInfos {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LegendLayerInfos]
  }
  
  extension [Self <: LegendLayerInfos](x: Self) {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSublayerIds(value: js.Array[Double]): Self = StObject.set(x, "sublayerIds", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdsUndefined: Self = StObject.set(x, "sublayerIds", js.undefined)
    
    inline def setSublayerIdsVarargs(value: Double*): Self = StObject.set(x, "sublayerIds", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
