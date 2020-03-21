package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemSliding extends js.Object {
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
}

object IonItemSliding {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onIonDrag: /* event */ CustomEvent => Callback = null
  ): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onIonDrag != null) __obj.updateDynamic("onIonDrag")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonDrag(t0).runNow()))
    __obj.asInstanceOf[IonItemSliding]
  }
}

