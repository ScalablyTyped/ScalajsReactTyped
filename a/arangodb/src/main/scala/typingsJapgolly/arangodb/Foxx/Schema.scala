package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var isJoi: Boolean
  def validate[T](value: T): ValidationResult[T]
}

object Schema {
  @scala.inline
  def apply(isJoi: Boolean, validate: js.Any => CallbackTo[ValidationResult[js.Any]]): Schema = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any])
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: js.Any) => validate(t0).runNow()))
    __obj.asInstanceOf[Schema]
  }
}

