package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.subscribeOnObservableMod.DispatchArg
import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
@js.native
class SubscribeOnObservable[T] protected ()
  extends typingsJapgolly.rxjs.subscribeOnObservableMod.SubscribeOnObservable[T] {
  def this(source: Observable[T]) = this()
  def this(source: Observable[T], delayTime: Double) = this()
  def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
}

/* static members */
@JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
@js.native
object SubscribeOnObservable extends js.Object {
  /** @nocollapse */
  def create[T](source: Observable[T]): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double): Observable[T] = js.native
  def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
  /** @nocollapse */
  def dispatch[T](arg: DispatchArg[T]): Subscription = js.native
}

