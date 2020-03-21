package typingsJapgolly.ckeditor.CKEDITOR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.undefined
  var lang: js.UndefOr[String | js.Array[String]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var requires: js.UndefOr[String | js.Array[String]] = js.undefined
}

object pluginDefinition {
  @scala.inline
  def apply(
    afterInit: /* editor */ editor => CallbackTo[js.Any] = null,
    beforeInit: /* editor */ editor => CallbackTo[js.Any] = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    init: /* editor */ editor => Callback = null,
    lang: String | js.Array[String] = null,
    onLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    requires: String | js.Array[String] = null
  ): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.ckeditor.CKEDITOR.editor) => afterInit(t0).runNow()))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.ckeditor.CKEDITOR.editor) => beforeInit(t0).runNow()))
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.ckeditor.CKEDITOR.editor) => init(t0).runNow()))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluginDefinition]
  }
}

