package typingsJapgolly.antdMobile.buttonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.antdMobile.antdMobileStrings.ghost
import typingsJapgolly.antdMobile.antdMobileStrings.large
import typingsJapgolly.antdMobile.antdMobileStrings.primary
import typingsJapgolly.antdMobile.antdMobileStrings.small
import typingsJapgolly.antdMobile.antdMobileStrings.warning
import typingsJapgolly.antdMobile.buttonPropsTypeMod.ButtonPropsType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends ButtonPropsType {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[Boolean | CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeClassName: String = null,
    activeStyle: Boolean | CSSProperties = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: VdomNode = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    prefixCls: String = null,
    role: String = null,
    size: large | small = null,
    style: CSSProperties = null,
    `type`: primary | warning | ghost = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

