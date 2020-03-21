package typingsJapgolly.storybookComponents.badgeMod

import typingsJapgolly.storybookComponents.storybookComponentsStrings.critical
import typingsJapgolly.storybookComponents.storybookComponentsStrings.negative
import typingsJapgolly.storybookComponents.storybookComponentsStrings.neutral
import typingsJapgolly.storybookComponents.storybookComponentsStrings.positive
import typingsJapgolly.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps extends js.Object {
  var status: positive | negative | neutral | warning | critical = js.native
}

object BadgeProps {
  @scala.inline
  def apply(status: positive | negative | neutral | warning | critical): BadgeProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadgeProps]
  }
}

