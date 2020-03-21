package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorError extends js.Object {
  // constructor(summary: string, detail: string);
  def getMessage(): ^
}

object ValidatorError {
  @scala.inline
  def apply(getMessage: CallbackTo[^]): ValidatorError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMessage")(getMessage.toJsFn)
    __obj.asInstanceOf[ValidatorError]
  }
}

