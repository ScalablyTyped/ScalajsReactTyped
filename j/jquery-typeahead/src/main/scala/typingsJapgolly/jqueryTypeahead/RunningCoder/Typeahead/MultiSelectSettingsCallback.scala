package typingsJapgolly.jqueryTypeahead.RunningCoder.Typeahead

import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectSettingsCallback extends js.Object {
  /** Triggered when a multiselect item is canceled */
  var onCancel: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Triggered when a multiselect item is clicked */
  var onClick: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
}

object MultiSelectSettingsCallback {
  @scala.inline
  def apply(
    onCancel: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onClick: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null
  ): MultiSelectSettingsCallback = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* item */ js.UndefOr[js.Any], t2: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onCancel(t0, t1, t2).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* item */ js.UndefOr[js.Any], t2: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onClick(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MultiSelectSettingsCallback]
  }
}

