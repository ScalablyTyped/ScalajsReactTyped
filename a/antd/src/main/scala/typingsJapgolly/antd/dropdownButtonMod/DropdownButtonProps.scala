package typingsJapgolly.antd.dropdownButtonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.buttonButtonMod.ButtonHTMLType
import typingsJapgolly.antd.buttonGroupMod.ButtonGroupProps
import typingsJapgolly.antd.dropdownDropdownMod.Align
import typingsJapgolly.antd.dropdownDropdownMod.OverlayFunc
import typingsJapgolly.antd.dropdownDropdownMod.Placement
import typingsJapgolly.antd.sizeContextMod.SizeType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.antd.dropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps extends ButtonGroupProps {
  var align: js.UndefOr[Align] = js.undefined
  var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[Node], js.Array[Node]]] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var mouseEnterDelay: js.UndefOr[Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var overlay: Element | OverlayFunc
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
  var `type`: js.UndefOr[DropdownButtonType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DropdownButtonProps {
  @scala.inline
  def apply(
    overlay: Element | OverlayFunc,
    align: Align = null,
    buttonsRender: /* buttons */ js.Array[Node] => CallbackTo[js.Array[Node]] = null,
    children: VdomNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    href: String = null,
    htmlType: ButtonHTMLType = null,
    icon: VdomNode = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement = null,
    prefixCls: String = null,
    size: SizeType = null,
    style: CSSProperties = null,
    title: String = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    `type`: DropdownButtonType = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DropdownButtonProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (buttonsRender != null) __obj.updateDynamic("buttonsRender")(js.Any.fromFunction1((t0: /* buttons */ js.Array[japgolly.scalajs.react.raw.React.Node]) => buttonsRender(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonProps]
  }
}

