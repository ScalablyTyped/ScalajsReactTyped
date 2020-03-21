package typingsJapgolly.swiz.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var help: String
  var name: String
  def func(value: js.Any, baton: js.Any, callback: js.Function): Unit
}

object IValidator {
  @scala.inline
  def apply(func: (js.Any, js.Any, js.Function) => Callback, help: String, name: String): IValidator = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("func")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function) => func(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IValidator]
  }
}

