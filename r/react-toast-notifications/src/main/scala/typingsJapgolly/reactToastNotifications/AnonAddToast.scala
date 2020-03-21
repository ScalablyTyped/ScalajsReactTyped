package typingsJapgolly.reactToastNotifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactToastNotifications.mod.AddToast
import typingsJapgolly.reactToastNotifications.mod.Options
import typingsJapgolly.reactToastNotifications.mod.RemoveAllToasts
import typingsJapgolly.reactToastNotifications.mod.RemoveToast
import typingsJapgolly.reactToastNotifications.mod.UpdateToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddToast extends js.Object {
  var addToast: AddToast
  var removeAllToasts: RemoveAllToasts
  var removeToast: RemoveToast
  var toastStack: js.Array[AnonAppearance]
  var updateToast: UpdateToast
}

object AnonAddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
    removeAllToasts: Callback,
    removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback,
    toastStack: js.Array[AnonAppearance],
    updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
  ): AnonAddToast = {
    val __obj = js.Dynamic.literal(toastStack = toastStack.asInstanceOf[js.Any])
    __obj.updateDynamic("addToast")(js.Any.fromFunction3((t0: /* content */ japgolly.scalajs.react.raw.React.Node, t1: /* options */ js.UndefOr[typingsJapgolly.reactToastNotifications.mod.Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]]) => addToast(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeAllToasts")(removeAllToasts.toJsFn)
    __obj.updateDynamic("removeToast")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => removeToast(t0, t1).runNow()))
    __obj.updateDynamic("updateToast")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* options */ js.UndefOr[typingsJapgolly.reactToastNotifications.mod.Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]]) => updateToast(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonAddToast]
  }
}

