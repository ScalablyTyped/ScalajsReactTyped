package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jpm.toolbarMod.Toolbar
import typingsJapgolly.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHidden extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[ToolbarItem]
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.undefined
  var title: String
}

object AnonHidden {
  @scala.inline
  def apply(
    items: js.Array[ToolbarItem],
    title: String,
    hidden: js.UndefOr[Boolean] = js.undefined,
    onAttach: /* toolbar */ Toolbar => CallbackTo[js.Any] = null,
    onDetach: /* toolbar */ Toolbar => CallbackTo[js.Any] = null,
    onHide: /* toolbar */ Toolbar => CallbackTo[js.Any] = null,
    onShow: /* toolbar */ Toolbar => CallbackTo[js.Any] = null
  ): AnonHidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (onAttach != null) __obj.updateDynamic("onAttach")(js.Any.fromFunction1((t0: /* toolbar */ typingsJapgolly.jpm.toolbarMod.Toolbar) => onAttach(t0).runNow()))
    if (onDetach != null) __obj.updateDynamic("onDetach")(js.Any.fromFunction1((t0: /* toolbar */ typingsJapgolly.jpm.toolbarMod.Toolbar) => onDetach(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* toolbar */ typingsJapgolly.jpm.toolbarMod.Toolbar) => onHide(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* toolbar */ typingsJapgolly.jpm.toolbarMod.Toolbar) => onShow(t0).runNow()))
    __obj.asInstanceOf[AnonHidden]
  }
}

