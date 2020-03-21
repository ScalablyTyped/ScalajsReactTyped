package typingsJapgolly.valerie.Valerie_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var defaultOptions: ValidationOptions
  def test(value: js.Any): ValidationResult
}

object IRule {
  @scala.inline
  def apply(defaultOptions: ValidationOptions, test: js.Any => CallbackTo[ValidationResult]): IRule = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[IRule]
  }
}

