package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: js.UndefOr[js.Function2[/* itemElement */ dxElement, /* itemData */ js.Any, _]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonAction {
  @scala.inline
  def apply(
    action: (/* itemElement */ dxElement, /* itemData */ js.Any) => CallbackTo[js.Any] = null,
    text: String = null
  ): AnonAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2((t0: /* itemElement */ typingsJapgolly.devextreme.mod.DevExpress.core.dxElement, t1: /* itemData */ js.Any) => action(t0, t1).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

