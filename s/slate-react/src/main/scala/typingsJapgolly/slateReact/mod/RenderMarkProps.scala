package typingsJapgolly.slateReact.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.mod.Annotation
import typingsJapgolly.slate.mod.Decoration
import typingsJapgolly.slate.mod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMarkProps extends RenderProps {
  var children: Node
  var mark: Mark
}

object RenderMarkProps {
  @scala.inline
  def apply(
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    mark: Mark,
    marks: Set_[Mark],
    node: typingsJapgolly.slate.mod.Node,
    offset: Double,
    text: String,
    children: VdomNode = null
  ): RenderMarkProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMarkProps]
  }
}

