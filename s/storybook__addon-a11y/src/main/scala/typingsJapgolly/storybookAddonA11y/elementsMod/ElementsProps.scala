package typingsJapgolly.storybookAddonA11y.elementsMod

import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsProps extends js.Object {
  var elements: js.Array[NodeResult]
  var `type`: RuleType
}

object ElementsProps {
  @scala.inline
  def apply(elements: js.Array[NodeResult], `type`: RuleType): ElementsProps = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsProps]
  }
}

