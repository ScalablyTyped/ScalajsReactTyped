package typingsJapgolly.jestMatcherOneOf.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toBeOneOf(expected: js.Array[_]): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeOneOf: js.Array[js.Any] => CallbackTo[R]): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBeOneOf")(js.Any.fromFunction1((t0: js.Array[js.Any]) => toBeOneOf(t0).runNow()))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

