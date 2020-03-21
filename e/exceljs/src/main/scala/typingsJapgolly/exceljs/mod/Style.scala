package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.PartialAlignment
import typingsJapgolly.exceljs.PartialBorders
import typingsJapgolly.exceljs.PartialFont
import typingsJapgolly.exceljs.PartialProtection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var alignment: PartialAlignment
  var border: PartialBorders
  var fill: Fill
  var font: PartialFont
  var numFmt: String
  var protection: PartialProtection
}

object Style {
  @scala.inline
  def apply(
    alignment: PartialAlignment,
    border: PartialBorders,
    fill: Fill,
    font: PartialFont,
    numFmt: String,
    protection: PartialProtection
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Style]
  }
}

