package typingsJapgolly.antdMobile.tabBarMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.tabBarPropsTypeMod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTabbarProps extends TabBarProps {
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var noRenderContent: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
}

object AntTabbarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    barTintColor: String = null,
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    placeholder: VdomNode = null,
    prefixCls: String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarPosition: top | bottom = null,
    tintColor: String = null,
    unselectedTintColor: String = null
  ): AntTabbarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTabbarProps]
  }
}

