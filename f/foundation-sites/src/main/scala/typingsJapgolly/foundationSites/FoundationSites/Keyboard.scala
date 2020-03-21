package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  def findFocusable($element: js.Object): js.Object
  def handleKey(event: js.Any, component: js.Any, functions: js.Any): Unit
  def parseKey(event: js.Any): String
}

object Keyboard {
  @scala.inline
  def apply(
    findFocusable: js.Object => CallbackTo[js.Object],
    handleKey: (js.Any, js.Any, js.Any) => Callback,
    parseKey: js.Any => CallbackTo[String]
  ): Keyboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findFocusable")(js.Any.fromFunction1((t0: js.Object) => findFocusable(t0).runNow()))
    __obj.updateDynamic("handleKey")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => handleKey(t0, t1, t2).runNow()))
    __obj.updateDynamic("parseKey")(js.Any.fromFunction1((t0: js.Any) => parseKey(t0).runNow()))
    __obj.asInstanceOf[Keyboard]
  }
}

