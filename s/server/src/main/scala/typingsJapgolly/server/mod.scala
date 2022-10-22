package typingsJapgolly.server

import typingsJapgolly.server.replyMod.Reply
import typingsJapgolly.server.routerMod.Router
import typingsJapgolly.server.typingsCommonMod.Context
import typingsJapgolly.server.typingsCommonMod.Middlewares
import typingsJapgolly.server.typingsOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = ^.asInstanceOf[js.Dynamic].apply(middlewares.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Context]]
  inline def apply(
    options: Options,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], middlewares.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Context]]
  
  @JSImport("server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("server", "reply")
  @js.native
  val reply: Reply = js.native
  
  @JSImport("server", "router")
  @js.native
  val router: Router = js.native
}
