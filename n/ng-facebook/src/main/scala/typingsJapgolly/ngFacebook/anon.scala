package typingsJapgolly.ngFacebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<facebook-js-sdk.facebook.InitParams> */
  trait PartialInitParams extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var autoLogAppEvents: js.UndefOr[Boolean] = js.undefined
    
    var cookie: js.UndefOr[Boolean] = js.undefined
    
    var frictionlessRequests: js.UndefOr[Boolean] = js.undefined
    
    var hideFlashCallback: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var xfbml: js.UndefOr[Boolean] = js.undefined
  }
  object PartialInitParams {
    
    inline def apply(): PartialInitParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInitParams]
    }
    
    extension [Self <: PartialInitParams](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAutoLogAppEvents(value: Boolean): Self = StObject.set(x, "autoLogAppEvents", value.asInstanceOf[js.Any])
      
      inline def setAutoLogAppEventsUndefined: Self = StObject.set(x, "autoLogAppEvents", js.undefined)
      
      inline def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setFrictionlessRequests(value: Boolean): Self = StObject.set(x, "frictionlessRequests", value.asInstanceOf[js.Any])
      
      inline def setFrictionlessRequestsUndefined: Self = StObject.set(x, "frictionlessRequests", js.undefined)
      
      inline def setHideFlashCallback(value: Boolean): Self = StObject.set(x, "hideFlashCallback", value.asInstanceOf[js.Any])
      
      inline def setHideFlashCallbackUndefined: Self = StObject.set(x, "hideFlashCallback", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      inline def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
