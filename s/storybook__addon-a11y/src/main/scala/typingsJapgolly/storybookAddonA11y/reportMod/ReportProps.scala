package typingsJapgolly.storybookAddonA11y.reportMod

import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportProps extends js.Object {
  var empty: String
  var items: js.Array[Result]
  var `type`: RuleType
}

object ReportProps {
  @scala.inline
  def apply(empty: String, items: js.Array[Result], `type`: RuleType): ReportProps = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportProps]
  }
}

