package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  var history: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    change: js.UndefOr[Callback] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    name: String = null,
    search: js.UndefOr[Boolean] = js.undefined
  ): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    change.foreach(p => __obj.updateDynamic("change")(p.toJsFn))
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorOptions]
  }
}

