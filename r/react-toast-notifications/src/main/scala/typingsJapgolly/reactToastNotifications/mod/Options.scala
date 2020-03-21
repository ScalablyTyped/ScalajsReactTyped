package typingsJapgolly.reactToastNotifications.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var appearance: AppearanceTypes
  var autoDismiss: js.UndefOr[Boolean] = js.undefined
  var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appearance: AppearanceTypes,
    autoDismiss: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* id */ String => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => onDismiss(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

