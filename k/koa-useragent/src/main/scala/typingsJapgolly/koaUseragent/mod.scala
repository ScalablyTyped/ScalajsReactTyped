package typingsJapgolly.koaUseragent

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-useragent", JSImport.Default)
  @js.native
  val default: Middleware[DefaultState, DefaultContext, Any] = js.native
  
  @JSImport("koa-useragent", "userAgent")
  @js.native
  val userAgent: Middleware[DefaultState, DefaultContext, Any] = js.native
  
  trait UserAgentContext extends StObject {
    
    var userAgent: typingsJapgolly.koaUseragent.distLibUseragentMod.default
  }
  object UserAgentContext {
    
    inline def apply(userAgent: typingsJapgolly.koaUseragent.distLibUseragentMod.default): UserAgentContext = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentContext]
    }
    
    extension [Self <: UserAgentContext](x: Self) {
      
      inline def setUserAgent(value: typingsJapgolly.koaUseragent.distLibUseragentMod.default): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Middleware[DefaultState, DefaultContext, Any]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Middleware[DefaultState, DefaultContext, Any] = default
}
