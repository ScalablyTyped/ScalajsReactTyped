package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  var childNodeIndex: Double
}

object TextExpressionData {
  @scala.inline
  def apply(childNodeIndex: Double, evaluate: js.Any => CallbackTo[js.Any], `type`: ExpressionType): TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpressionData]
  }
}

