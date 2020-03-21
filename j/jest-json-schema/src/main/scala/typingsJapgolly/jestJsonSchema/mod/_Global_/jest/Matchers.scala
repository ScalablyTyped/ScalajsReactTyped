package typingsJapgolly.jestJsonSchema.mod._Global_.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toBeValidSchema(): R
  def toMatchSchema(schema: js.Object): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeValidSchema: CallbackTo[R], toMatchSchema: js.Object => CallbackTo[R]): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBeValidSchema")(toBeValidSchema.toJsFn)
    __obj.updateDynamic("toMatchSchema")(js.Any.fromFunction1((t0: js.Object) => toMatchSchema(t0).runNow()))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

