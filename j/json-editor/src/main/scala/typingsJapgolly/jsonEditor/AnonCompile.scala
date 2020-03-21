package typingsJapgolly.jsonEditor

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompile extends js.Object {
  def compile(template: String): js.Function1[/* vars */ js.Any, String]
}

object AnonCompile {
  @scala.inline
  def apply(compile: String => CallbackTo[js.Function1[/* vars */ js.Any, String]]): AnonCompile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compile")(js.Any.fromFunction1((t0: java.lang.String) => compile(t0).runNow()))
    __obj.asInstanceOf[AnonCompile]
  }
}

