package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionStartCapFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object DiagramConnectionStartCapFill {
  @scala.inline
  def apply(color: String = null): DiagramConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionStartCapFill]
  }
}

