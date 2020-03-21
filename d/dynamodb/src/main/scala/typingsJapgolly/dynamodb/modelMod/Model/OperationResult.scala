package typingsJapgolly.dynamodb.modelMod.Model

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationResult extends js.Object {
  def get(name: String): js.Any
}

object OperationResult {
  @scala.inline
  def apply(get: String => CallbackTo[js.Any]): OperationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[OperationResult]
  }
}

