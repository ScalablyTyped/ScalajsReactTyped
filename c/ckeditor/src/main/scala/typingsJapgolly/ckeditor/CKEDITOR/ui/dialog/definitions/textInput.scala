package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textInput extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object textInput {
  @scala.inline
  def apply(
    default: String = null,
    maxLength: Int | Double = null,
    size: String = null,
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): textInput = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[textInput]
  }
}

