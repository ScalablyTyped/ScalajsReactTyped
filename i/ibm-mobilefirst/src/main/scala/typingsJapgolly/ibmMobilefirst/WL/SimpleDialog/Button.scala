package typingsJapgolly.ibmMobilefirst.WL.SimpleDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var handler: js.UndefOr[js.Function] = js.undefined
  var text: String
}

object Button {
  @scala.inline
  def apply(text: String, handler: js.Function = null): Button = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

