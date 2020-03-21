package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var evalTemplate: js.UndefOr[Boolean] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  var model: js.UndefOr[js.Object] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    evalTemplate: js.UndefOr[Boolean] = js.undefined,
    hide: /* e */ ViewEvent => Callback = null,
    init: /* e */ ViewEvent => Callback = null,
    model: js.Object = null,
    show: /* e */ ViewEvent => Callback = null,
    tagName: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(evalTemplate)) __obj.updateDynamic("evalTemplate")(evalTemplate.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ViewEvent) => hide(t0).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ViewEvent) => init(t0).runNow()))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ViewEvent) => show(t0).runNow()))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}

