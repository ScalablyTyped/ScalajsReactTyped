package typingsJapgolly.nopt.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeInfo extends js.Object {
  var `type`: js.Object
  def validate(data: CommandData, k: String, `val`: String): Boolean
}

object TypeInfo {
  @scala.inline
  def apply(`type`: js.Object, validate: (CommandData, String, String) => CallbackTo[Boolean]): TypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction3((t0: typingsJapgolly.nopt.mod.CommandData, t1: java.lang.String, t2: java.lang.String) => validate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeInfo]
  }
}

