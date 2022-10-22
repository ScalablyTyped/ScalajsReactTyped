package typingsJapgolly.knockout.mod

import typingsJapgolly.knockout.knockoutStrings.arrayChange
import typingsJapgolly.knockout.knockoutStrings.asleep
import typingsJapgolly.knockout.knockoutStrings.awake
import typingsJapgolly.knockout.knockoutStrings.beforeChange
import typingsJapgolly.knockout.knockoutStrings.change
import typingsJapgolly.knockout.knockoutStrings.spectate
import typingsJapgolly.knockout.mod.utils.ArrayChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribableFunctions[T]
  extends js.Function {
  
  def extend(requestedExtenders: ObservableExtenderOptions[T]): this.type = js.native
  @JSName("extend")
  def extend_S_S[S /* <: Subscribable_[T] */](requestedExtenders: ObservableExtenderOptions[T]): S = js.native
  
  def getSubscriptionsCount(): Double = js.native
  def getSubscriptionsCount(event: String): Double = js.native
  
  def init[S /* <: Subscribable_[Any] */](instance: S): Unit = js.native
  
  def notifySubscribers(): Unit = js.native
  def notifySubscribers(valueToWrite: T): Unit = js.native
  def notifySubscribers(valueToWrite: T, event: String): Unit = js.native
  def notifySubscribers(valueToWrite: Unit, event: String): Unit = js.native
  
  def subscribe[TTarget](callback: SubscriptionCallback[T, TTarget]): Subscription = js.native
  def subscribe[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget): Subscription = js.native
  def subscribe[TTarget](
    callback: SubscriptionCallback[T, TTarget],
    callbackTarget: TTarget,
    event: beforeChange | spectate | awake
  ): Subscription = js.native
  def subscribe[X, TTarget](callback: SubscriptionCallback[X, TTarget], callbackTarget: TTarget, event: String): Subscription = js.native
  @JSName("subscribe")
  def subscribe_arrayChange[TTarget](
    callback: SubscriptionCallback[ArrayChanges[Flatten[T]], TTarget],
    callbackTarget: TTarget,
    event: arrayChange
  ): Subscription = js.native
  @JSName("subscribe")
  def subscribe_asleep[TTarget](callback: SubscriptionCallback[Unit, TTarget], callbackTarget: TTarget, event: asleep): Subscription = js.native
  @JSName("subscribe")
  def subscribe_change[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: TTarget, event: change): Subscription = js.native
  @JSName("subscribe")
  def subscribe_change[TTarget](callback: SubscriptionCallback[T, TTarget], callbackTarget: Unit, event: change): Subscription = js.native
}
