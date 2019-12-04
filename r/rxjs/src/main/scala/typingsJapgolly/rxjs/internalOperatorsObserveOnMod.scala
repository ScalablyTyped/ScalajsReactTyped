package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalNotificationMod.Notification
import typingsJapgolly.rxjs.internalOperatorMod.Operator
import typingsJapgolly.rxjs.internalOperatorsObserveOnMod.ObserveOnMessage
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.PartialObserver
import typingsJapgolly.rxjs.internalTypesMod.SchedulerAction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/observeOn", JSImport.Namespace)
@js.native
object internalOperatorsObserveOnMod extends js.Object {
  @js.native
  class ObserveOnMessage protected () extends js.Object {
    def this(notification: Notification[_], destination: PartialObserver[_]) = this()
    var destination: PartialObserver[_] = js.native
    var notification: Notification[_] = js.native
  }
  
  @js.native
  class ObserveOnOperator[T] protected () extends Operator[T, T] {
    def this(scheduler: SchedulerLike) = this()
    def this(scheduler: SchedulerLike, delay: Double) = this()
    var delay: js.Any = js.native
    var scheduler: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[T], source: js.Any): TeardownLogic = js.native
  }
  
  @js.native
  class ObserveOnSubscriber[T] protected () extends Subscriber[T] {
    def this(destination: Subscriber[T], scheduler: SchedulerLike) = this()
    def this(destination: Subscriber[T], scheduler: SchedulerLike, delay: Double) = this()
    var delay: js.Any = js.native
    var scheduleMessage: js.Any = js.native
    var scheduler: js.Any = js.native
  }
  
  def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
  /* static members */
  @js.native
  object ObserveOnSubscriber extends js.Object {
    /** @nocollapse */
    def dispatch(`this`: SchedulerAction[ObserveOnMessage], arg: ObserveOnMessage): Unit = js.native
  }
  
}

