package typingsJapgolly.awesomplete

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplace extends js.Object {
  def replace(arg0: js.RegExp, arg1: String): Unit
}

object AnonReplace {
  @scala.inline
  def apply(replace: (js.RegExp, String) => Callback): AnonReplace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: js.RegExp, t1: java.lang.String) => replace(t0, t1).runNow()))
    __obj.asInstanceOf[AnonReplace]
  }
}

