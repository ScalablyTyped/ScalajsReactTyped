package typingsJapgolly.ionicReact.ionLifeCycleContextMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonLifeCycleContextInterface extends js.Object {
  def ionViewDidEnter(): Unit
  def ionViewDidLeave(): Unit
  def ionViewWillEnter(): Unit
  def ionViewWillLeave(): Unit
  def onIonViewDidEnter(callback: js.Function0[Unit]): Unit
  def onIonViewDidLeave(callback: js.Function0[Unit]): Unit
  def onIonViewWillEnter(callback: js.Function0[Unit]): Unit
  def onIonViewWillLeave(callback: js.Function0[Unit]): Unit
}

object IonLifeCycleContextInterface {
  @scala.inline
  def apply(
    ionViewDidEnter: Callback,
    ionViewDidLeave: Callback,
    ionViewWillEnter: Callback,
    ionViewWillLeave: Callback,
    onIonViewDidEnter: js.Function0[Unit] => Callback,
    onIonViewDidLeave: js.Function0[Unit] => Callback,
    onIonViewWillEnter: js.Function0[Unit] => Callback,
    onIonViewWillLeave: js.Function0[Unit] => Callback
  ): IonLifeCycleContextInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ionViewDidEnter")(ionViewDidEnter.toJsFn)
    __obj.updateDynamic("ionViewDidLeave")(ionViewDidLeave.toJsFn)
    __obj.updateDynamic("ionViewWillEnter")(ionViewWillEnter.toJsFn)
    __obj.updateDynamic("ionViewWillLeave")(ionViewWillLeave.toJsFn)
    __obj.updateDynamic("onIonViewDidEnter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onIonViewDidEnter(t0).runNow()))
    __obj.updateDynamic("onIonViewDidLeave")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onIonViewDidLeave(t0).runNow()))
    __obj.updateDynamic("onIonViewWillEnter")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onIonViewWillEnter(t0).runNow()))
    __obj.updateDynamic("onIonViewWillLeave")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onIonViewWillLeave(t0).runNow()))
    __obj.asInstanceOf[IonLifeCycleContextInterface]
  }
}

