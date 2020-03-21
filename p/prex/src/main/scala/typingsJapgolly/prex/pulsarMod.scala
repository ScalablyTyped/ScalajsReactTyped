package typingsJapgolly.prex

import typingsJapgolly.esfxCancelable.distMod.Cancelable
import typingsJapgolly.prex.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/pulsar", JSImport.Namespace)
@js.native
object pulsarMod extends js.Object {
  @js.native
  class Pulsar () extends js.Object {
    var _waiters: js.Any = js.native
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

