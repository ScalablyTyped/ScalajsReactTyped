package typingsJapgolly.baseui.drawerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.AnonCloseSource
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.full
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var anchor: js.UndefOr[left | right | top | bottom | String] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onBackdropClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ AnonCloseSource, _]] = js.undefined
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLElement], _]] = js.undefined
  var overrides: js.UndefOr[DrawerOverrides] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[default_ | full | auto | String] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    anchor: left | right | top | bottom | String = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBackdropClick: /* event */ ReactMouseEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onClose: /* args */ AnonCloseSource => CallbackTo[js.Any] = null,
    onEscapeKeyDown: /* event */ ReactKeyboardEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    overrides: DrawerOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    size: default_ | full | auto | String = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBackdropClick(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonCloseSource) => onClose(t0).runNow()))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEscapeKeyDown(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

