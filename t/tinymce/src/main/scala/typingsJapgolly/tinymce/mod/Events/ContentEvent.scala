package typingsJapgolly.tinymce.mod.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentEvent extends Event {
  var content: String
  var format: String
  var set: Boolean
}

object ContentEvent {
  @scala.inline
  def apply(
    content: String,
    format: String,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    set: Boolean,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: String,
    `type`: String
  ): ContentEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEvent]
  }
}

