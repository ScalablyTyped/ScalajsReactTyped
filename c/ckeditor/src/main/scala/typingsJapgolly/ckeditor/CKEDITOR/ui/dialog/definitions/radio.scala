package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait radio extends js.Object {
  var default: js.Any
  var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object radio {
  @scala.inline
  def apply(
    default: js.Any,
    items: js.Array[(js.Tuple2[String, String]) | js.Array[String]],
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): radio = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[radio]
  }
}

