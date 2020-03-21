package typingsJapgolly.jsSchema

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConstructor extends js.Object {
  def reference(func: js.Function): FunctionConstructor
}

object FunctionConstructor {
  @scala.inline
  def apply(reference: js.Function => CallbackTo[FunctionConstructor]): FunctionConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reference")(js.Any.fromFunction1((t0: js.Function) => reference(t0).runNow()))
    __obj.asInstanceOf[FunctionConstructor]
  }
}

