package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExpressionData extends js.Object {
  var `type`: ExpressionType
  def evaluate(scope: js.Any): js.Any
}

object BaseExpressionData {
  @scala.inline
  def apply(evaluate: js.Any => CallbackTo[js.Any], `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
}

