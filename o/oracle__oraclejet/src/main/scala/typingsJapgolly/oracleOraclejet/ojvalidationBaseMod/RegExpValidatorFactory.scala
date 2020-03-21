package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpValidatorFactory extends js.Object {
  def createValidator(options: ValidatorOptions): RegExpValidator
}

object RegExpValidatorFactory {
  @scala.inline
  def apply(createValidator: ValidatorOptions => CallbackTo[RegExpValidator]): RegExpValidatorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createValidator")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions) => createValidator(t0).runNow()))
    __obj.asInstanceOf[RegExpValidatorFactory]
  }
}

