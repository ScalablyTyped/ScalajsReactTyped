package typingsJapgolly.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoIdString extends StObject {
  
  var photoId: String
}
object PhotoIdString {
  
  inline def apply(photoId: String): PhotoIdString = {
    val __obj = js.Dynamic.literal(photoId = photoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoIdString]
  }
  
  extension [Self <: PhotoIdString](x: Self) {
    
    inline def setPhotoId(value: String): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
  }
}
