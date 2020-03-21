package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.bottom
import typingsJapgolly.exceljs.exceljsStrings.center
import typingsJapgolly.exceljs.exceljsStrings.centerContinuous
import typingsJapgolly.exceljs.exceljsStrings.distributed
import typingsJapgolly.exceljs.exceljsStrings.fill
import typingsJapgolly.exceljs.exceljsStrings.justify
import typingsJapgolly.exceljs.exceljsStrings.left
import typingsJapgolly.exceljs.exceljsStrings.ltr
import typingsJapgolly.exceljs.exceljsStrings.middle
import typingsJapgolly.exceljs.exceljsStrings.right
import typingsJapgolly.exceljs.exceljsStrings.rtl
import typingsJapgolly.exceljs.exceljsStrings.top
import typingsJapgolly.exceljs.exceljsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var horizontal: left | center | right | fill | justify | centerContinuous | distributed
  var indent: Double
  var readingOrder: rtl | ltr
  var shrinkToFit: Boolean
  var textRotation: Double | vertical
  var vertical: top | middle | bottom | distributed | justify
  var wrapText: Boolean
}

object Alignment {
  @scala.inline
  def apply(
    horizontal: left | center | right | fill | justify | centerContinuous | distributed,
    indent: Double,
    readingOrder: rtl | ltr,
    shrinkToFit: Boolean,
    textRotation: Double | vertical,
    vertical: top | middle | bottom | distributed | justify,
    wrapText: Boolean
  ): Alignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], textRotation = textRotation.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Alignment]
  }
}

