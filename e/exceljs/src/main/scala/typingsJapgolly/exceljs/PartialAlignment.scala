package typingsJapgolly.exceljs

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

/* Inlined std.Partial<exceljs.exceljs.Alignment> */
trait PartialAlignment extends js.Object {
  var horizontal: js.UndefOr[left | center | right | fill | justify | centerContinuous | distributed] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var readingOrder: js.UndefOr[rtl | ltr] = js.undefined
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  var textRotation: js.UndefOr[Double | vertical] = js.undefined
  var vertical: js.UndefOr[top | middle | bottom | distributed | justify] = js.undefined
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object PartialAlignment {
  @scala.inline
  def apply(
    horizontal: left | center | right | fill | justify | centerContinuous | distributed = null,
    indent: Int | Double = null,
    readingOrder: rtl | ltr = null,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textRotation: Double | vertical = null,
    vertical: top | middle | bottom | distributed | justify = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): PartialAlignment = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit.asInstanceOf[js.Any])
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAlignment]
  }
}

