package typingsJapgolly.mdxJsReact.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDXProviderProps extends js.Object {
  var children: Node
  var components: MDXProviderComponentsProp
}

object MDXProviderProps {
  @scala.inline
  def apply(components: MDXProviderComponentsProp, children: VdomNode = null): MDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderProps]
  }
}

