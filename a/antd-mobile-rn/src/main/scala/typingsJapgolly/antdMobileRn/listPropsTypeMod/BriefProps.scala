package typingsJapgolly.antdMobileRn.listPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

