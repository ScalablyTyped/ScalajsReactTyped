package typingsJapgolly.antdMobile.navBarPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.dark
import typingsJapgolly.antdMobile.antdMobileStrings.light
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var icon: js.UndefOr[Node] = js.undefined
  var leftContent: js.UndefOr[Node] = js.undefined
  var mode: js.UndefOr[dark | light] = js.undefined
  var onLeftClick: js.UndefOr[MouseEventHandler[org.scalajs.dom.raw.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rightContent: js.UndefOr[Node] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLDivElement] = null,
    icon: VdomNode = null,
    leftContent: VdomNode = null,
    mode: dark | light = null,
    onLeftClick: ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    rightContent: VdomNode = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.rawNode.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeftClick != null) __obj.updateDynamic("onLeftClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onLeftClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

