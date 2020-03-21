package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  var name: String
}

object AttributeExpressionData {
  @scala.inline
  def apply(evaluate: js.Any => CallbackTo[js.Any], name: String, `type`: ExpressionType): AttributeExpressionData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeExpressionData]
  }
}

