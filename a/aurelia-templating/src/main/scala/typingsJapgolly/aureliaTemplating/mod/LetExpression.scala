package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetExpression extends js.Object {
  def createBinding(): LetBinding
}

object LetExpression {
  @scala.inline
  def apply(createBinding: CallbackTo[LetBinding]): LetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBinding")(createBinding.toJsFn)
    __obj.asInstanceOf[LetExpression]
  }
}

