package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tooltip //////////////////////////////////////////////////
trait TooltipOptions extends TooltipEvents {
  var content: js.UndefOr[js.Any] = js.undefined
   // () or string
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hide: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var items: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // TODO
  var show: js.UndefOr[js.Any] = js.undefined
   // boolean, number, string or object
  var tooltipClass: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    close: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback = null,
    content: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hide: js.Any = null,
    items: String = null,
    open: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback = null,
    position: js.Any = null,
    show: js.Any = null,
    tooltipClass: String = null,
    track: js.UndefOr[Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.TooltipUIParams) => close(t0, t1).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.TooltipUIParams) => open(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (tooltipClass != null) __obj.updateDynamic("tooltipClass")(tooltipClass.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

