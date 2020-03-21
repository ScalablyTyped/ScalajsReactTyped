package typingsJapgolly.reactHighlightJs.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Content that will be highlighted
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var language: String
}

object HighlightProps {
  @scala.inline
  def apply(language: String, children: VdomNode = null): HighlightProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

