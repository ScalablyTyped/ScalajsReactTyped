package typingsJapgolly.tarn

import typingsJapgolly.tarn.utilsMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/PendingOperation", JSImport.Namespace)
@js.native
object pendingOperationMod extends js.Object {
  @js.native
  class PendingOperation[T] protected () extends js.Object {
    def this(timeoutMillis: Double) = this()
    var deferred: Deferred[T] = js.native
    var possibleTimeoutCause: js.Error | Null = js.native
    var promise: js.Promise[T] = js.native
    var timeoutMillis: Double = js.native
    def abort(): Unit = js.native
    def reject(err: js.Error): Unit = js.native
    def resolve(value: T): Unit = js.native
  }
  
}

