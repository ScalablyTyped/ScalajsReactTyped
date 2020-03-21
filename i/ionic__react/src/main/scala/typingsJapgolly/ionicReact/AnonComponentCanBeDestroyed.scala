package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentCanBeDestroyed extends js.Object {
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback]
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback]
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback]
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback]
  def componentCanBeDestroyed(): Unit
  def ionViewDidEnter(): Unit
  def ionViewDidLeave(): Unit
  def ionViewWillEnter(): Unit
  def ionViewWillLeave(): Unit
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit
}

object AnonComponentCanBeDestroyed {
  @scala.inline
  def apply(
    componentCanBeDestroyed: Callback,
    ionViewDidEnter: Callback,
    ionViewDidEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewDidLeave: Callback,
    ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback],
    ionViewWillEnter: Callback,
    ionViewWillEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewWillLeave: Callback,
    ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback],
    onComponentCanBeDestroyed: js.Function0[Unit] => Callback,
    onIonViewDidEnter: LifeCycleCallback => Callback,
    onIonViewDidLeave: LifeCycleCallback => Callback,
    onIonViewWillEnter: LifeCycleCallback => Callback,
    onIonViewWillLeave: LifeCycleCallback => Callback,
    componentCanBeDestroyedCallback: js.UndefOr[Callback] = js.undefined
  ): AnonComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(ionViewDidEnterCallbacks = ionViewDidEnterCallbacks.asInstanceOf[js.Any], ionViewDidLeaveCallbacks = ionViewDidLeaveCallbacks.asInstanceOf[js.Any], ionViewWillEnterCallbacks = ionViewWillEnterCallbacks.asInstanceOf[js.Any], ionViewWillLeaveCallbacks = ionViewWillLeaveCallbacks.asInstanceOf[js.Any])
    __obj.updateDynamic("componentCanBeDestroyed")(componentCanBeDestroyed.toJsFn)
    __obj.updateDynamic("ionViewDidEnter")(ionViewDidEnter.toJsFn)
    __obj.updateDynamic("ionViewDidLeave")(ionViewDidLeave.toJsFn)
    __obj.updateDynamic("ionViewWillEnter")(ionViewWillEnter.toJsFn)
    __obj.updateDynamic("ionViewWillLeave")(ionViewWillLeave.toJsFn)
    __obj.updateDynamic("onComponentCanBeDestroyed")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onComponentCanBeDestroyed(t0).runNow()))
    __obj.updateDynamic("onIonViewDidEnter")(js.Any.fromFunction1((t0: typingsJapgolly.ionicReact.ionLifeCycleContextMod.LifeCycleCallback) => onIonViewDidEnter(t0).runNow()))
    __obj.updateDynamic("onIonViewDidLeave")(js.Any.fromFunction1((t0: typingsJapgolly.ionicReact.ionLifeCycleContextMod.LifeCycleCallback) => onIonViewDidLeave(t0).runNow()))
    __obj.updateDynamic("onIonViewWillEnter")(js.Any.fromFunction1((t0: typingsJapgolly.ionicReact.ionLifeCycleContextMod.LifeCycleCallback) => onIonViewWillEnter(t0).runNow()))
    __obj.updateDynamic("onIonViewWillLeave")(js.Any.fromFunction1((t0: typingsJapgolly.ionicReact.ionLifeCycleContextMod.LifeCycleCallback) => onIonViewWillLeave(t0).runNow()))
    componentCanBeDestroyedCallback.foreach(p => __obj.updateDynamic("componentCanBeDestroyedCallback")(p.toJsFn))
    __obj.asInstanceOf[AnonComponentCanBeDestroyed]
  }
}

