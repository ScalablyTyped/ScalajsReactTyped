package typingsJapgolly.mobx.atomMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.coreObservableMod.IObservable
import typingsJapgolly.mobx.derivationMod.IDerivation
import typingsJapgolly.mobx.derivationMod.IDerivationState
import typingsJapgolly.mobx.utilsMod.Lambda
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtom extends IObservable {
  def reportChanged(): js.Any
  def reportObserved(): js.Any
}

object IAtom {
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
    reportChanged: CallbackTo[js.Any],
    reportObserved: CallbackTo[js.Any],
    observing: js.Array[IObservable] = null,
    onBecomeObservedListeners: Set[Lambda] = null,
    onBecomeUnobservedListeners: Set[Lambda] = null
  ): IAtom = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any])
    __obj.updateDynamic("onBecomeObserved")(onBecomeObserved.toJsFn)
    __obj.updateDynamic("onBecomeUnobserved")(onBecomeUnobserved.toJsFn)
    __obj.updateDynamic("reportChanged")(reportChanged.toJsFn)
    __obj.updateDynamic("reportObserved")(reportObserved.toJsFn)
    if (observing != null) __obj.updateDynamic("observing")(observing.asInstanceOf[js.Any])
    if (onBecomeObservedListeners != null) __obj.updateDynamic("onBecomeObservedListeners")(onBecomeObservedListeners.asInstanceOf[js.Any])
    if (onBecomeUnobservedListeners != null) __obj.updateDynamic("onBecomeUnobservedListeners")(onBecomeUnobservedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAtom]
  }
}

