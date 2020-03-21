package typingsJapgolly.baseui.modalMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.AnonCloseSource
import typingsJapgolly.baseui.baseuiStrings.alertdialog
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.dialog
import typingsJapgolly.baseui.baseuiStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ AnonCloseSource, _]] = js.undefined
  var overrides: js.UndefOr[ModalOverrides] = js.undefined
  var role: js.UndefOr[dialog | alertdialog] = js.undefined
  var size: js.UndefOr[default_ | full | auto] = js.undefined
  var unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onClose: /* args */ AnonCloseSource => CallbackTo[js.Any] = null,
    overrides: ModalOverrides = null,
    role: dialog | alertdialog = null,
    size: default_ | full | auto = null,
    unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonCloseSource) => onClose(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_ModalBackdropScroll)) __obj.updateDynamic("unstable_ModalBackdropScroll")(unstable_ModalBackdropScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

