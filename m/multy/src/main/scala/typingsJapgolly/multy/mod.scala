package typingsJapgolly.multy

import typingsJapgolly.busboy.mod.BusboyConfig
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: BusboyConfig): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("multy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Request extends StObject {
      
      var body: Any
    }
    object Request {
      
      inline def apply(body: Any): Request = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      }
    }
  }
}
