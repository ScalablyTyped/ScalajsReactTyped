package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableRotateStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramEditableRotateStroke {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): DiagramEditableRotateStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableRotateStroke]
  }
}

