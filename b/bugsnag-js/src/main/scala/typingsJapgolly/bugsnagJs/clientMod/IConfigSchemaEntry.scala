package typingsJapgolly.bugsnagJs.clientMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSchemaEntry extends js.Object {
  var message: String
  def defaultValue(): js.Any
  def validate(`val`: js.Any): Boolean
}

object IConfigSchemaEntry {
  @scala.inline
  def apply(defaultValue: CallbackTo[js.Any], message: String, validate: js.Any => CallbackTo[Boolean]): IConfigSchemaEntry = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultValue")(defaultValue.toJsFn)
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: js.Any) => validate(t0).runNow()))
    __obj.asInstanceOf[IConfigSchemaEntry]
  }
}

