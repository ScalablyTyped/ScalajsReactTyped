package typingsJapgolly.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOptions extends StObject {
  
  /** returns the base64 string representation (inline) of actual image */
  var dataURI: js.UndefOr[Boolean] = js.undefined
  
  /** returns the thumbnail of actual image */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
}
object ImageOptions {
  
  inline def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  extension [Self <: ImageOptions](x: Self) {
    
    inline def setDataURI(value: Boolean): Self = StObject.set(x, "dataURI", value.asInstanceOf[js.Any])
    
    inline def setDataURIUndefined: Self = StObject.set(x, "dataURI", js.undefined)
    
    inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
