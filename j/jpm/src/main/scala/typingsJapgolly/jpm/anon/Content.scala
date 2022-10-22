package typingsJapgolly.jpm.anon

import typingsJapgolly.jpm.FFAddonSDK.SDKURL
import typingsJapgolly.jpm.sdkRequestMod.STResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content[ResponseType] extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | js.Object] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* response */ STResponse[ResponseType], Any]] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String | SDKURL] = js.undefined
}
object Content {
  
  inline def apply[ResponseType](): Content[ResponseType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content[ResponseType]]
  }
  
  extension [Self <: Content[?], ResponseType](x: Self & Content[ResponseType]) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setContent(value: String | js.Object): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOnComplete(value: /* response */ STResponse[ResponseType] => Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setUrl(value: String | SDKURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
