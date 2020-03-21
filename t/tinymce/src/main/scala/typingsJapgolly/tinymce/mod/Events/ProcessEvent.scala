package typingsJapgolly.tinymce.mod.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.tinymce.tinymceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEvent extends Event {
  var content: String
  var forced_root_block: String
  var format: String
  var get: Boolean
  var get_inner: Boolean
  var node: Node
  var selection: `true`
}

object ProcessEvent {
  @scala.inline
  def apply(
    content: String,
    forced_root_block: String,
    format: String,
    get: Boolean,
    get_inner: Boolean,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    node: Node,
    preventDefault: Callback,
    selection: `true`,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: String,
    `type`: String
  ): ProcessEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], forced_root_block = forced_root_block.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], get_inner = get_inner.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEvent]
  }
}

