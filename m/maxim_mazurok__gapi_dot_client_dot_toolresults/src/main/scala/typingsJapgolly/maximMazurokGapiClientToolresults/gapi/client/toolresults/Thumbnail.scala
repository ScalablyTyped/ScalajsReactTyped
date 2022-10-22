package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnail extends StObject {
  
  /** The thumbnail's content type, i.e. "image/png". Always set. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The thumbnail file itself. That is, the bytes here are precisely the bytes that make up the thumbnail file; they can be served as an image as-is (with the appropriate content type.)
    * Always set.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /** The height of the thumbnail, in pixels. Always set. */
  var heightPx: js.UndefOr[Double] = js.undefined
  
  /** The width of the thumbnail, in pixels. Always set. */
  var widthPx: js.UndefOr[Double] = js.undefined
}
object Thumbnail {
  
  inline def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  extension [Self <: Thumbnail](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeightPx(value: Double): Self = StObject.set(x, "heightPx", value.asInstanceOf[js.Any])
    
    inline def setHeightPxUndefined: Self = StObject.set(x, "heightPx", js.undefined)
    
    inline def setWidthPx(value: Double): Self = StObject.set(x, "widthPx", value.asInstanceOf[js.Any])
    
    inline def setWidthPxUndefined: Self = StObject.set(x, "widthPx", js.undefined)
  }
}
