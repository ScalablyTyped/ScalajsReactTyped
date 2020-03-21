package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorExecuteEvent extends EditorEvent {
  var command: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object EditorExecuteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Editor_,
    command: js.Any = null,
    name: String = null
  ): EditorExecuteEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorExecuteEvent]
  }
}

