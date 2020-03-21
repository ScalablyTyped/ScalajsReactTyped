package typingsJapgolly.prosemirrorTestBuilder.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqMethod extends js.Object {
  def eq(param: EqMethod): Boolean
}

object EqMethod {
  @scala.inline
  def apply(eq: EqMethod => CallbackTo[Boolean]): EqMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eq")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorTestBuilder.mod.EqMethod) => eq(t0).runNow()))
    __obj.asInstanceOf[EqMethod]
  }
}

