package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var iconClassNameLeft: js.UndefOr[String] = js.undefined
  var iconClassNameRight: js.UndefOr[String] = js.undefined
  var iconElementLeft: js.UndefOr[Element] = js.undefined
  var iconElementRight: js.UndefOr[Element] = js.undefined
  var iconStyleLeft: js.UndefOr[CSSProperties] = js.undefined
  var iconStyleRight: js.UndefOr[CSSProperties] = js.undefined
  var onLeftIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRightIconButtonClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onTitleClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var showMenuIconButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object AppBarProps {
  @scala.inline
  def apply(
    className: String = null,
    iconClassNameLeft: String = null,
    iconClassNameRight: String = null,
    iconElementLeft: VdomElement = null,
    iconElementRight: VdomElement = null,
    iconStyleLeft: CSSProperties = null,
    iconStyleRight: CSSProperties = null,
    onLeftIconButtonClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onRightIconButtonClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onTitleClick: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: VdomNode = null,
    titleStyle: CSSProperties = null,
    zDepth: Int | Double = null
  ): AppBarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft.asInstanceOf[js.Any])
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight.asInstanceOf[js.Any])
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft.rawElement.asInstanceOf[js.Any])
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight.rawElement.asInstanceOf[js.Any])
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft.asInstanceOf[js.Any])
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight.asInstanceOf[js.Any])
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onLeftIconButtonClick(t0).runNow()))
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onRightIconButtonClick(t0).runNow()))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onTitleClick(t0).runNow()))
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBarProps]
  }
}

