package typingsJapgolly.antdMobileRn.listItemNativeMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.AnonBrief
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typingsJapgolly.antdMobileRn.listPropsTypeMod.BriefProps {
  var styles: js.UndefOr[AnonBrief] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonBrief = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

