package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Prompt
  def isDefaultPrevented(): Boolean
}

object PromptEvent {
  @scala.inline
  def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Prompt): PromptEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.asInstanceOf[PromptEvent]
  }
}

