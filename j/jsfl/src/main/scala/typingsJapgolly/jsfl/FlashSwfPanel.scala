package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSwfPanel extends js.Object {
  var name: js.Any
  var path: js.Any
  def call(): js.Any
  def setFocus(): js.Any
}

object FlashSwfPanel {
  @scala.inline
  def apply(call: CallbackTo[js.Any], name: js.Any, path: js.Any, setFocus: CallbackTo[js.Any]): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("call")(call.toJsFn)
    __obj.updateDynamic("setFocus")(setFocus.toJsFn)
    __obj.asInstanceOf[FlashSwfPanel]
  }
}

