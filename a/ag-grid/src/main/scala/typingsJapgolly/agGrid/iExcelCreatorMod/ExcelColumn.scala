package typingsJapgolly.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelColumn extends js.Object {
  var width: Double
}

object ExcelColumn {
  @scala.inline
  def apply(width: Double): ExcelColumn = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcelColumn]
  }
}

