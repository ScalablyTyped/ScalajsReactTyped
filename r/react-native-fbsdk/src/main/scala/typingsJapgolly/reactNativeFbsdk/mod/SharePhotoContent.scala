package typingsJapgolly.reactNativeFbsdk.mod

import typingsJapgolly.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePhotoContent
  extends StObject
     with ShareContent {
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  
  /**
    * The type of content to be shared is photo.
    */
  var contentType: photo
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto]
}
object SharePhotoContent {
  
  inline def apply(photos: js.Array[SharePhoto]): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = "photo", photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePhotoContent]
  }
  
  extension [Self <: SharePhotoContent](x: Self) {
    
    inline def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    inline def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    inline def setContentType(value: photo): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setPhotos(value: js.Array[SharePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: SharePhoto*): Self = StObject.set(x, "photos", js.Array(value*))
  }
}
