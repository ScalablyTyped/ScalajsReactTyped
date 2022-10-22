package typingsJapgolly.arcgisJsApi.anon

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ImageData
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ImageElementProperties & {  type :'image'} */
trait ImageElementPropertiestyp extends StObject {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  var georeference: js.UndefOr[ExtentAndRotationGeorefer | CornersGeoreferenceProper] = js.undefined
  
  /**
    * The image element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#image)
    */
  var image: js.UndefOr[String | HTMLImageElement | HTMLCanvasElement | ImageData] = js.undefined
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[image] & image
}
object ImageElementPropertiestyp {
  
  inline def apply(`type`: js.UndefOr[image] & image): ImageElementPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageElementPropertiestyp]
  }
  
  extension [Self <: ImageElementPropertiestyp](x: Self) {
    
    inline def setGeoreference(value: ExtentAndRotationGeorefer | CornersGeoreferenceProper): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setGeoreferenceUndefined: Self = StObject.set(x, "georeference", js.undefined)
    
    inline def setImage(value: String | HTMLImageElement | HTMLCanvasElement | ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: js.UndefOr[image] & image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
