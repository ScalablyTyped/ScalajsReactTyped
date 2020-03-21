package typingsJapgolly.reactNativeDialog.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var blurComponentIOS: js.UndefOr[Node] = js.undefined
  var buttonSeparatorStyle: js.UndefOr[ViewStyle] = js.undefined
  var children: js.Array[Node]
  var contentStyle: js.UndefOr[ViewStyle] = js.undefined
  var footerStyle: js.UndefOr[ViewStyle] = js.undefined
  var headerStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * default: false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    children: js.Array[Node],
    blurComponentIOS: VdomNode = null,
    buttonSeparatorStyle: ViewStyle = null,
    contentStyle: ViewStyle = null,
    footerStyle: ViewStyle = null,
    headerStyle: ViewStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (blurComponentIOS != null) __obj.updateDynamic("blurComponentIOS")(blurComponentIOS.rawNode.asInstanceOf[js.Any])
    if (buttonSeparatorStyle != null) __obj.updateDynamic("buttonSeparatorStyle")(buttonSeparatorStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

