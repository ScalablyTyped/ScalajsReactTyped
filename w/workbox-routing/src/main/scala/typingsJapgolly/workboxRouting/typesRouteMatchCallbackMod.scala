package typingsJapgolly.workboxRouting

import org.scalajs.dom.Request
import org.scalajs.dom.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRouteMatchCallbackMod {
  
  type RouteMatchCallback[R] = js.Function1[/* options */ RouteMatchCallbackOptions, R]
  
  trait RouteMatchCallbackOptions extends StObject {
    
    var event: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var url: URL
  }
  object RouteMatchCallbackOptions {
    
    inline def apply(url: URL): RouteMatchCallbackOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteMatchCallbackOptions]
    }
    
    extension [Self <: RouteMatchCallbackOptions](x: Self) {
      
      inline def setEvent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
      ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
