package typingsJapgolly.antDesignReactNative.listItemMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.PickListStyleBriefBriefTe
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typingsJapgolly.antDesignReactNative.listPropsTypeMod.BriefProps
     with WithThemeStyles[PickListStyleBriefBriefTe]

object BriefProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    style: StyleProp[TextStyle] = null,
    styles: Partial[PickListStyleBriefBriefTe] = null,
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

