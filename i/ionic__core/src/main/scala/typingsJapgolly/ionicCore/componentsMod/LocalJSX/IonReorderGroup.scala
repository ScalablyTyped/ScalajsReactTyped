package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonReorderGroup extends js.Object {
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Event that needs to be listened to in order to complete the reorder action. Once the event has been emitted, the `complete()` method then needs to be called in order to finalize the reorder action.
    */
  var onIonItemReorder: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
}

object IonReorderGroup {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonItemReorder: /* event */ CustomEvent => Callback = null
  ): IonReorderGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onIonItemReorder != null) __obj.updateDynamic("onIonItemReorder")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonItemReorder(t0).runNow()))
    __obj.asInstanceOf[IonReorderGroup]
  }
}

