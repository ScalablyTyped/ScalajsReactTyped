package typingsJapgolly.tinymce.mod.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tinymce.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusBlurEvent extends Event {
  var blurredEditor: Editor
}

object FocusBlurEvent {
  @scala.inline
  def apply(
    blurredEditor: Editor,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: String,
    `type`: String
  ): FocusBlurEvent = {
    val __obj = js.Dynamic.literal(blurredEditor = blurredEditor.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusBlurEvent]
  }
}

