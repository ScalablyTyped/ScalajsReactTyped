package typingsJapgolly.rehypeReact.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RehypeReact extends js.Object {
  def Compiler(node: js.Any): js.Any
}

object RehypeReact {
  @scala.inline
  def apply(Compiler: js.Any => CallbackTo[js.Any]): RehypeReact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Compiler")(js.Any.fromFunction1((t0: js.Any) => Compiler(t0).runNow()))
    __obj.asInstanceOf[RehypeReact]
  }
}

