package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.coreEventManagerMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/async_observer", JSImport.Namespace)
@js.native
object utilAsyncObserverMod extends js.Object {
  @js.native
  class AsyncObserver[T] protected () extends Observer[T] {
    def this(observer: Observer[T]) = this()
    /**
      * When set to true, will not raise future events. Necessary to deal with
      * async detachment of listener.
      */
    var muted: js.Any = js.native
    var observer: js.Any = js.native
    var scheduleEvent: js.Any = js.native
    def mute(): Unit = js.native
  }
  
}

