package typingsJapgolly.typeCheck

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeOf extends js.Object {
  var typeOf: String
  def validate(x: js.Any): js.Any
}

object AnonTypeOf {
  @scala.inline
  def apply(typeOf: String, validate: js.Any => CallbackTo[js.Any]): AnonTypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: js.Any) => validate(t0).runNow()))
    __obj.asInstanceOf[AnonTypeOf]
  }
}

