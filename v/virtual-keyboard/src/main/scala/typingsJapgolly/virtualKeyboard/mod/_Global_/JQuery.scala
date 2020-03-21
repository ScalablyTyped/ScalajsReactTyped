package typingsJapgolly.virtualKeyboard.mod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.virtualKeyboard.mod.KeyboardOptions
import typingsJapgolly.virtualKeyboard.mod.NavigateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def addNavigation(options: NavigateOptions): this.type
  def keyboard(options: KeyboardOptions): this.type
}

object JQuery {
  @scala.inline
  def apply(
    addNavigation: NavigateOptions => CallbackTo[JQuery],
    keyboard: KeyboardOptions => CallbackTo[JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNavigation")(js.Any.fromFunction1((t0: typingsJapgolly.virtualKeyboard.mod.NavigateOptions) => addNavigation(t0).runNow()))
    __obj.updateDynamic("keyboard")(js.Any.fromFunction1((t0: typingsJapgolly.virtualKeyboard.mod.KeyboardOptions) => keyboard(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

