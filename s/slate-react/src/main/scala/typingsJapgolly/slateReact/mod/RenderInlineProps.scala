package typingsJapgolly.slateReact.mod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.slate.mod.Inline
import typingsJapgolly.slate.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInlineProps extends RenderNodeProps {
  var node: Inline
}

object RenderInlineProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Inline,
    parent: Node,
    readOnly: Boolean,
    children: VdomNode = null
  ): RenderInlineProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInlineProps]
  }
}

