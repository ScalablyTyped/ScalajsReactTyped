package typingsJapgolly.mongorito.mod

import typingsJapgolly.mongorito.mod.ActionTypes.INCREMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementAction extends Action {
  var fields: js.Object
  var `type`: INCREMENT
}

object IncrementAction {
  @scala.inline
  def apply(fields: js.Object, `type`: INCREMENT): IncrementAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementAction]
  }
}

