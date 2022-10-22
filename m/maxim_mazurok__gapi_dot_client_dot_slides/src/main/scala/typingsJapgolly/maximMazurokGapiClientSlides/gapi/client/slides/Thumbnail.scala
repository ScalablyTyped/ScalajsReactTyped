package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnail extends StObject {
  
  /**
    * The content URL of the thumbnail image. The URL to the image has a default lifetime of 30 minutes. This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the image as the original requester. Access to the image may be lost if the presentation's sharing settings change. The mime type of the thumbnail image is the
    * same as specified in the `GetPageThumbnailRequest`.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /** The positive height in pixels of the thumbnail image. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The positive width in pixels of the thumbnail image. */
  var width: js.UndefOr[Double] = js.undefined
}
object Thumbnail {
  
  inline def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  extension [Self <: Thumbnail](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
