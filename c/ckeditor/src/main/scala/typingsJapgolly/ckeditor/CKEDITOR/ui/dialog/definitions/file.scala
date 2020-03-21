package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait file extends js.Object {
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object file {
  @scala.inline
  def apply(validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined): file = {
    val __obj = js.Dynamic.literal()
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[file]
  }
}

