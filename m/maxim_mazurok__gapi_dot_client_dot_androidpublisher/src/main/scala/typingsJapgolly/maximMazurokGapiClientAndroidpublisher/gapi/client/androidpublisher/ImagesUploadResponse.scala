package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesUploadResponse extends StObject {
  
  /** The uploaded image. */
  var image: js.UndefOr[Image] = js.undefined
}
object ImagesUploadResponse {
  
  inline def apply(): ImagesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesUploadResponse]
  }
  
  extension [Self <: ImagesUploadResponse](x: Self) {
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
