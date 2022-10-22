package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageryLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * An object that provides the user access to [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) and their values in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelData: js.UndefOr[PixelData] = js.undefined
}
object ImageryLayerViewProperties {
  
  inline def apply(): ImageryLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryLayerViewProperties]
  }
  
  extension [Self <: ImageryLayerViewProperties](x: Self) {
    
    inline def setPixelData(value: PixelData): Self = StObject.set(x, "pixelData", value.asInstanceOf[js.Any])
    
    inline def setPixelDataUndefined: Self = StObject.set(x, "pixelData", js.undefined)
  }
}
