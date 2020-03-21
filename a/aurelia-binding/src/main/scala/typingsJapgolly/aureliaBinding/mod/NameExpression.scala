package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends js.Object {
  def createBinding(target: js.Any): Binding
}

object NameExpression {
  @scala.inline
  def apply(createBinding: js.Any => CallbackTo[Binding]): NameExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBinding")(js.Any.fromFunction1((t0: js.Any) => createBinding(t0).runNow()))
    __obj.asInstanceOf[NameExpression]
  }
}

