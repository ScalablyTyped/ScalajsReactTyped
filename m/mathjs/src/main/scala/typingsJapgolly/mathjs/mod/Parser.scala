package typingsJapgolly.mathjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def clear(): scala.Unit
  def evaluate(expr: String): js.Any
  def get(variable: String): js.Any
  def getAll(): StringDictionary[js.Any]
  def set(variable: String, value: js.Any): scala.Unit
}

object Parser {
  @scala.inline
  def apply(
    clear: Callback,
    evaluate: String => CallbackTo[js.Any],
    get: String => CallbackTo[js.Any],
    getAll: CallbackTo[StringDictionary[js.Any]],
    set: (String, js.Any) => Callback
  ): Parser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("evaluate")(js.Any.fromFunction1((t0: java.lang.String) => evaluate(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

