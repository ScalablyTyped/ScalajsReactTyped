package typingsJapgolly.mobx.coreObservableMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mobx.derivationMod.IDerivation
import typingsJapgolly.mobx.derivationMod.IDerivationState
import typingsJapgolly.mobx.utilsMod.Lambda
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservable extends IDepTreeNode {
  var diffValue: Double
  var isBeingObserved: Boolean
  var isPendingUnobservation: Boolean
  /**
    * Id of the derivation *run* that last accessed this observable.
    * If this id equals the *run* id of the current derivation,
    * the dependency is already established
    */
  var lastAccessedBy: Double
  var lowestObserverState: IDerivationState
  var observers: Set[IDerivation]
  var onBecomeObservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
  var onBecomeUnobservedListeners: js.UndefOr[Set[Lambda]] = js.undefined
  def onBecomeObserved(): Unit
  def onBecomeUnobserved(): Unit
}

object IObservable {
  @scala.inline
  def apply(
    diffValue: Double,
    isBeingObserved: Boolean,
    isPendingUnobservation: Boolean,
    lastAccessedBy: Double,
    lowestObserverState: IDerivationState,
    name: String,
    observers: Set[IDerivation],
    onBecomeObserved: Callback,
    onBecomeUnobserved: Callback,
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: Set[Lambda] = null,
    onBecomeUnobservedListeners: Set[Lambda] = null
  ): IObservable = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any])
    __obj.updateDynamic("onBecomeObserved")(onBecomeObserved.toJsFn)
    __obj.updateDynamic("onBecomeUnobserved")(onBecomeUnobserved.toJsFn)
    if (observing != null) __obj.updateDynamic("observing")(observing.asInstanceOf[js.Any])
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners.asInstanceOf[js.Any])
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservable]
  }
}

