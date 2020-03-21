package typingsJapgolly.handsontable.mod.Handsontable.contextMenu

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function3[
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.undefined
  var items: js.Array[PredefinedMenuItemKey] | MenuConfig
}

object Settings {
  @scala.inline
  def apply(
    items: js.Array[PredefinedMenuItemKey] | MenuConfig,
    callback: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Callback = null
  ): Settings = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3((t0: /* key */ java.lang.String, t1: /* selection */ js.Array[typingsJapgolly.handsontable.mod.Handsontable.contextMenu.Selection], t2: /* clickEvent */ org.scalajs.dom.raw.MouseEvent) => callback(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Settings]
  }
}

