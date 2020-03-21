package typingsJapgolly.valerie.Valerie_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResultStatic extends js.Object {
  var passedInstance: ValidationResult
  // static method to create validatio failed message
  def createFailedResult(message: String): ValidationResult
}

object ValidationResultStatic {
  @scala.inline
  def apply(createFailedResult: String => CallbackTo[ValidationResult], passedInstance: ValidationResult): ValidationResultStatic = {
    val __obj = js.Dynamic.literal(passedInstance = passedInstance.asInstanceOf[js.Any])
    __obj.updateDynamic("createFailedResult")(js.Any.fromFunction1((t0: java.lang.String) => createFailedResult(t0).runNow()))
    __obj.asInstanceOf[ValidationResultStatic]
  }
}

