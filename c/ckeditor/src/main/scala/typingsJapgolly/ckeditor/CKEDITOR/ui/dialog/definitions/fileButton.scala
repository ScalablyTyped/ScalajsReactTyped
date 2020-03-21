package typingsJapgolly.ckeditor.CKEDITOR.ui.dialog.definitions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fileButton extends js.Object {
  var `for`: String
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object fileButton {
  @scala.inline
  def apply(`for`: String, validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined): fileButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[fileButton]
  }
}

