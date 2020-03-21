package typingsJapgolly.diLite.DiLite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryEnum extends js.Object {
  def func[T](`type`: T, args: js.Any): T
}

object FactoryEnum {
  @scala.inline
  def apply(func: (js.Any, js.Any) => CallbackTo[js.Any]): FactoryEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("func")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => func(t0, t1).runNow()))
    __obj.asInstanceOf[FactoryEnum]
  }
}

