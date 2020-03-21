package typingsJapgolly.uifabricUtilities.selectionSelectionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionOptions[TItem] extends js.Object {
  var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.undefined
  /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
  var getKey: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
}

object ISelectionOptions {
  @scala.inline
  def apply[TItem](
    canSelectItem: (/* item */ TItem, /* index */ js.UndefOr[Double]) => CallbackTo[Boolean] = null,
    getKey: (/* item */ TItem, /* index */ js.UndefOr[Double]) => CallbackTo[String | Double] = null,
    onSelectionChanged: js.UndefOr[Callback] = js.undefined,
    selectionMode: SelectionMode = null
  ): ISelectionOptions[TItem] = {
    val __obj = js.Dynamic.literal()
    if (canSelectItem != null) __obj.updateDynamic("canSelectItem")(js.Any.fromFunction2((t0: /* item */ TItem, t1: /* index */ js.UndefOr[scala.Double]) => canSelectItem(t0, t1).runNow()))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction2((t0: /* item */ TItem, t1: /* index */ js.UndefOr[scala.Double]) => getKey(t0, t1).runNow()))
    onSelectionChanged.foreach(p => __obj.updateDynamic("onSelectionChanged")(p.toJsFn))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionOptions[TItem]]
  }
}

