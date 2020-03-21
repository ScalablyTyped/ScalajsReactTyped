package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.alertdialog
import typingsJapgolly.gestalt.gestaltStrings.dialog
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var accessibilityCloseLabel: String
  var accessibilityModalLabel: String
  var children: js.UndefOr[Node] = js.undefined
  var footer: js.UndefOr[Node] = js.undefined
  var heading: String
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  def onDismiss(): Unit
}

object ModalProps {
  @scala.inline
  def apply(
    accessibilityCloseLabel: String,
    accessibilityModalLabel: String,
    heading: String,
    onDismiss: Callback,
    children: VdomNode = null,
    footer: VdomNode = null,
    role: alertdialog | dialog = null,
    size: sm | md | lg = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityCloseLabel = accessibilityCloseLabel.asInstanceOf[js.Any], accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any])
    __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

