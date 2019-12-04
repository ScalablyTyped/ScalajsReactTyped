package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalSchedulerMod.Scheduler
import typingsJapgolly.rxjs.internalTestingSubscriptionLogMod.SubscriptionLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/SubscriptionLoggable", JSImport.Namespace)
@js.native
object internalTestingSubscriptionLoggableMod extends js.Object {
  @js.native
  class SubscriptionLoggable () extends js.Object {
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
  }
  
}

