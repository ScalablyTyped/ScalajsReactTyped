package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator[V] extends js.Object {
  var hint: js.Promise[String | Null]
  def validate(value: V): js.Promise[Boolean]
}

object AsyncValidator {
  @scala.inline
  def apply[V](hint: js.Promise[String | Null], validate: V => CallbackTo[js.Promise[Boolean]]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: V) => validate(t0).runNow()))
    __obj.asInstanceOf[AsyncValidator[V]]
  }
}

