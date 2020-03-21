package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.AnonLeft
import typingsJapgolly.exceljs.PartialColor
import typingsJapgolly.exceljs.exceljsStrings.angle
import typingsJapgolly.exceljs.exceljsStrings.gradient
import typingsJapgolly.exceljs.exceljsStrings.path
import typingsJapgolly.exceljs.exceljsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.exceljs.mod.FillPattern
  - typingsJapgolly.exceljs.mod.FillGradientAngle
  - typingsJapgolly.exceljs.mod.FillGradientPath
*/
trait Fill extends js.Object

object Fill {
  @scala.inline
  def FillPattern(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern, bgColor: PartialColor = null): Fill = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientAngle(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientPath(center: AnonLeft, gradient: path, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

