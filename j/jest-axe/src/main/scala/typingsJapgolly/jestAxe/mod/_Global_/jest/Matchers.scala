package typingsJapgolly.jestAxe.mod._Global_.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toHaveNoViolations(): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toHaveNoViolations: CallbackTo[R]): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toHaveNoViolations")(toHaveNoViolations.toJsFn)
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

