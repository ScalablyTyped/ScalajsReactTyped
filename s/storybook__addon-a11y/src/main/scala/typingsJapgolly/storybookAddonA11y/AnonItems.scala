package typingsJapgolly.storybookAddonA11y

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.Array[Result]
  var label: Element
  var panel: Element
  var `type`: RuleType
}

object AnonItems {
  @scala.inline
  def apply(items: js.Array[Result], label: VdomElement, panel: VdomElement, `type`: RuleType): AnonItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawElement.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

