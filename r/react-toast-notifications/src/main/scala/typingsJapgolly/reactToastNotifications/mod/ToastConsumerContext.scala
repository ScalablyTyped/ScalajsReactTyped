package typingsJapgolly.reactToastNotifications.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactToastNotifications.AnonAppearance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastConsumerContext extends js.Object {
  var add: AddToast
  var remove: RemoveToast
  var toasts: js.Array[AnonAppearance]
}

object ToastConsumerContext {
  @scala.inline
  def apply(
    add: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
    remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback,
    toasts: js.Array[AnonAppearance]
  ): ToastConsumerContext = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: /* content */ japgolly.scalajs.react.raw.React.Node, t1: /* options */ js.UndefOr[typingsJapgolly.reactToastNotifications.mod.Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]]) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[ToastConsumerContext]
  }
}

