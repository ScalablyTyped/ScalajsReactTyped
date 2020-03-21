package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallExpression extends IASTSpan {
  var argumentList: ArgumentList
  var expression: AST
}

object ICallExpression {
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    argumentList: ArgumentList,
    end: CallbackTo[Double],
    expression: AST,
    start: CallbackTo[Double]
  ): ICallExpression = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], argumentList = argumentList.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[ICallExpression]
  }
}

