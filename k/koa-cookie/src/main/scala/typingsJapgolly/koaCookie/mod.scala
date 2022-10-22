package typingsJapgolly.koaCookie

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait BaseContext extends StObject {
      
      var cookie: Record[String, Any]
    }
    object BaseContext {
      
      inline def apply(cookie: Record[String, Any]): BaseContext = {
        val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseContext]
      }
      
      extension [Self <: BaseContext](x: Self) {
        
        inline def setCookie(value: Record[String, Any]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      }
    }
  }
}
