package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait checkbox extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object checkbox {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): checkbox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[checkbox]
  }
}

