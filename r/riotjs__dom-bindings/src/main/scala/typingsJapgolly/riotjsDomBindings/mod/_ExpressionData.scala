package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExpressionData extends js.Object

object _ExpressionData {
  @scala.inline
  def AttributeExpressionData(evaluate: js.Any => CallbackTo[js.Any], name: String, `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
  @scala.inline
  def EventExpressionData(evaluate: js.Any => CallbackTo[js.Any], name: String, `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
  @scala.inline
  def TextExpressionData(childNodeIndex: Double, evaluate: js.Any => CallbackTo[js.Any], `type`: ExpressionType): _ExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: js.Any) => evaluate(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpressionData]
  }
}

