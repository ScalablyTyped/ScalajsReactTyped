package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMediaInfoValueProperties extends StObject {
  
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: js.UndefOr[String] = js.undefined
  
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: js.UndefOr[String] = js.undefined
}
object ImageMediaInfoValueProperties {
  
  inline def apply(): ImageMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMediaInfoValueProperties]
  }
  
  extension [Self <: ImageMediaInfoValueProperties](x: Self) {
    
    inline def setLinkURL(value: String): Self = StObject.set(x, "linkURL", value.asInstanceOf[js.Any])
    
    inline def setLinkURLUndefined: Self = StObject.set(x, "linkURL", js.undefined)
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
  }
}
