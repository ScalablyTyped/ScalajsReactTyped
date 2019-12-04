package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalSchedulerMod.Scheduler
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.internalTestingSubscriptionLogMod.SubscriptionLog
import typingsJapgolly.rxjs.internalTestingTestMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/testing/ColdObservable", JSImport.Namespace)
@js.native
object internalTestingColdObservableMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.rxjs.internalTestingSubscriptionLoggableMod.SubscriptionLoggable because Inheritance from two classes. Inlined subscriptions, scheduler, logSubscribedFrame, logUnsubscribedFrame */ @js.native
  class ColdObservable[T] protected () extends Observable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
    var messages: js.Array[TestMessage] = js.native
    var scheduler: Scheduler = js.native
    var subscriptions: js.Array[SubscriptionLog] = js.native
    def logSubscribedFrame(): Double = js.native
    def logUnsubscribedFrame(index: Double): Unit = js.native
    def scheduleMessages(subscriber: Subscriber[_]): Unit = js.native
  }
  
}

