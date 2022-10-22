package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.VideoElementProperties & {  type :'video'} */
trait VideoElementPropertiestyp extends StObject {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  var georeference: js.UndefOr[ExtentAndRotationGeorefer | CornersGeoreferenceProper] = js.undefined
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[video] & video
  
  /**
    * The video element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#video)
    */
  var video: js.UndefOr[String | Any] = js.undefined
}
object VideoElementPropertiestyp {
  
  inline def apply(`type`: js.UndefOr[video] & video): VideoElementPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoElementPropertiestyp]
  }
  
  extension [Self <: VideoElementPropertiestyp](x: Self) {
    
    inline def setGeoreference(value: ExtentAndRotationGeorefer | CornersGeoreferenceProper): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setGeoreferenceUndefined: Self = StObject.set(x, "georeference", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: js.UndefOr[video] & video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: String | Any): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
