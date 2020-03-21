package typingsJapgolly.semanticUiReact.mountNodeMountNodeMod

import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMountNodeProps extends js.Object {
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** The DOM node where we will apply class names. Defaults to document.body. */
  var node: js.UndefOr[HTMLElement | Ref] = js.undefined
}

object StrictMountNodeProps {
  @scala.inline
  def apply(className: String = null, node: HTMLElement | Ref = null): StrictMountNodeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMountNodeProps]
  }
}

