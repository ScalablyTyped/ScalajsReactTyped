package typingsJapgolly.slateReact.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderNodeProps extends js.Object {
  var attributes: RenderAttributes
  var children: Node
  var editor: Editor
  var isFocused: Boolean
  var isSelected: Boolean
  var key: String
  var parent: typingsJapgolly.slate.mod.Node
  var readOnly: Boolean
}

object RenderNodeProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    parent: typingsJapgolly.slate.mod.Node,
    readOnly: Boolean,
    children: VdomNode = null
  ): RenderNodeProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderNodeProps]
  }
}

