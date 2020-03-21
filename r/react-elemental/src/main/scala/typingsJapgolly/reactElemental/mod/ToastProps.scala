package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  val accent: js.UndefOr[String] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    accent: String = null,
    children: VdomNode = null,
    color: String = null,
    style: CSSProperties = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
}

