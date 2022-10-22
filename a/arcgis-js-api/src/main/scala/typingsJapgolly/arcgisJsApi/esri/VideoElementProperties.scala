package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoElementProperties
  extends StObject
     with MediaElementBaseProperties {
  
  var `type`: js.UndefOr[video] = js.undefined
  
  /**
    * The video element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#video)
    */
  var video: js.UndefOr[String | Any] = js.undefined
}
object VideoElementProperties {
  
  inline def apply(): VideoElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoElementProperties]
  }
  
  extension [Self <: VideoElementProperties](x: Self) {
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVideo(value: String | Any): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
