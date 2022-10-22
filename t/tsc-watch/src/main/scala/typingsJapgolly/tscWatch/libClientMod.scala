package typingsJapgolly.tscWatch

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.tscWatch.tscWatchStrings.compile_errors
import typingsJapgolly.tscWatch.tscWatchStrings.first_success
import typingsJapgolly.tscWatch.tscWatchStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("tsc-watch/lib/client", JSImport.Namespace)
  @js.native
  open class ^ () extends TscWatchClient
  
  @js.native
  trait TscWatchClient extends EventEmitter {
    
    def kill(): Unit = js.native
    
    /**
      * Emitted upon every failing compilation
      */
    @JSName("on")
    def on_compileerrors(event: compile_errors, cb: js.Function0[Any]): this.type = js.native
    // tslint:disable:unified-signatures
    /**
      * Emitted upon first successful compilation
      */
    @JSName("on")
    def on_firstsuccess(event: first_success, cb: js.Function0[Any]): this.type = js.native
    /**
      * Emitted upon first successful compilation
      */
    @JSName("on")
    def on_success(event: success, cb: js.Function0[Any]): this.type = js.native
    
    def start(args: Any*): Unit = js.native
  }
}
