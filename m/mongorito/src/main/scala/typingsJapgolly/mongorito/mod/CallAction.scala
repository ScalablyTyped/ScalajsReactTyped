package typingsJapgolly.mongorito.mod

import typingsJapgolly.mongorito.AnonArgs
import typingsJapgolly.mongorito.mod.ActionTypes.CALL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallAction extends Action {
  var args: js.Array[AnonArgs]
  var method: String
  var `type`: CALL
}

object CallAction {
  @scala.inline
  def apply(args: js.Array[AnonArgs], method: String, `type`: CALL): CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAction]
  }
}

