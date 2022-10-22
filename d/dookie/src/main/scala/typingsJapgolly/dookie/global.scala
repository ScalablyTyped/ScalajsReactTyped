package typingsJapgolly.dookie

import typingsJapgolly.dookie.mod.PushOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dookie {
    
    @JSGlobal("dookie")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pull(uri: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pull")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def pullToStream(uri: String, stream: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullToStream")(uri.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def push(uri: String, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def push(uri: String, data: Any, opts: PushOpts): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(uri.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
}
