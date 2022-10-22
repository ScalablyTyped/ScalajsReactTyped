package typingsJapgolly.architectSandbox

import typingsJapgolly.architectSandbox.sharedMod.Callback
import typingsJapgolly.architectSandbox.sharedMod.StartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  object http {
    
    @JSImport("@architect/sandbox/http", "http")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Shuts down anything started by sandbox.http.start(). Invokes callback once shut down, or returns a promise if callback is falsy.
      */
    inline def end(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[js.Promise[String]]
    inline def end(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Starts up a local HTTP and WebSocket servers, enabling @http or [@websocket][websocket] functions (if defined in your Architect project manifest).
      *
      * Invokes callback once everything is ready, or returns a promise if callback is falsy.
      */
    inline def start(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[String]]
    inline def start(opts: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def start(opts: StartOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def start(opts: StartOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
