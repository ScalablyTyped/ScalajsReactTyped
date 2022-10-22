package typingsJapgolly.prex

import typingsJapgolly.esfxCancelable.mod.Cancelable
import typingsJapgolly.prex.outLibCancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibPulsarMod {
  
  @JSImport("prex/out/lib/pulsar", "Pulsar")
  @js.native
  open class Pulsar () extends StObject {
    
    /* private */ var _waiters: Any = js.native
    
    /**
      * Notifies the next waiter.
      */
    def pulse(): Unit = js.native
    
    /**
      * Notifies all waiters.
      */
    def pulseAll(): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
