package typingsJapgolly.bizcharts

import typingsJapgolly.antvG2.mod.Styles.background
import typingsJapgolly.antvG2.mod.Styles.line
import typingsJapgolly.bizcharts.mod.CrosshairsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: js.UndefOr[background | line] = js.undefined
  var `type`: js.UndefOr[CrosshairsType] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(style: background | line = null, `type`: CrosshairsType = null): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

