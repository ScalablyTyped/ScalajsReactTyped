package typingsJapgolly.antDesignPro.footerToolbarMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterToolbarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: Node
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FooterToolbarProps {
  @scala.inline
  def apply(className: String = null, extra: VdomNode = null, style: CSSProperties = null): FooterToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterToolbarProps]
  }
}

