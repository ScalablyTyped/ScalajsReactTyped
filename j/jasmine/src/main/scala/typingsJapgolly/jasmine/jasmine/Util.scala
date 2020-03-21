package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def argsToArray(args: js.Any): js.Any
  def extend(destination: js.Any, source: js.Any): js.Any
  def formatException(e: js.Any): js.Any
  def htmlEscape(str: String): String
  def inherit(childClass: js.Function, parentClass: js.Function): js.Any
}

object Util {
  @scala.inline
  def apply(
    argsToArray: js.Any => CallbackTo[js.Any],
    extend: (js.Any, js.Any) => CallbackTo[js.Any],
    formatException: js.Any => CallbackTo[js.Any],
    htmlEscape: String => CallbackTo[String],
    inherit: (js.Function, js.Function) => CallbackTo[js.Any]
  ): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argsToArray")(js.Any.fromFunction1((t0: js.Any) => argsToArray(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => extend(t0, t1).runNow()))
    __obj.updateDynamic("formatException")(js.Any.fromFunction1((t0: js.Any) => formatException(t0).runNow()))
    __obj.updateDynamic("htmlEscape")(js.Any.fromFunction1((t0: java.lang.String) => htmlEscape(t0).runNow()))
    __obj.updateDynamic("inherit")(js.Any.fromFunction2((t0: js.Function, t1: js.Function) => inherit(t0, t1).runNow()))
    __obj.asInstanceOf[Util]
  }
}

